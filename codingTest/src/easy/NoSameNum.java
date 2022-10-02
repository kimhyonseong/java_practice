package easy;

import java.util.*;

class NoSameNumSolution {
    public int[] solution(int []arr) {
        int[] answer = new int[arr.length];
        int tmp = -1;
        int count = 0;

        for(int i=0; i<arr.length; i++) {
            if(tmp != arr[i]) {
                tmp = arr[i];
                answer[count] = tmp;
                count++;
            }
        }

        int[] result = Arrays.copyOfRange(answer,0,count);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(Arrays.toString(result));

        return result;
    }
}

public class NoSameNum {
    public static void main(String[] args) {
        NoSameNumSolution solution = new NoSameNumSolution();
        System.out.println(Arrays.toString(solution.solution(new int[]{1, 1, 3, 3, 0, 1, 1})));
    }
}
