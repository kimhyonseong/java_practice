package sort;

import java.util.Arrays;

public class InsertSort {
    public int[] sort(int[] array) {
        int tmp;
        int a;

        /*
        for (int i=1; i< array.length; i++) {
//            a = i;
//            while (a > 0) {
//                if (array[a-1] > array[a]) {
//                    tmp = array[a];
//                    array[a] = array[a - 1];
//                    array[a - 1] = tmp;
//                }
//                a--;
//            }

            a = i-1;
            int target = array[i];

            while (a >= 0 && (target < array[a])) {
                array[a+1] = array[a];
                a--;
            }
            array[a+1] = target;
            System.out.println(Arrays.toString(array));

        }*/

        int target;
        int targetIndex;

        for (int i=1; i<array.length; i++) {
            target = array[i];
            targetIndex = i-1;

            while (targetIndex >= 0 && (target < array[targetIndex])) {
                array[targetIndex+1] = array[targetIndex];
                targetIndex--;
            }
            array[targetIndex+1] = target;
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
