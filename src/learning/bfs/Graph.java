package learning.bfs;
// BFS algorithm in Java
import java.util.*;
public class Graph {
    private int numberOfVertex;
    private List<Integer>[] adj;
    // Create a graph
    Graph(int numberOfVertex) {
        this.numberOfVertex = numberOfVertex;
        adj = new LinkedList[numberOfVertex];
        for (int i = 0; i < numberOfVertex; ++i)
            adj[i] = new LinkedList();
    }

    // Add edges to the graph
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // BFS algorithm
    void BFS(int s) {
        boolean[] visited = new boolean[numberOfVertex];
        Queue<Integer> queue = new LinkedList();
        visited[s] = true;
        queue.add(s);
        while (!queue.isEmpty()) {
            s = queue.poll();
            System.out.print(s + " ");
            for(Integer n: adj[s]){
                if (!visited[n]) {
                    visited[n] = true;
                    queue.offer(n);
                }
            }
        }
    }

    public static void main(String args[]) {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");

        g.BFS(2);
    }
}
