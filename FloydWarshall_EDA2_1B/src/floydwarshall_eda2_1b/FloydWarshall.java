package floydwarshall_eda2_1b;

class FloydWarshall {
    
    MatrizGrafo matriz = new MatrizGrafo();
    
    private int graph[][] = matriz.getGraph();
    private int nV = matriz.getNumeroVertices();
    private int matrix[][] = new int[nV][nV];
    final static int INF = 9999;
    // Implementing floyd warshall algorithm
    public void floydWarshall() {

      int i, j, k;
      
      for (i = 0; i < nV; i++)
        for (j = 0; j < nV; j++)
          matrix[i][j] = graph[i][j];
  
      // Adding vertices individually
      for (k = 0; k < nV; k++) {
        for (i = 0; i < nV; i++) {
          for (j = 0; j < nV; j++) {
            if (matrix[i][k] + matrix[k][j] < matrix[i][j])
              matrix[i][j] = matrix[i][k] + matrix[k][j];
          }
        }
      }
      matriz.setAdjacencyMatrix(matrix);
      //printMatrix();
    }
  
    void printMatrix() {
      for (int i = 0; i < nV; ++i) {
        for (int j = 0; j < nV; ++j) {
          if (matrix[i][j] == INF)
            System.out.print("INF ");
          else
            System.out.print(matrix[i][j] + "  ");
        }
        System.out.println();
      }
    }

    public int[][] getMatrix() {
        return matrix;
    }
    
  }