package SingleTon;

public class SynchronizedSingleTon  implements Cloneable{
	private static volatile SynchronizedSingleTon instance ;
	
	private SynchronizedSingleTon() {
	//to avoid reflection, constructor works only first time
		if(instance !=null) {
			throw new RuntimeException("Object already created");
		}
	}
	
	//to avoid deserialization
	protected Object readResolve() {
		return instance;
	}
	
	//to avoid clone
	public Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException();
	}
	
	public static SynchronizedSingleTon getInstance() {
		
		//first null check, improve the performance, 
		//otherwise, it will lock all the thread to 
		//create instance, even there is already one instance
		if(instance==null) {  
			synchronized(SynchronizedSingleTon.class){			
				//it is possible to create multiple instance
				//thread1 is null, create one, thread2 may create other one
				if(instance==null) { 
					instance = new SynchronizedSingleTon();
				}
			}
			
		}
		return instance;
	}

}
