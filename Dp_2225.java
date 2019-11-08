import java.util.*;

public class Dp_2225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(solve(n,k));
    }

    public static int solve(int n, int k) {
        int[][] memo = new int[n+1][k+1];
        for(int m=0; m<=n; m++) {
            memo[m][1] = 1;
            for(int l=2; l<k; l++) {
                for(int x=0; x<=m; x++) {
                    memo[m][l] += memo[m-x][l-1];
                    memo[m][l] %= 1_000_000_000;
                }
            }
            if(m==n) {
                for(int x=0; x<=m; x++) {
                    memo[m][k] += memo[m-x][k-1];
                    memo[m][k] %= 1_000_000_000;
                }
            }
        }
        return memo[n][k];
    }
}