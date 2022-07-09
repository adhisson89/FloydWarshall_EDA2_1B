package FloydWarshall_EDA2_1B;

public class Main {

    final static int INF = 9999;
    public static void main(String[] args) {
        int graph[][] = { { 0, 3, INF, 5 }, { 2, 0, INF, 4 }, { INF, 1, 0, INF }, { INF, INF, 2, 0 } };
        FloydWarshall a = new FloydWarshall();
        a.floydWarshall(graph,4);
      }
}
