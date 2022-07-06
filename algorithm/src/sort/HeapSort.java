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
        data = array[1];    // 맨 앞의 값 - 제거 및 반출
        tmp = array[SIZE];  // 맨끝의 값
        SIZE--;             // 7
        parent = 1;
        child = 2;

        // 1 3 6 4 5 7 8
        // 8 3 6 4 5 7
        // 3 8 6 4 5 7
        // 3 4 6 8 5 7
        while(child <= SIZE) {
            // 맨 끝의 배열 인덱스가 child 보다 크고
            // 자손 트리의 두개의 값 중 왼쪽이 더 클때
            // 작은거랑 바꿔야하기 때문에 child에 +1해서 자손 트리의 왼쪽을 타겟으로 아니면 그냥 왼쪽꺼 씀
            if ((child < SIZE) && (array[child] > array[child+1])) {
                child++;
            }
            // 맨끝 값이 자손트리보다 작거나 같으면 끝
            if (tmp <= array[child]) break;

            // 자손트리와 부모트리 값 바꿈
            array[parent] = array[child];

            // 인덱스 변경
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
        System.out.println();
        System.out.println();

        heapSort.deleteHeap();
        heapSort.printHeap();
        System.out.println();
        heapSort.deleteHeap();
        heapSort.printHeap();
    }
}
