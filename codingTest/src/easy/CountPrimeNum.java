package easy;

import java.util.*;

class PrimeSolution {
    public int solution(int n) {
        int answer = 0;
        /*
        boolean tmp = true;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);

        for(int i=3; i<=n; i++) {
            tmp = true;

            for(int j=0,len=arr.size(); j<len; j++) {
                if(i%arr.get(j) == 0) {
                    tmp = false;
                    break;
                }
            }

            if(tmp) {
                arr.add(i);
            }
        }*/
        boolean[] arr = new boolean[n+1];
        Arrays.fill(arr,true);

        arr[0] = arr[1] = false;

        for(int i=2; i<=n; i++) {
            if(arr[i]) {
                for(int j=i+i; j<=n; j+=i) {
                    arr[j] = false;
                }
            }
        }

        for(int i=0,len=arr.length; i<len; i++) {
            if(arr[i]) {
                answer++;
            }
        }

        return answer;
    }
}

public class CountPrimeNum {
    public static void main(String[] args) {
        PrimeSolution solution = new PrimeSolution();
        System.out.println(solution.solution(10));
    }
}
