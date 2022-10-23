package easy;

import java.util.*;

class ExSearch {
    public int[] solution(int[] answers) {
        int[] answer;
        int[] p1 = {1, 2, 3, 4, 5};
        int p1Cnt = 0;
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int p2Cnt = 0;
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int p3Cnt = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0,len=answers.length; i<len; i++) {
            if(p1[i%p1.length] == answers[i]) {
                p1Cnt++;
            }
            if(p2[i%p2.length] == answers[i]) {
                p2Cnt++;
            }
            if(p3[i%p3.length] == answers[i]) {
                p3Cnt++;
            }
        }

        int max = Math.max(Math.max(p1Cnt,p2Cnt),p3Cnt);

        if(max==p1Cnt) arr.add(1);
        if(max==p2Cnt) arr.add(2);
        if(max==p3Cnt) arr.add(3);

        answer = new int[arr.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = arr.get(i);
        }

        return answer;
    }
}

public class ExhaustiveSearch {
    public static void main(String[] args) {
        ExSearch search = new ExSearch();
        System.out.println(Arrays.toString(search.solution(new int[]{1,3,2,4,2})));
    }
}
