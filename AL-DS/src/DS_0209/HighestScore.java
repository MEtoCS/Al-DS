package DS_0209;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class HighestScore {
	// input: n=2 h ={4,5} output: 4*5=20
	//input: n =3 h={1,2,3} output: 11
	// first stack 1*3 = 3, score= 3, h =4 {2,4}
	//sceond stack 2*4=8, score =3+ 8 =11
	
	public static void main(String[] args) {
		int n = 3;
		int[] h = {1,2,3,4};
		int res = HighestScore.highestScore(n, h);
		System.out.println(res);
	}
	
	public static int highestScore(int n, int[] input) {
		Arrays.sort(input);
		Deque<Integer> dq = new ArrayDeque<>();
		for(int i: input) {
			dq.offerFirst(i);
		}
//		int[] temp = new int[n];
		int score = 0;
//		int size = dq.size();
//		int first = 0;
//		int last = 0;
		while(dq.size()>2) {
			
				int first = dq.peekLast( ) != null? dq.pollLast( ):1;
				int last = dq.peekFirst( ) != null? dq.pollFirst( ):1;
				int curScore = first*last;
				dq.offerLast(first+last);
				score += curScore;

		}
		int lastFirst = dq.pollFirst();
		int lastSecond = dq.pollFirst();
		score += (lastFirst*lastSecond);
		return score;
		
	}

}
