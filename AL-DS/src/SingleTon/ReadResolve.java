package SingleTon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Road implements Serializable {
	int x = 12;
	int y = 13;
	transient int z = 14;
	private static Road road;

	private Road() {

	}

	public static Road getInstance() {
		if (road == null) {
			road = new Road();
		}
		return road;
	}
	
	//deserialzation will internally use this method
	//with the method, transient is not working
	//get the road, not r, which is different object
	protected Object readResolve() {
		return road;
	}

}

public class ReadResolve {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Road road = Road.getInstance();
		try (ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("Long.txt"));) {
			obj.writeObject(road); // serialization
		}

		Road r = null;

		try (ObjectInputStream obj = new ObjectInputStream(new FileInputStream("Long.txt"));) {
			r = (Road) obj.readObject(); // deserialziation
			System.out.println("the values are: " + r.x + " " + r.y + " " + r.z);
			System.out.println(road.hashCode() == r.hashCode());
		}
	}
}
