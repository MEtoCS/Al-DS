package DS_0210;

public class MinDistinct {
	public static void main(String[] args) {
//		Input : A[] = {l0, 5, 40}
//    B[] = {50, 90, 80} 
//   Output : 10
		
//		Input : A[] = {l, 3, 15, 11, 2}
//    B[] = {23, 127, 235, 19, 8} 
//Output : 3 
		MinDistinct obj1 = new MinDistinct();
		int[] one = {1,3,15,11,2};
		int[] two = {23, 127, 235, 19, 8};
		int res = obj1.min(one, two);
		System.out.println(res);
	}
	
	private int min(int[] one, int[] two) {
		
		int min = Integer.MAX_VALUE;
		for(int i =0;i< one.length; i++) {
			for(int j = 0; j < two.length; j++) {
				int cur = Math.abs(one[i]-two[j]);
				if(cur < min) {
					min = cur;
				}
			}
		}
		
		return min;
	}
	

}
