import java.util.Scanner;

public class Dp_11727 {
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n+1];
        System.out.println(dp(n));
        sc.close();
    }

    private static int dp(int x) {
        if(x==1) return 1;
        if(x==2) return 3;
        if(arr[x]!=0) return arr[x];
        return arr[x]=(dp(x-1)+dp(x-2)*2)%10007;
    }
}
