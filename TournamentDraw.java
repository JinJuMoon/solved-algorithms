public class TournamentDraw {
    public static void main(String[] args) {
        int n = 8;
        int a = 3;
        int b = 3;
        System.out.println(solution(n,a,b));
    }


    public static int solution(int n, int a, int b) {
        // 대진표의 깊이
        int depth = logB(n, 2);
        int round =0;

        for(int i=0; i<depth; i++) {
            a = (int)Math.ceil(a/2.0);          // 토너먼트 1회 승리했을 때 새로 부여받는 번호
            b = (int)Math.ceil(b/2.0);

            if(a==b) {
                round = i+1;               // 승리했을 때 부여받는 번호가 같으므로 서로 만난 경우
                break;
            }
        }
        return round;
    }

    public static int logB(double x, double base) {
        return (int)(Math.log10(x) / Math.log10(base));
    }
}