package DS_0209;

public class LargestBlockBuilding {
	public static void main(String[] args) {

		int[] leftV = {4,2,3};
		int[] frontV = {3,2,3,4};
//		
		LargestBlockBuilding obj1 = new LargestBlockBuilding();
		int res = obj1.largest(leftV, frontV);
		System.out.println(res);		
	}
	private int largest(int[] left, int[] right) {
		int max = 0;
		for(int i : left) {
			for(int j : right) {
				max +=Math.min(i, j);
			}
		}
		return max;
	}

}
