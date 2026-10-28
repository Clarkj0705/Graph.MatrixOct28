

public class Main {
    public static void main(String[] args) {

        // Create graph with 5 vertices
        Graph g = new Graph(5);

        // Add edges
        g.addEdge(0, 1);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        // Display adjacency matrix
        g.display_matrix();

        // Check connectedness
        g.connectedness(0, 1);
        g.connectedness(0, 4);

        // Display adjacent nodes
        g.adjacent_nodes(1);
    }
}
