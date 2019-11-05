import java.util.*;

public class Dp_11054 {
    static int n;
    static int[] arr;
    static int[][] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        dp = new int[3][n];

        for(int i=0; i<n;i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++) {
            dp[1][i] = getIncreasingLongest(i) + 1;

        }

        for(int i=n-1; i>=0; i--) {
            dp[2][i] = getDecreasingLongest(i) + 1;
        }

        for(int i=0; i<n; i++) {
            dp[0][i] = dp[1][i] + dp[2][i] -1;
        }

        System.out.println(getAnswer());
    }

    public static int getIncreasingLongest(int i) {
        int longest = 0;
        for(int j=0; j<i; j++) {
            if(arr[j]<arr[i] && dp[1][j]>=longest) {
                longest = dp[1][j];
            }
        }
        return longest;
    }

    public static int getDecreasingLongest(int i) {
        int longest = 0;
        for(int j=n-1; j>i; j--) {
            if(arr[j]<arr[i] && dp[2][j]>=longest) {
                longest = dp[2][j];
            }
        }
        return longest;
    }

    public static int getAnswer() {
        Arrays.sort(dp[0]);
        return dp[0][dp[0].length-1];
    }
}