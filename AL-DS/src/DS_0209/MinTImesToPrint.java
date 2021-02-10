package DS_0209;

public class MinTImesToPrint {
	public static void main(String[] args) {
		int layer = 7; //10
		int plain =3; //5
		int res = MinTImesToPrint.mintimes(layer, plain);
		System.out.println(res);
	}
	
	public static int mintimes(int n, int k) {
		int times = 0;		
		while(n>0) {
			n-=k;
			times++;
		}		
		return times;
		
	}

}
