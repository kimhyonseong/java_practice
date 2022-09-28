package greed;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Atm {
    int[][] timeArr;
    int totalTime;
    Atm() {}
    Atm(int num,int[] arr) {
        setTime(num,arr);
        sort();
        sumTime(num);
    }

    private void setTime(int num,int[] arr) {
        timeArr = new int[num][2];

        for(int i=0; i<num; i++) {
            timeArr[i][1] = arr[i];
        }
    }

    private void sort() {
        Arrays.sort(timeArr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[1], o2[1]);
            }
        });

        System.out.println(Arrays.deepToString(timeArr));
    }

    private void sumTime(int num) {
        int tmp = totalTime;

        for (int i=0; i<num; i++) {
            tmp += timeArr[i][1];
            totalTime += tmp;
        }
    }

    public void print() {
        System.out.println("최소 시간 : "+totalTime);
    }
}

class Atm2 {
    int[] timeArr;
    int totalTime;
    Atm2() {}
    Atm2(int num,int[] arr) {
        setTime(arr);
        sort();
        sumTime(num);
    }

    private void setTime(int[] arr) {
        timeArr = arr;
    }

    private void sort() {
        Arrays.sort(timeArr);

        System.out.println(Arrays.toString(timeArr));
    }

    private void sumTime(int num) {
        int tmp = totalTime;

        for (int i=0; i<num; i++) {
            tmp += timeArr[i];
            totalTime += tmp;
        }
    }

    public void print() {
        System.out.println("최소 시간 : "+totalTime);
    }
}

public class atmTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.nextLine();
        String b = scanner.nextLine();

        String[] arr = b.split(" ");
        int[] values = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();


        System.out.println(a);
        System.out.println(Arrays.toString(values));

        Atm2 atm = new Atm2(a, values);
        atm.print();
    }
}
