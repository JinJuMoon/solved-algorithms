import java.util.Scanner;

public class Dp_1463 {
    private static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n+1];
        arr[0] = arr[1] = 0;
        for(int i=2; i<=n; i++) {
            dp(i);
        }
        System.out.println(arr[n]);
        sc.close();
    }

    private static void dp(int i) {
        arr[i] = arr[i-1]+1;
        if(i%2==0) arr[i] = Math.min(arr[i], arr[i/2]+1);
        if(i%3==0) arr[i] = Math.min(arr[i], arr[i/3]+1);
    }
}