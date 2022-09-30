package easy;

class StrIsIntSolution {
    public boolean solution(String s) {
        boolean answer = true;
        String[] tmp = s.split("");

        if(tmp.length == 4 || tmp.length == 6) {
            for(int i=0, len=tmp.length; i<len; i++) {
                if(tmp[i].charAt(0) < '0' || '9' < tmp[i].charAt(0)) {
                    answer = false;
                    break;
                }
            }
        } else {
            answer = false;
        }

        return answer;
    }
}

public class StrIsInt {
    public static void main(String[] args) {
        StrIsIntSolution solution = new StrIsIntSolution();
        System.out.println(solution.solution("a123"));
        System.out.println(solution.solution("0123"));
    }
}
