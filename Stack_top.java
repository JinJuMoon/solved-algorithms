// https://programmers.co.kr/learn/courses/30/lessons/42588

import java.util.Stack;

class Solution {
    public static int[] solution(int[] heights) {
        int[] gets = new int[heights.length];
        Stack<Integer> send = new Stack<Integer>();
        for(int height: heights) {
            send.push(height);
        }
        for(int i=heights.length-1; i>=0;i--) {
            int signalTop = send.pop();
            for(int j=i-1;j>=0;j--) {
                if(heights[j]>signalTop) {
                    gets[i]=j+1;
                    break;
                }
                if(j==0) {
                    gets[i]=0;
                }
            }
        }
        return gets;
    }
}