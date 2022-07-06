package graph;

class MyGraph {
    private int count;
    private int[][] matrix;
    private boolean[] visited;
    private int[] distance;
    private static int LIMIT = 9999;

    public MyGraph(int count) {
        this.count = count;
        matrix = new int[count][count];
        visited = new boolean[count];
        distance = new int[count];
    }

    public void addEdge(int from, int to, int weight) {
        matrix[from][to] = weight;
        matrix[to][from] = weight;
    }

    public void calDistance(int from) {
        for (int i=0; i<count; i++) {
            distance[i] = LIMIT;
        }

        visited[from] = true;
        distance[from] = 0;

        // from에 연결괴어 있는 노드 거리 초기화
        for (int i = 0; i<count; i++) {
            if (!visited[i] && matrix[from][i] != 0) {
                distance[i] = matrix[from][i];
            }
        }

        for(int k=0; k<count-1; k++) {

        }
    }
}

public class ShortPath {
    public static void main(String[] args) {
        MyGraph graph = new MyGraph(6);
        graph.addEdge(0,1,1);
        graph.addEdge(0,2,4);
        graph.addEdge(1,2,2);
        graph.addEdge(2,3,1);
        graph.addEdge(3,4,8);
        graph.addEdge(3,5,3);
        graph.addEdge(4,5,4);
    }
}
