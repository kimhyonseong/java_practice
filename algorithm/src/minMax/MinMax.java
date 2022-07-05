package minMax;

public class MinMax {
    public static void main(String[] args) {
        int[] array = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};
        int min = array[0];
        int max = array[0];
        int minPos = 0;
        int maxPos = 0;

        for (int i = 0; i<array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                minPos = i;
            }
            if (max < array[i]) {
                max = array[i];
                maxPos = i;
            }
        }

        System.out.println("최솟값은 "+(minPos+1)+"번째 "+min);
        System.out.println("최대값은 "+(maxPos+1)+"번째 "+max);
    }
}
