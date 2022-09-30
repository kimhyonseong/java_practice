package easy;

class AddNumArrSolution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i=0,leng=absolutes.length; i<leng; i++) {
            if(!signs[i]) absolutes[i] *= -1;
            answer += absolutes[i];
        }

        return answer;
    }
}

public class AddNumArr {
    public static void main(String[] args) {
        AddNumArrSolution solution = new AddNumArrSolution();
        System.out.println(solution.solution(new int[]{4,7,12},new boolean[]{true,false,true}));
    }
}
