import java.util.*;

public class Dp_1699 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n));
        // (19,3) , (7, 4), (11, 3)
    }

    public static int solve(int n) {
        int[] dp = new int[n+1];
        dp[1] = 1;
        for(int i=2; i<=n; i++) {
            dp[i] = i;
            for(int j=1; j*j<=i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j*j] + 1);
            }
        }
        return dp[n];
    }
}