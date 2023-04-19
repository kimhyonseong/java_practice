package codewars.kyu5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class JosephusSurvivor {
  public int josephusSurvivor(int n, int k) {
    int[] arr = new int[n];
    int arrIdx = 0;
    Queue<Integer> queue = new LinkedList<>();

    for (int i=1; i<=n; i++) {
      queue.offer(i);
    }

    while (queue.size() > 1) {
      for(int i=0; i<k-1; i++) {
        queue.offer(queue.poll());
      }

      if (queue.peek() != null) {
        arr[arrIdx] = queue.poll();
        arrIdx++;
      }
    }
    System.out.println(Arrays.toString(arr));

    return queue.isEmpty() ? 0 : queue.peek();
  }

  public void test1() {
    josephusSurvivor(7, 3);
  }

  public void test2() {
    josephusSurvivor(40, 3);
  }

  public static void main(String[] args) {
    JosephusSurvivor survivor = new JosephusSurvivor();
    survivor.test1();
    survivor.test2();
  }
}
