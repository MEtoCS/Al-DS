package DS_0217;

public class ReverseString {
	public static void main(String[] args) {
		String input = "abcd";
		ReverseString obj1 = new ReverseString();
		String result = obj1.reverse(input);
		System.out.println(result);
	}
	private String reverse(String str) {
		if(str ==null || str.length()<=1) {
			return str;
		}
		char[] charArray = str.toCharArray();
		int left = 0;
		int right = charArray.length-1;
		while(left < right) {
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			
			left++;
			right--;
		}
		return new String(charArray);
	}

}
