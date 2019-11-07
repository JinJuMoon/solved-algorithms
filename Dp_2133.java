import java.util.*;

public class Dp_2133 {
    static int[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new int[n+1];
        dp[0] = 1;
        System.out.println(solve(n));
    }

    public static int solve(int n) {
        if(n%2==1) {
            return 0;                                   // n이 홀수인 경우 불가
        }
        if(dp[n]!=0) {
            return dp[n];
        }
        if(n==2) {
            return dp[2] = 3;
        }
        dp[n] = solve(n-2)*3;
        for(int i=4; i<=n; i+=2) {
            dp[n] += solve(n-i)*2;
        }
        return dp[n];
    }
}