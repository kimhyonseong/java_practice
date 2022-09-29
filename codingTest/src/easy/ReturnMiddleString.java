package easy;

class ReturnMiddleStringSolution {
    public String solution(String s) {
        String answer = "";

        System.out.println(s.length());

        /*
        String valueOf = String.valueOf(s.charAt(s.length() / 2));
        if(s.length() % 2 == 1) {
            answer = valueOf;
        } else {
            answer = String.valueOf(s.charAt(s.length()/2 -1)) + valueOf;
        }*/
        answer = s.substring((s.length() -1)/2,(s.length()/2)+1);
        return answer;
    }
}

public class ReturnMiddleString {
    public static void main(String[] args) {
        ReturnMiddleStringSolution solution = new ReturnMiddleStringSolution();
        System.out.println(solution.solution("qwer"));
    }
}
