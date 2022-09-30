package easy;

class SumDivisorCountSolution {
    public int solution(int left, int right) {
        int answer = 0;
        int tmpCount = 0;

        for(int i=left; i<=right; i++) {
            tmpCount = 0;

            for(int j=1; j<=i/2; j++){
                if(i%j == 0) {
                    tmpCount++;
                }
            }
            answer = (tmpCount % 2 == 0) ? answer-i : answer+i;
        }

        return answer;
    }
}

public class SumDivisorCount {
    public static void main(String[] args) {
        SumDivisorCountSolution solution = new SumDivisorCountSolution();
        System.out.println(solution.solution(13,17));
    }
}
