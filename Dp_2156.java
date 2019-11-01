import java.util.*;

public class Dp_2156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] wine = new int[n+1];
        for(int i=1; i<=n; i++) {
            wine[i] = sc.nextInt();
        }

        System.out.println(solve(n, wine));
    }

    public static int solve(int n, int[] wine) {
        int[] memo = new int[n+1];
        memo[0] = 0;

        if(n>=1) {
            memo[1] = wine[1];
        }

        if(n>=2) {
            memo[2] = memo[1]+wine[2];
        }

        for(int i=3; i<=n; i++) {
            int a = memo[i-3] + wine[i-1] + wine[i];
            int b = memo[i-2] + wine[i];
            int c = memo[i-1];
            memo[i] = max(a,b,c);
        }
        return memo[n];
    }

    public static int max(int a, int b, int c) {
        if(b>c) {
            if(a>b) {
                return a;
            }
            return b;
        }
        if(a>c) {
            return a;
        }
        return c;
    }
}