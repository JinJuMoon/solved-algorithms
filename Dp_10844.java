// 항상 값의 오버플로우 주의할 것!

import java.util.Scanner;

public class Dp_10844 {
    private static final int MOD = 1_000_000_000;
    static long[][] dp;
    static int answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        dp = new long[n+1][10];
        System.out.println(dp(n));
    }

    private static int dp(int n) {
        for(int i=1; i<=9; i++) {
            dp[1][i]= 1;
        }

        for(int i=2; i<=n; i++) {
            for(int j=0; j<=9; j++) {
                if(j==0) dp[i][j] = dp[i-1][j+1] % MOD;
                else if(j==9) dp[i][j] = dp[i-1][j-1] % MOD;
                else dp[i][j] = (dp[i-1][j-1]+dp[i-1][j+1]) % MOD;
            }
        }

        for(int i=0; i<=9; i++) {
            answer += dp[n][i];
            answer %= MOD;
        }

        return answer;
    }
}
