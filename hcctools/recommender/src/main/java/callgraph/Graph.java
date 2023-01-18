package callgraph;

import java.util.Iterator;
import java.util.LinkedList;

// This class represents a directed graph using adjacency list
// representation
public class Graph {
    private int V; // No. of vertices
    private LinkedList<Integer> adj[]; //Adjacency Lists

    // Constructor
    public Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    // Driver method to
    public static void main(String args[]) {


        Graph g = new Graph(19);
        g.addEdge(0, 6);
        g.addEdge(1, 4);
        g.addEdge(1, 12);
        g.addEdge(2, 0);
        g.addEdge(2, 12);
        g.addEdge(2, 1);
        g.addEdge(2, 13);
        g.addEdge(4, 11);
        g.addEdge(5, 6);
        g.addEdge(7, 6);
        g.addEdge(8, 6);
        g.addEdge(9, 6);
        g.addEdge(11, 12);
        g.addEdge(14, 6);
        g.addEdge(15, 6);
        g.addEdge(17, 6);

        System.out.println("Following is Breadth First Traversal " +
                "(starting from vertex 2)");


        for (int i = 0; i < 19; i++) {
            g.BFS(i);
            System.out.println();
        }

        g.print();

    }

    public void print() {
        for (int i = 0; i < V; ++i) {
            System.out.print(i + "->");
            for (int x : adj[i]) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    // Function to add an edge into the graph
    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // prints BFS traversal from a given source s
    public int BFS(int s) {
        // Mark all the vertices as not visited(By default
        // set as false)
        int total_nodes_visited = 0;
        boolean visited[] = new boolean[V];

        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();

        // Mark the current node as visited and enqueue it
        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            // Dequeue a vertex from queue and print it
            s = queue.poll();
            //System.out.print(s+" ");
            total_nodes_visited++;

            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
        return total_nodes_visited;
    }
}
