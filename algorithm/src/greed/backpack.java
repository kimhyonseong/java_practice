package greed;

import java.util.Arrays;
import java.util.Comparator;

class Backpack1 {
    int[][] arr = {
            {10,10},
            {15,12},
            {20,10},
            {25,8},
            {30,5}
    };
    double totalValue = 0;
    double weight;

    Backpack1() {}
    Backpack1(double weight) {
        this.weight = weight;
        this.sort();
        this.fill();
    }

    private void sort() {
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                int result;

                if(((float) o1[1]/o1[0]) > ((float) o2[1]/o2[0])) {
                    result = -1;
                } else if (((float) o1[1]/o1[0]) == ((float) o2[1]/o2[0])) {
                    result = Integer.compare(o1[0], o2[0]);
                } else {
                    result = 1;
                }
                System.out.println(o1[1]+"/"+o1[0]+"="+(float) o1[1]/o1[0]);
                System.out.println(o2[1]+"/"+o2[0]+"="+(float) o2[1]/o2[0]);
                System.out.println("result = "+result);
                System.out.println();
                return result;
            }
        });

        System.out.println(Arrays.deepToString(arr));
    }

    private void fill() {
        for (int[] firstVal : arr){
            if (weight - firstVal[0] >= 0) {
                weight -= firstVal[0];
                totalValue += firstVal[1];
            } else {
                double tmp = weight / firstVal[0];
                weight -= firstVal[0]*tmp;
                totalValue += firstVal[1]*tmp;
            }
        }
    }

    public void print() {
        System.out.println("가치 : "+totalValue);
        System.out.println("남은 무게 : "+weight);
    }
}

public class backpack {
    public static void main(String[] args) {
        Backpack1 backpack = new Backpack1(40);
        backpack.print();
    }
}
