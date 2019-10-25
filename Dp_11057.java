// 역시나 오버플로우 조심!!
import java.util.*;

public class Dp_11057 {
    private static int[][] dp;
    private static final int MOD = 10007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new int[n+1][10];
        System.out.println(solve(n));
    }

    private static int solve(int x) {
        int sum = 0;

        for(int i=0; i<=9; i++) {
            dp[1][i] = 1;
        }

        for(int i=2; i<=x; i++) {
            for(int j=0; j<=9; j++) {
                for(int k=0; k<=j; k++) {
                    dp[i][j] += dp[i-1][k];
                    dp[i][j] %= MOD;
                }
            }
        }

        for(int i=0; i<=9; i++) {
            sum += dp[x][i];
            sum %= MOD;
        }

        return sum;
    }
}
