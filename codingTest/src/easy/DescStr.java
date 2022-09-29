package easy;

class DescStrSolution {
    public String solution(String s) {
        String answer = "";
        String[] tmp = s.split("");

        for (int i=0; i< tmp.length; i++){
            answer += tmp[i];
        }

        for (int i=0; i<tmp.length-1; i++) {
            for(int j=0; j< tmp.length-1; j++) {
                if ((int)answer.charAt(j) < (int)answer.charAt(j + 1)) {
                    answer = answer.substring(0,j)+answer.charAt(j + 1)+answer.charAt(j)+answer.substring(j+2);
                    System.out.println(answer);
                }
            }
        }

        return answer;
    }
}

public class DescStr {
    public static void main(String[] args) {
        DescStrSolution solution = new DescStrSolution();
        System.out.println(solution.solution("Zbcdefg"));
    }
}
