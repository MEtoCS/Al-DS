package DS_0209;

public class LargestBlock {
	public static void main(String[] args) {
		String input = "hoopla";
		String input1 = "abbccccddbbbxxx";
		String input2 = "";
		LargestBlock obj1 = new LargestBlock();
		int res = obj1.largestBlock(input2);
		System.out.println(res);
	}
	public int largestBlock(String str) {
		if(str == null || str.length() ==0) {
			return 0;
		}
		char[] array = str.toCharArray();
		
		int maxB = 1;
		int temp = 1;
		for(int i =0; i< array.length; i++) {
			if(i< array.length -1 && array[i] == array[i+1]) {
				temp++;
			}else {
				temp =1;
			}
			maxB = Math.max(maxB, temp);
		}
		
		return maxB;
		
	}

}
