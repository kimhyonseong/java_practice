package sort;

public class HeapSort {
    int[] array;
    int SIZE;

    public HeapSort() {
        SIZE = 0;
        array = new int[50];
    }

    public void insertHeap(int num) {
        int i =++SIZE;

        // 1 20 30 10
        while ((i != 0) && (num < array[i/2])) {
            array[i] = array[i/2];
            i = i/2;
        }

        array[i] = num;
    }

    // 맨 위에가 사라짐
    public int deleteHeap() {
        int parent, child;
        int data, tmp;
        data = array[1];
        tmp = array[SIZE];
        SIZE--;
        parent = 1;
        child = 2;

        while(child <= SIZE) {
            if ((child < SIZE) && (array[child] > array[child+1])) {
                child++;
            }
            if (tmp <= array[child]) break;
            array[parent] = array[child];
            parent = child;
            child *= 2;
        }
        array[parent] = tmp;
        return data;
    }

    public void printHeap() {
        for (int i = 1; i<SIZE+1; i++ ) {
            System.out.print(array[i]+"\t");
        }
    }

    public static void main(String[] args) {
        HeapSort heapSort = new HeapSort();
        heapSort.insertHeap(10);
        heapSort.insertHeap(13);
        heapSort.insertHeap(20);
        heapSort.insertHeap(8);
        heapSort.insertHeap(9);
        heapSort.insertHeap(15);
        heapSort.insertHeap(1);

        heapSort.printHeap();
    }
}
