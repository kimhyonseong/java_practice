package easy;

class CollatzSolution {
    public int solution(int num) {
        int answer = -1;

        for(int i=0; i<500; i++) {
            if(num == 1) {
                answer = i;
                break;
            }
            if(num % 2 == 0) num/=2;
            else if(num % 2 == 1) num = num*3+1;
        }

        return answer;
    }
}

public class Collatz {
    public static void main(String[] args) {
        CollatzSolution solution = new CollatzSolution();
        System.out.println(solution.solution(6));
        System.out.println(solution.solution(16));
        System.out.println(solution.solution(626331));
    }
}
