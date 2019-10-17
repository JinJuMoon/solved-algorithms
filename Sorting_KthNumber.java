// https://programmers.co.kr/learn/courses/30/lessons/42748

import java.util.*;

class Solution {
    public static int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++) {
            int a = commands[i][0] - 1;
            int b = commands[i][1];
            int c = commands[i][2];

            int[] tmp = new int[b-a];
            System.arraycopy(array, a, tmp, 0, b-a);
            Arrays.sort(tmp);
            answer[i] = tmp[c-1];
        }
        return answer;
    }
}