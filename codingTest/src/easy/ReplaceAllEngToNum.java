package easy;

class ReplaceSolution {
    public int solution(String s) {
        int answer = 0;
        String[] number = {"zero","one","two","three",
                "four","five","six","seven","eight","nine"};

        for(int i=0; i<number.length; i++) {
            s = s.replaceAll(number[i],String.valueOf(i));
        }

        answer = Integer.parseInt(s);

        return answer;
    }
}

public class ReplaceAllEngToNum {
    public static void main(String[] args) {
        ReplaceSolution solution = new ReplaceSolution();
        System.out.println(solution.solution("2three45sixseven"));
    }
}
