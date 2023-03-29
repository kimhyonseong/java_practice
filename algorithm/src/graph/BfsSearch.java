package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BfsSearch {
    int count;
    boolean[] visited;
    ArrayList<Integer> queue;
    int[][] matrix;

    public BfsSearch(int count) {
        this.count = count;
        visited = new boolean[count];
        queue = new ArrayList<Integer>();
    }

    public void bsfTravel() {
        queue.add(0);
        visited[0] = true;

        while(queue.size() != 0) {
            int node = queue.remove(0);
            System.out.print(node + " ");

            for (int i=0; i<count; i++) {
                if (!visited[i] && matrix[node][i] != 0) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int count = 8;

        UndirectedGraph graph = new UndirectedGraph(count);
        BfsSearch bfs = new BfsSearch(count);

        graph.addEdges(0,1,1);
        graph.addEdges(0,2,1);
        graph.addEdges(1,3,1);
        graph.addEdges(1,4,1);
        graph.addEdges(2,5,1);
        graph.addEdges(2,6,1);
        graph.addEdges(4,5,1);
        graph.addEdges(3,7,1);

        bfs.matrix = graph.getMatrix();
        bfs.bsfTravel();
    }
}


class Graph {
    class Node {
        int data;
        LinkedList<Graph.Node> adjacent;
        boolean marked;

        Node(int data) {
            this.data = data;
            this.marked = false;
            adjacent = new LinkedList<>();
        }
    }

    Graph.Node[] nodes;
    Graph(int size) {
        nodes = new Graph.Node[size];
        for (int i=0; i<size; i++) {
            nodes[i] = new Graph.Node(i);
        }
    }

    void addEdge(int i1, int i2) {
        Graph.Node n1 = nodes[i1];
        Graph.Node n2 = nodes[i2];

        if (!n1.adjacent.contains(n2)) {
            n1.adjacent.add(n2);
        }

        if (!n2.adjacent.contains(n1)) {
            n2.adjacent.add(n1);
        }
    }

    void dfs() {
        dfs(0);
    }

    void dfs(int index) {
        Graph.Node root = nodes[index];
        Stack<Graph.Node> stack = new Stack<>();
        stack.push(root);
        root.marked = true;
        while (!stack.isEmpty()) {
            Graph.Node r = stack.pop();

            for (Graph.Node n : r.adjacent) {
                if (!n.marked) {
                    n.marked = true;
                    stack.push(n);
                }
            }
        }
    }

    void bfs() {
        bfs(0);
    }

    void bfs(int index) {
        Graph.Node root = nodes[index];
        Queue<Graph.Node> queue = new LinkedList<>();
        queue.add(root);
        root.marked = true;

        while (!queue.isEmpty()) {
            Graph.Node r = queue.poll();

            for (Graph.Node n : r.adjacent) {
                if (!n.marked) {
                    n.marked = true;
                    queue.add(n);
                }
            }
        }
    }
}