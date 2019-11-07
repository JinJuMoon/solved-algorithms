import java.util.*;

public class Dp_9461 {
    static long[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            int k = sc.nextInt();
            dp = new long[k+1];
            System.out.println(recursive(k));
        }
    }

    public static long recursive(int n) {
        if(dp[n]!=0) {
            return dp[n];
        }
        if(n==1 || n==2 || n==3) {
            return dp[n]=1;
        }
        if(n==4 || n==5) {
            return dp[n]=2;
        }
        return dp[n]=recursive(n-1)+recursive(n-5);
    }
}