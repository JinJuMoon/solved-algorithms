// https://programmers.co.kr/learn/courses/30/lessons/42587'
import java.util.*;

class Document {
    int location;
    int priority;
    
    public Document(int location, int priority) {
        this.location = location;
        this.priority = priority;
    }
}

class Solution {
    public static int printed = 0;
    
    public int solution(int[] priorities, int location) {
        
        Queue<Document> q = new LinkedList<Document>();
        
        for(int i=0; i<priorities.length; i++) {
            q.offer(new Document(i, priorities[i]));
        }
        
        loop1 : while(!q.isEmpty()) {
            Document doc = q.poll();
            
            if(q.isEmpty()) {
                return ++printed;
            }
            
            for(Document docInList : q) {
                if(doc.priority < docInList.priority) {
                    q.offer(doc);
                    continue loop1;
                }
            }
            
            printed++;
            if(doc.location == location) {
                return printed;
            }
        }
        return 0;
    }
}