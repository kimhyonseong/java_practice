package easy;

class BetweenSumSolution {
    public long solution(int a, int b) {
        long answer = 0;

        /*
        if(a==b) answer = a;
        else {
            int tmp;

            if(a > b) {
                tmp = a;
                a = b;
                b = tmp;
            }
            for(int i=a; i<=b; i++) {
                answer += i;
            }
        }*/
        for (int i=Math.min(a,b); i<=Math.max(a,b); i++) {
            answer += i;
        }
        return answer;
    }
}

public class BetweenSum {
    public static void main(String[] args) {
        BetweenSumSolution solution = new BetweenSumSolution();
        long answer = solution.solution(10,1);
        System.out.println(answer);
    }
}
