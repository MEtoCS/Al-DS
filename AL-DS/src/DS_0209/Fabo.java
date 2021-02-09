package DS_0209;

public class Fabo {
	public static void main(String[] args) {
		int input = 9;
		Fabo obj1 = new Fabo();
		int res = obj1.fibo(input);
		System.out.println("The result: "+res);
	}
	
	private int fibo(int n) {
		
		int[] dp = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		
		for(int i = 2; i<=n ; i++) {
			dp[i] = dp[i-1]+dp[i-2];
			System.out.println(dp[i]);
		}
		return dp[n];
	}
	
	private int fibo2(int n) {
		int count1 = 0;
		int count2 = 1;
		int count = 0;
		for(int i =2; i<=n; i++) {
			count = count1 + count2;
			count1 = count2;
			count2 = count;
			
		}
		return count;
	}

}
