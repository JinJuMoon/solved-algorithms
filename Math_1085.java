import java.util.*;

public class Math_1085 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int w = s.nextInt();
        int h = s.nextInt();
        System.out.println(solve(x,y,w,h));
    }

    public static int solve(int x, int y, int w, int h) {
        return Math.min(Math.min(w-x, h-y), Math.min(x,y));
    }
}