package easy;

import java.util.Arrays;

class findKimSolution {
    public String solution(String[] seoul) {
        String answer = "";

        /*
        for(int i=0; i<seoul.length; i++) {
            System.out.println(seoul[i]);

            if(seoul[i].equals("Kim")) {
                answer = "김서방은 "+i+"에 있다";
                break;
            }
        }*/
        int pos = Arrays.asList(seoul).indexOf("Kim");
        answer = "김서방은 "+pos+"에 있다";
        return answer;
    }
}

public class findKim {
    public static void main(String[] args) {
        findKimSolution findKimSolution = new findKimSolution();
        System.out.println(findKimSolution.solution(new String[]{"Jane", "Kim"}));
    }
}
