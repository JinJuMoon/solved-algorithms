// https://programmers.co.kr/learn/courses/30/lessons/42576

import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap nameMap = new HashMap();

        for(String name :  participant) {
            if(!nameMap.containsKey(name)) {
                nameMap.put(name, new Integer(1));
            } else {
                int i = (int)nameMap.get(name);
                nameMap.replace(name, new Integer(++i));
            }
        }

        for(String name : completion) {
            if(nameMap.containsKey(name)) {
                int i = (int)nameMap.get(name);
                nameMap.replace(name, --i);
                if( i == 0 ) {
                    nameMap.remove(name);
                }
            } else {
                System.out.println("해당 이름이 존재하지 않습니다.");
            }
        }

        Set nameSet = nameMap.keySet();
        Iterator it = nameSet.iterator();

        while(it.hasNext()) {
            answer = (String)it.next();
        }
        return answer;
    }
}