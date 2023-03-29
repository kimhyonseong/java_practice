package programers;

import java.util.LinkedList;
import java.util.Queue;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/86971
 */

public class TowerDivide {
  public static void main(String[] args) {
    TowerDivide bfs = new TowerDivide();
    bfs.test();
  }

  public int solution(int n, int[][] wires) {
    int answer = n;
    int a,b;
    Graph bfs = new Graph(n);

    for (int[] arr : wires) {
      bfs.addNext(arr[0],arr[1]);
    }

//    bfs.start(1);
//    bfs.resetMaking();
//    System.out.println("=======================");

    for (int[] arr : wires) {
      bfs.removeNext(arr[0],arr[1]);
      a = bfs.start(arr[0]);
      bfs.resetMaking();
      b = bfs.start(arr[1]);
      bfs.addNext(arr[0],arr[1]);
      bfs.resetMaking();

      if (Math.min(Math.abs(a-b),answer) == Math.abs(a-b)) {
        System.out.printf("최저: %d %d / %d\n",arr[0],arr[1],Math.abs(a-b));
      }
      answer = Math.min(Math.abs(a-b),answer);
    }
    System.out.println("answer: "+answer);

    return answer;
  }

  public void test() {
    System.out.println(solution(9,new int[][]{{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}}) == 3);
    System.out.println(solution(4,new int[][]{{1,2},{2,3},{3,4}}) == 0);
    System.out.println(solution(7,new int[][]{{1, 2},{2, 7},{3, 7},{3, 4},{4, 5},{6, 7}}) == 1);
  }
}

class Graph {
  Node[] nodes;

  static class Node {
    int data;
    boolean marked;
    LinkedList<Node> next;

    Node(int data) {
      this.data = data;
      this.marked = false;
      this.next = new LinkedList<>();
    }
  }
  Graph(int size) {
    nodes = new Node[size+1];

    for (int i=0; i<size+1; i++) {
      nodes[i] = new Node(i);
    }
  }

  void addNext(int data, int next) {
    Node node1 = nodes[data];
    Node node2 = nodes[next];

    if (!node1.next.contains(node2))
      node1.next.add(node2);

    if (!node2.next.contains(node1))
      node2.next.add(node1);
  }

  void removeNext(int data, int next) {
    Node node1 = nodes[data];
    Node node2 = nodes[next];

    node1.next.remove(node2);
    node2.next.remove(node1);
  }

  void resetMaking() {
    for (Node n : nodes) {
      n.marked = false;
    }
  }

  int start(int start) {
    int result = 0;
    Node root = nodes[start];
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    root.marked = true;
    result++;
    System.out.println("-----------------------");
    System.out.println("시작");

    while (!queue.isEmpty()) {
      Node r2 = queue.remove();
      System.out.println("-----------------------");
      System.out.println("현재 값: "+r2.data);

      for (Node n : r2.next) {
        if (!n.marked) {
          System.out.println("다음 값: "+n.data);
          n.marked = true;
          queue.add(n);
          result++;
          System.out.println("result: "+result);
        }
      }
    }
    return result;
  }
}