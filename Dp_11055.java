import java.util.*;

public class Dp_11055 {
    static int n;
    static int[] numbers;
    static int[] sumMax;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        numbers = new int[n];
        sumMax = new int[n];

        for(int i=0; i<n;i++) {
            numbers[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++) {
            sumMax[i] = getLargest(i) + numbers[i];
        }

        System.out.println(getAnswer());
    }

    public static int getLargest(int i) {
        int max = 0;
        for(int j=0; j<i; j++) {
            if(numbers[j]<numbers[i] && sumMax[j]>=max) {
                max = sumMax[j];
            }
        }
        return max;
    }

    public static int getAnswer() {
        int answer = 0;
        for(int i : sumMax) {
            if(i>answer) {
                answer = i;
            }
        }
        return answer;
    }
}