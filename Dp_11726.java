//Bottom-up 방식은 런타임 오류 발생, Top-down 방식으로 해결

import java.util.*;

public class Dp_11726 {
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n+1];

        System.out.println(dp(n));
        sc.close();
    }

    private static int dp(int n) {
        if(n==1) return 1;
        if(n==2) return 2;
        if(arr[n] != 0) return arr[n];
        return arr[n] = (dp(n-1)+dp(n-2)) % 10007;
    }
}