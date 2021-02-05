package DS_0204;

public class CheckSubstring {
	public static void main(String[] args) {
		String str1 ="for";
		String str2 = "agafrfaf";
		CheckSubstring obj1 = new CheckSubstring();
		String res = obj1.isSubstring(str1, str2);
		System.out.println(res);
	}
	
	private String isSubstring(String str1, String str2) {
		if(str1.length()> str2.length()) {
			return "No";
		}
		int s1Len = str1.length(); //2
		int s2Len = str2.length();//3
		
		for(int i = 0 ; i<= s2Len - s1Len; i++ ) {
			if(str1.equals(str2.substring(i, i+s1Len))){
				return "Yes";
			}
	
		}
		return "No";	
	}

}
