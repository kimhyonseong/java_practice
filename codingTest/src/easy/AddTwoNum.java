package easy;

import java.util.*;

class AddTwoNumSolution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> arr = new ArrayList<>();
        int[] answer;

        //Arrays.sort(numbers);
        System.out.println("numbers : "+Arrays.toString(numbers));

        for(int i=0; i<numbers.length-1; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                //System.out.println(numbers[i]+numbers[j]);
                if(!arr.contains(numbers[i]+numbers[j])) {
                    arr.add(numbers[i]+numbers[j]);
                }
            }
        }

        answer = arr.stream().mapToInt(i->i).sorted().toArray();
        return answer;
    }
}

public class AddTwoNum {
    public static void main(String[] args) {
        AddTwoNumSolution solution = new AddTwoNumSolution();
        System.out.println(Arrays.toString(solution.solution(new int[]{2,1,3,4,1})));
    }
}
