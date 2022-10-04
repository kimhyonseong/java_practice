package easy;

import java.util.*;

class SortStringSolution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};

        Arrays.sort(strings,new Comparator<String>() {
            @Override
            public int compare(String i1, String i2) {
                int result = (int)i1.charAt(n) - (int)i2.charAt(n);

                if(result == 0) {
                    result = i1.compareTo(i2);
                }

                return result;
            }
        });

        return strings;
    }
}

public class SortString {
    public static void main(String[] args) {
        SortStringSolution solution = new SortStringSolution();
        System.out.println(Arrays.toString(solution.solution(new String[]{"sun", "bed", "car"},1)));

    }
}
