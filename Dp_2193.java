import java.util.Scanner;

public class Dp_2193 {
    static long[][] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        dp = new long[n+1][2];
        System.out.println(solve(n));
    }

    private static long solve(int x) {
        long sum = 0;

        dp[1][1] = 1;
        if(x==1) return 1;
        dp[2][0] = 1;
        if(x==2) return 1;

        for(int i=3; i<=x; i++) {
            dp[i][0] = dp[i-1][0] + dp[i-1][1];
            dp[i][1] = dp[i-1][0];
        }

        sum += dp[x][0] + dp[x][1];
        return sum;
    }
}
