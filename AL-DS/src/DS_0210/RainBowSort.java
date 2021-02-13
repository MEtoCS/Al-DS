package DS_0210;

import java.util.Arrays;

public class RainBowSort {
	public static void main(String[] args) {
//		Input: 1 1 1 0 2 2 1 0
		//    zero: [0, zero) :0
		//    two: (two, end= length of input] : 2
		//    check: [check, two] : unknown [0--> end]
		//			if(value(check)== 0)
		
//		Output: 0 0 1 1 1 1 2 2
		RainBowSort obj1 = new RainBowSort();
		int[] input = {1,1,1,0,2,2,1,0};
		obj1.sort(input);
		System.out.println(Arrays.toString(input));
		
	}
	private void sort(int[] input) {
		int zero =0;
		int two = input.length-1;
		int check = 0;
		while( check < two) {
			if(input[check] ==1) {
				check++;
			}else if(input[check] ==0) {
				swap( input, zero, check);
				zero++;
				check++;
			}else if(input[check] ==2) {
				swap(input, check, two);
				two--;
			}
		}
		
		
	}
	
	private void swap(int[] input, int x, int y) {
		int temp = input[x];
		input[x] = input[y];
		input[y] = temp;
	}

}
