package level2;

import java.util.*;

class CommonMulSolution {
    public int solution(int[] arr) {
        int min = 1;
        
        Arrays.sort(arr);
        
        for(int i=0; i<arr.length-1; i++) {
            for(int j=Math.max(arr[i],arr[i+1]); j>=1; j--) {
                if(arr[i]%j==0 && arr[i+1]%j==0) {
                    min = j;
                    break;
                }
            }
            arr[i+1] = (arr[i] * arr[i+1])/min;
        }

        return arr[arr.length-1];
    }
}

class MulTestCase {
    int[] arr;
    int result;

    MulTestCase() {}

    public void setObj(int[] arr, int result) {
        this.arr = arr;
        this.result = result;
    }

    public void testCase() {
        CommonMulSolution common = new CommonMulSolution();
        System.out.println(result == common.solution(arr));
    }

    public void testCase(int i) {
        CommonMulSolution common = new CommonMulSolution();
        System.out.println(i+"번째 : "+(result == common.solution(arr)));
    }
}

public class CommonMul {
    public static void main(String[] args) {
        int[][] arr = {
                {2,6,8,14},
                {1,2,3}
        };

        int[] result = {168,6};

        MulTestCase mul = new MulTestCase();

        for (int i=0; i<arr.length; i++) {
            mul.setObj(arr[i],result[i]);
            mul.testCase(i+1);
        }
    }
}