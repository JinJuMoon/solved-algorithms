import java.util.*;

public class Dp_11722 {
    static int n;
    static int[] arr;
    static int[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        dp = new int[n];

        for(int i=0; i<n;i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++) {
            dp[i] = getLongest(i) + 1;
        }

        System.out.println(getAnswer());
    }

    public static int getLongest(int i) {
        int longest = 0;
        for(int j=0; j<i; j++) {
            if(arr[j]>arr[i] && dp[j]>=longest) {
                longest = dp[j];
            }
        }
        return longest;
    }

    public static int getAnswer() {
        Arrays.sort(dp);
        return dp[dp.length-1];
    }
}