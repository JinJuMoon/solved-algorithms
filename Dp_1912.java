import java.util.*;

public class Dp_1912 {
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
        int[] dp = new int[n];                        // n번째 자리까지의 가장 큰 연속합
        dp[0] = arr[0];                               // 0번째 자리 초기화
        for(int i=1; i<n; i++) {
            dp[i] = Math.max(0,dp[i-1]) + arr[i];     // n-1번째 자리가 음수가 아닌 경우 dp[i-1] + arr[i]
        }

        int max = dp[0];
        for(int i=1; i<n; i++) {
            if(dp[i]>max) {                           // 각 자리의 가장 큰 연속합들 중 최대값 구하기
                max = dp[i];
            }
        }
        return max;
    }
}