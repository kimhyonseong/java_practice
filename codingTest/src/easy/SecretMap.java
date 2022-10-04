package easy;

import java.util.Arrays;

class SecretMapSolution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        /*
        int tmp1;
        int tmp2;
        int count;

        for(int i=0; i<n; i++) {
            tmp1 = arr1[i];
            tmp2 = arr2[i];
            count = 0;
            answer[i] = "";

            while(count < n) {
                answer[i] = (tmp1%2==1 || tmp2%2==1 ? "#":" ") + answer[i];
                tmp1 /= 2;
                tmp2 /= 2;
                count++;
            }
        }*/
        String form = "%"+n+"s";

        for(int i=0; i<n; i++){
            answer[i] = String.format(form,Integer.toBinaryString(arr1[i] | arr2[i]));
            answer[i] = answer[i].replaceAll("1","#");
            answer[i] = answer[i].replaceAll("0"," ");

        }

        return answer;
    }
}

public class SecretMap {
    public static void main(String[] args) {
        SecretMapSolution solution = new SecretMapSolution();
        System.out.println(Arrays.toString(solution.solution(5,new int[]{9, 20, 28, 18, 11},new int[]{30, 1, 21, 17, 28})));
    }
}
