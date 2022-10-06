package easy;

import java.util.*;

class GreedyStealSolution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] arr = new int[n+1];

        Arrays.fill(arr,1);
        arr[0] = 0;

        for(int i=0; i<reserve.length; i++) {
            arr[reserve[i]] = 2;
        }

        for(int i=0; i<lost.length; i++) {
            arr[lost[i]] -= 1;
        }

        for(int i=1; i<=n; i++) {
            if(arr[i] == 2 && arr[i-1] == 0 && (i-1 != 0)) {
                arr[i] -= 1;
                arr[i-1] += 1;
            }
            if(arr[i] == 2 && i != n && arr[i+1] == 0) {
                arr[i] -= 1;
                arr[i+1] += 1;
            }
        }

        System.out.println(Arrays.toString(arr));

        for(int i=1; i<=n; i++) {
            if(arr[i] > 0) {
                answer++;
            }
        }

        return answer;
    }
}

public class GreedySteal {
    public static void main(String[] args) {
        GreedyStealSolution solution = new GreedyStealSolution();

        System.out.println(solution.solution(5,new int[]{2,4},new int[]{1,3,5}));
    }
}
