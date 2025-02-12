package Graph;

import java.util.ArrayList;
import java.util.List;

public class DAG {

    // Depth First Search in the graph
    public ArrayList<Integer> dfsOfGraph(int V, List<List<Integer>> adjList) {
        ArrayList<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, visited, adjList, res);
            }
        }
        return res;
    }

    public void dfs(int node, boolean[] visited, List<List<Integer>> adjList, ArrayList<Integer> res) {
        visited[node] = true;
        res.add(node);
        for (int neighbour : adjList.get(node)) {
            if (!visited[neighbour]) {
                dfs(neighbour, visited, adjList, res);  //recursive call for the graph
            }
        }
    }
    public static void main(String[] args) {
        int V = 5; // Number of vertices
        List<List<Integer>> adjList = new ArrayList<>();

        // Initializing adjacency list
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }

        // Adding edges to the graph
        adjList.get(0).add(1);
        adjList.get(0).add(2);
        adjList.get(1).add(3);
        adjList.get(2).add(4);

        DAG graph = new DAG();
        ArrayList<Integer> dfsResult = graph.dfsOfGraph(V, adjList);

        // Printing the DFS traversal
        System.out.println("DFS Traversal of the graph: " + dfsResult);
    }
}