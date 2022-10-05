package easy;

import java.util.*;
class SelectMonsSolution {
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        HashSet<Integer> arrHash = new HashSet<>();

        for(int i=0,len=nums.length; i<len; i++) {
            /*
            if(!arr.contains(nums[i])) {
                arr.add(nums[i]);
            }
             */
            arrHash.add(nums[i]);
        }

        //answer = Math.min(arr.size(), (nums.length / 2));
        answer = Math.min(arrHash.size(), (nums.length / 2));
        return answer;
    }
}
public class SelectMons {
    public static void main(String[] args) {
        SelectMonsSolution solution = new SelectMonsSolution();
        System.out.println(solution.solution(new int[]{3,1,2,3}));
    }
}
