import java.util.Scanner;

public class Dp_9095 {
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
            int x = sc.nextInt();
            arr = new int[x+1];
            System.out.println(dp(x));
            arr = null;
        }
        sc.close();
    }

    private static int dp(int x) {
        if(x==1) return 1;
        if(x==2) return 2;
        if(x==3) return 4;
        if(arr[x] != 0) return arr[x];
        return arr[x]=dp(x-3)+dp(x-2)+dp(x-1);
    }
}
