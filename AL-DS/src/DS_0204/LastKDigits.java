package DS_0204;

public class LastKDigits {
//	Input  : a[] = {22, 31, 44, 27, 37, 43}
//	Output : 56
//	Input  : a[] = {24, 7, 144, 77, 29, 19}
//	Output : 84

	public static void main(String[] args) {
		int[] input = {24, 7, 144, 77, 29, 19};
		LastKDigits obj1 = new LastKDigits();
		int res = obj1.lastKDigits(input, 2);
		System.out.println(res);
	}
	
	private int lastKDigits(int[] input, int k) {
		if(k> input.length) {
			return 0;
		}
		int result =1;
		for(int i =0; i< input.length;i++) {
			result*=input[i];
		}
		int nums = (int)Math.pow(10,k);
		
		return result%nums;
	}

}
