package easy;

import java.util.Locale;

class LowUpperSolution {
    public String solution(String s) {
        String answer = "";

        for(int i=0; i<s.length(); i++) {
            System.out.println(s.charAt(i));
            answer += (i%2==1) ? String.valueOf(s.charAt(i)).toUpperCase()
                    : String.valueOf(s.charAt(i)).toLowerCase();
        }

        return answer;
    }
}

public class LowUpper {
    public static void main(String[] args) {
        LowUpperSolution solution = new LowUpperSolution();
        System.out.println(solution.solution("try hello world"));
    }
}
