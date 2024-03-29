package easy;

class StrToIntSolution {
    public int solution(String s) {
        int intForm = 0;
        //String[] arr = String.valueOf(s).split("");
        int extra = 1;

        for(int i=0;i<s.length(); i++) {
            if(s.charAt(i) == '+') {
                extra = 1;
                continue;
            }
            if(s.charAt(i) == '-') {
                extra = -1;
                continue;
            }

            intForm = intForm *10 + (s.charAt(i) - '0');
            System.out.println(intForm);
        }
        intForm *= extra;

        return intForm;
    }
}

public class StrToInt {
    public static void main(String[] args) {
        StrToIntSolution solution = new StrToIntSolution();

        int result = solution.solution("-1234");
        System.out.println(result);
    }
}
