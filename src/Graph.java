

public class Graph {

    private int vertices;
    private int edges;
    private int[][] adjacency_mat;

    // Constructor
    Graph(int vertices) {
        this.vertices = vertices;
        this.edges = 0;
        this.adjacency_mat = new int[vertices][vertices];
    }

    // Add edges
    public void addEdge(int from, int to) {
        this.adjacency_mat[from][to] = 1;
        this.adjacency_mat[to][from] = 1;
        edges++;
    }

    // Display adjacency matrix
    public void display_matrix() {

        // Outer loop iterates through each row
        for (int i = 0; i < adjacency_mat.length; i++) {

            // Inner loop iterates through each column
            for (int j = 0; j < adjacency_mat[i].length; j++) {

                System.out.print(adjacency_mat[i][j] + " ");
            }

            System.out.println();
        }
    }

    // Check connectedness
    public void connectedness(int from, int to) {

        if (adjacency_mat[from][to] == 1) {
            System.out.println("Connected");
        } else {
            System.out.println("Not Connected");
        }
    }

    // List adjacent nodes
    public void adjacent_nodes(int vertex) {

        System.out.print("Adjacent nodes of " + vertex + ": ");

        for (int j = 0; j < adjacency_mat[vertex].length; j++) {

            if (adjacency_mat[vertex][j] == 1) {
                System.out.print(j + " ");
            }
        }

        System.out.println();
    }
}
