import java.util.*;

public class RemoveInCouple {
    public static void main(String[] args) {
        String s = "baabaa";
        System.out.println(solution(s));
    }


    public static int solution(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(!stack.isEmpty() && stack.peek()==c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty()? 1 : 0;
    }
}