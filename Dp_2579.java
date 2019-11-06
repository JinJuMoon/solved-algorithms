import java.util.*;

public class Dp_2579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solve(n, arr));
    }

    public static int solve(int n, int[] arr) {
        int[] dp = new int[n];
        if(n>=1) {
            dp[0] = arr[0];
        }
        if(n>=2) {
            dp[1] = arr[0] + arr[1];
        }
        if(n>=3) {
            dp[2] = Math.max(arr[0], arr[1]) + arr[2];
        }
        for(int i=3; i<n; i++) {
            dp[i] = Math.max(dp[i-3]+arr[i-1], dp[i-2]) + arr[i];
        }
        return dp[n-1];
    }
}