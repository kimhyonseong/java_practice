package binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108};

        int left = 0;
        int right = array.length-1;
        int mid = (left+right)/2;

        int target = 85;

        int tmp = array[mid];
        boolean find = false;

        while (left <= right) {
            if (target == tmp) {
                find = true;
                break;
            } else if (target < tmp) {
                right = mid-1;
            } else {
                left=mid+1;
            }
            mid = (left+right)/2;
            tmp = array[mid];
        }

        if (find) {
            System.out.println(target+"은 "+(mid+1)+"번째에 있음");
        } else {
            System.out.println(target+"은 찾을 수 없습니다.");
        }
    }
}
