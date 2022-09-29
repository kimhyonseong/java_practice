package easy;

import java.util.Arrays;

class DividedIntArrSolution {
    DividedIntArrSolution() {}

    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int[] tmpArr = new int[arr.length];
        int count = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] % divisor == 0) {
                tmpArr[count] = arr[i];
                count++;
            }
        }

        if(count == 0) {
            answer = new int[] {-1};
        } else {
            answer = new int[count];

            for(int i=0; i<count; i++) {
                answer[i] = tmpArr[i];
            }

            int target;
            int targetIndex;

            for(int i=1; i<count; i++) {
                target = answer[i];
                targetIndex = i;

                while(target < answer[targetIndex-1] && targetIndex > 0) {
                    answer[targetIndex] = answer[targetIndex-1];
                    answer[targetIndex-1] = target;
                    targetIndex--;
                }
            }
        }
        return answer;
    }
}

public class DividedIntArr {
    public static void main(String[] args) {
        DividedIntArrSolution solution = new DividedIntArrSolution();
        System.out.println(Arrays.toString(solution.solution(new int[]{3,2,6}, 10)));

    }
}
