package easy;

class NotIncludeNumSolution {
    public int solution(int[] numbers) {
        /*
        int answer = 0;
        int[] standard = new int[]{0,1,2,3,4,5,6,7,8,9};
        for(int i=0;i<standard.length; i++) {
            answer += standard[i];
        }
         */
        int answer = 45;

        for(int i=0,len = numbers.length; i<len; i++) {
            answer -= numbers[i];
        }

        return answer;
    }
}

public class NotIncludeNum {
    public static void main(String[] args) {
        NotIncludeNumSolution solution = new NotIncludeNumSolution();
        System.out.println(solution.solution(new int[]{1,2,3,4,6,7,8,0}));
    }
}
