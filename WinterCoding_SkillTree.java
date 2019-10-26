import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        boolean[] results = new boolean[skill_trees.length];
        int count = 0;

        Loop1 :
        for(int i=0; i<skill_trees.length; i++) {
            Queue skillQueue = new LinkedList();
            for(char c : skill.toCharArray()) {
                skillQueue.offer(c);
            }

            Queue userQueue = new LinkedList();
            int n = skill_trees[i].length();
            for(char c : skill_trees[i].toCharArray()) {
                userQueue.offer(c);
            }

            Loop2:
            for(int j=0; j<n; j++) {
                Object o = userQueue.poll();
                if (skillQueue.contains(o) == true) {
                    if (skillQueue.poll() != o) {
                        results[i] = false;
                        break Loop2;
                    }
                }
                results[i] = true;
            }
        }


        for(boolean b : results) {
            if(b==true) {
                count++;
            }
        }
        return count;
    }
}