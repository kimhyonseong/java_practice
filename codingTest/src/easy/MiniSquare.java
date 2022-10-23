package easy;

import java.util.*;
class MiniSquareSolution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxW = 0;
        int maxH = 0;

        for(int[] sortSize : sizes) {
            Arrays.sort(sortSize);

            maxW = Math.max(maxW, sortSize[0]);
            maxH = Math.max(maxH, sortSize[1]);
        }
        answer = maxW*maxH;

        return answer;
    }
}

public class MiniSquare {
    public static void main(String[] args) {
        MiniSquareSolution solution = new MiniSquareSolution();
        System.out.println(solution.solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
    }
}
