/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package floydwarshall_eda2_1b;

/**
 *
 * @author Adhisson Cedeño adhisson.cedeno@epn.edu.ec
 */
public class MatrizGrafo {
    
    final static int INF = 9999;
    final private int numeroVertices = 23;
    
    private int adjacencyMatrix [][] = new int[numeroVertices][numeroVertices];
    
    private int graph[][] = { 
        	{0,INF,1,INF,INF,INF,3,INF,3,INF,4,INF,INF,INF,INF,INF,INF,INF,INF,INF,INF,INF,5	},
          	{INF,0,INF,INF,2,INF,INF,INF,INF,INF,INF,2,INF,INF,INF,INF,INF,INF,INF,INF,INF,2,INF	},
          	{1,INF,0,INF,4,INF,INF,INF,3,INF,INF,INF,INF,4,INF,INF,INF,INF,INF,INF,INF,INF,INF	},
          	{INF,INF,INF,0,INF,INF,INF,INF,INF,2,INF,INF,INF,INF,INF,INF,INF,INF,INF,INF,5,INF,INF	},
          	{INF,2,4,INF,0,INF,INF,INF,4,INF,INF,5,INF,3,INF,INF,INF,INF,INF,INF,INF,1,INF		},
          	{INF,INF,INF,INF,INF,0,INF,INF,INF,INF,INF,INF,8,INF,INF,INF,INF,2,INF,3,INF,1,INF	},
          	{3,INF,INF,INF,INF,INF,0,INF,3,INF,5,INF,INF,INF,INF,INF,INF,INF,INF,INF,INF,INF,INF	},
          	{INF,INF,INF,INF,INF,INF,INF,0,INF,5,INF,INF,6,INF,INF,INF,INF,INF,INF,3,INF,INF,INF	},
          	{3,INF,3,INF,4,INF,3,INF,0,INF,INF,1,3,INF,INF,INF,INF,INF,2,INF,INF,INF,INF		},
          	{INF,INF,INF,2,INF,INF,INF,5,INF,0,INF,INF,INF,INF,INF,INF,INF,3,INF,INF,INF,INF,INF	},
          	{4,INF,INF,INF,INF,INF,5,INF,INF,INF,0,INF,INF,INF,INF,INF,INF,INF,INF,INF,INF,INF,1	},
          	{INF,2,INF,INF,5,INF,INF,INF,1,INF,INF,0,4,INF,INF,INF,INF,INF,INF,4,INF,INF,INF	},
          	{INF,INF,INF,INF,INF,8,INF,6,3,INF,INF,4,0,INF,INF,INF,INF,INF,4,4,INF,INF,INF		},
          	{INF,INF,4,INF,3,INF,INF,INF,INF,INF,INF,INF,INF,0,INF,INF,2,INF,INF,INF,INF,4,6	},
          	{INF,INF,INF,INF,INF,INF,INF,INF,INF,INF,INF,INF,INF,INF,0,3,2,4,INF,INF,INF,INF,INF	},
          	{INF,INF,INF,INF,INF,INF,INF,INF,INF,INF,INF,INF,INF,INF,3,0,INF,INF,INF,INF,2,INF,INF	},
          	{INF,INF,INF,INF,INF,INF,INF,INF,INF,INF,INF,INF,INF,2,2,INF,0,INF,INF,INF,INF,2,INF	},
          	{INF,INF,INF,INF,INF,2,INF,INF,INF,3,INF,INF,INF,INF,4,INF,INF,0,INF,3,5,INF,INF	},
          	{INF,INF,INF,INF,INF,INF,INF,INF,2,INF,INF,INF,4,INF,INF,INF,INF,INF,0,INF,INF,INF,INF	},
          	{INF,INF,INF,INF,INF,3,INF,3,INF,INF,INF,4,4,INF,INF,INF,INF,3,INF,0,INF,INF,INF	},
          	{INF,INF,INF,5,INF,INF,INF,INF,INF,INF,INF,INF,INF,INF,INF,2,INF,5,INF,INF,0,INF,INF	},
          	{INF,2,INF,INF,1,1,INF,INF,INF,INF,INF,INF,INF,4,INF,INF,2,INF,INF,INF,INF,0,INF	},
          	{5,INF,INF,INF,INF,INF,INF,INF,INF,INF,1,INF,INF,6,INF,INF,INF,INF,INF,INF,INF,INF,INF	} 
        };

    public MatrizGrafo() {
    }

    public int getNumeroVertices() {
        return numeroVertices;
    }

    public int[][] getGraph() {
        return graph;
    }

    public int[][] getAdjacencyMatrix() {
        return adjacencyMatrix;
    }

    public void setAdjacencyMatrix(int[][] adjacencyMatrix) {
        this.adjacencyMatrix = adjacencyMatrix;
    }
    
    
    
}
