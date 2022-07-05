package sort;

import java.util.Arrays;

public class InsertSort {
    public int[] sort(int[] array) {
        int tmp;
        int a;

        for (int i=1; i< array.length; i++) {
            a = i;

            while (a > 0) {
                if (array[a-1] > array[a]) {
                    tmp = array[a];
                    array[a] = array[a - 1];
                    array[a - 1] = tmp;
                }
                a--;
            }
            System.out.println(Arrays.toString(array));
        }

        return array;
    }
    public static void main(String[] args) {
        int[] array = {50,80,70,10,60,20,40,30};
        InsertSort test = new InsertSort();
        int[] sortArray = test.sort(array);
        System.out.println(Arrays.toString(sortArray));
    }
}
