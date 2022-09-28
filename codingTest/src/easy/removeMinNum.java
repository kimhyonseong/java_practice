package easy;

import java.util.Arrays;
import java.util.Comparator;

class removeMinNumSolution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];

        int target = arr[0];
        int targetIndex = 0;

        for(int i=1; i< arr.length; i++) {
            if((arr[i-1] - arr[i]) < 0) {
                targetIndex = i-1;
                target = arr[i-1];
            } else {
                targetIndex = i;
                target = arr[i];
            }
        }

        System.out.println("targetIndex : "+targetIndex);
        System.out.println("target : "+target);

        for(int i=targetIndex; i< arr.length; i++) {
            arr[i] = arr[i+1];
        }

        for(int i=0; i<answer.length; i++) {
            answer[i] = arr[i];
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
