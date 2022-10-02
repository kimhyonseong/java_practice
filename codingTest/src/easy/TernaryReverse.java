package easy;

import java.util.*;

class TernaryReverseSolution {
    public int solution(int n) {
        int answer = 0;
        int tmp = 0;
        int pow = 0;
        ArrayList<Integer> tmpArr = new ArrayList<>();

        while(n >= 1) {
            tmpArr.add(n%3);
            n /= 3;
            pow++;
        }

        for(int i=0; i<tmpArr.size(); i++) {
            answer += tmpArr.get(i)*(int)Math.pow(3,tmpArr.size()-(i+1));
        }

        System.out.println(tmpArr);

        return answer;
    }
}

public class TernaryReverse {
    public static void main(String[] args) {
        TernaryReverseSolution solution = new TernaryReverseSolution();
        System.out.println(solution.solution(45));
    }
}
