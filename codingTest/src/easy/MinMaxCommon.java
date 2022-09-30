package easy;

import java.util.Arrays;

class MinMaxCommonSolution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        for(int i=1; i<=Math.max(n,m)/2; i++) {
            if(n % i == 0 && m % i == 0) {
                answer[0] = i;
            }
        }

        answer[1] = (n/answer[0] * m/answer[0])*answer[0];

        return answer;
    }
}

public class MinMaxCommon {
    public static void main(String[] args) {
        MinMaxCommonSolution solution = new MinMaxCommonSolution();
        System.out.println(Arrays.toString(solution.solution(24, 36)));
    }
}
