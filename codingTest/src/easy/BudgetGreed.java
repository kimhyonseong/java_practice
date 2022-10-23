package easy;
import java.util.*;

class BudgetGreedSolution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        for(int i=0; i<d.length; i++) {
            budget -= d[i];

            if(budget >= 0) {
                answer++;
            }
        }
        return answer;
    }
}

public class BudgetGreed {
    public static void main(String[] args) {
        BudgetGreedSolution solution = new BudgetGreedSolution();
        System.out.println(solution.solution(new int[]{1,3,2,5,4},9));
    }
}
