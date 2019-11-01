import java.util.*;

public class Dp_11053 {
    static int n;
    static int maxLength;
    static int[] array;
    static int[] memo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        array = new int[n];
        for(int i=0; i<n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println(solve());
    }

    public static int solve() {
        maxLength = 0;
        memo = new int[n];

        for(int i=0; i<n; i++) {
            memo[i] = getLongest(i) + 1;
            if(memo[i] > maxLength) {
                maxLength = memo[i];
            }
        }

        return maxLength;
    }

    public static int getLongest(int k) {
        int longest = 0;
        for(int i=0; i<k; i++) {
            if(array[i] < array[k]) {
                if (memo[i] > longest) {
                    longest = memo[i];
                }
            }
        }
        return longest;
    }
}