package easy;

class CaesarCipherSolution {
    public String solution(String s, int n) {
        String answer = "";
        String[] tmp = s.split("");

        for(int i=0; i<tmp.length; i++) {
            if(tmp[i].equals(" ")) {
                answer += " ";
            }

            if('a' <= tmp[i].charAt(0) && tmp[i].charAt(0) <= 'z') {
                if((char)((int)tmp[i].charAt(0)+n%26) > 'z') {
                    answer += String.valueOf((char)((int)tmp[i].charAt(0)+n%26-26));
                } else {
                    answer += String.valueOf((char)((int)tmp[i].charAt(0)+n%26));
                }
            }

            if('A' <= tmp[i].charAt(0) && tmp[i].charAt(0) <= 'Z') {
                if((char)((int)tmp[i].charAt(0)+n%26) > 'Z') {
                    answer += String.valueOf((char)((int)tmp[i].charAt(0)+n%26-26));
                } else {
                    answer += String.valueOf((char)((int)tmp[i].charAt(0)+n%26));
                }
            }
        }

        return answer;
    }
}

public class CaesarCipher {
    public static void main(String[] args) {
        CaesarCipherSolution solution = new CaesarCipherSolution();
        System.out.println(solution.solution("AB",1));
    }
}
