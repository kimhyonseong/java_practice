package easy;

import java.util.Arrays;

class removeMinNumSolution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];

        if (answer.length == 0) {
            answer = new int[]{-1};
        } else {
            int min = Arrays.stream(arr).sorted().toArray()[0];
            int index = -1;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == min) index = i;
            }

            System.out.println("min : "+min);
            System.out.println("index : "+index);

            for (int i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }

            for (int i = 0; i < answer.length; i++) {
                answer[i] = arr[i];
            }
        }

        return answer;
    }
}

public class removeMinNum {
    public static void main(String[] args) {
        removeMinNumSolution removeMinNumSolution = new removeMinNumSolution();
        System.out.println(Arrays.toString(removeMinNumSolution.solution(new int[]{4, 3, 2, 1})));
    }
}
