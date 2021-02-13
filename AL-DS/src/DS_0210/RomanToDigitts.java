package DS_0210;

public class RomanToDigitts {
	public static void main(String[] args) {
//		I -> 1
//		V -> 5
//		X ->10
//		L -> 50
//		C ->100
//		D-> 500
//		M-> 1000
		
//		MCMIV -> 1904,  XXVII -> 27
		RomanToDigitts obj1 = new RomanToDigitts();
		String str = "MCMIV";
		int res = obj1.romanTodigits(str);
		System.out.println(res);

	}
	
	private int romanTodigits(String str) {
		char[] charArray = str.toCharArray();
		int res = 0;
		
		for(int i =0; i < charArray.length; i++) {
			int c1= CharToInt(charArray[i]);
			if(i+1 < charArray.length) {
				int c2 = CharToInt(charArray[i+1]);
				if(c1 >= c2) {
					res = res + c1;
				}else {
					res = res+ c2- c1;
					i++;
				}
				
			}else {
				res = res + c1;
			}
		}
		return res;
		
	}
	
	private int CharToInt(char c) {
		if(c == 'I') {
			return 1;
		}else if(c == 'V') {
			return 5;
		}else if(c == 'X') {
			return 10;
		}else if(c == 'L') {
			return 50;
		}else if(c == 'C') {
			return 100;
		}else if(c == 'V') {
			return 5;
		}else if(c == 'D') {
			return 500;
		}else if(c == 'M') {
			return 1000;
		}else {
			return -1;
		}
	}

}
