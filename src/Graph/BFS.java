package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
//for the single src node in the graph
    public ArrayList<Integer>bfsOfGraph(int V,List<List<Integer>>adjList){
        boolean []visited=new boolean[V];
        Queue<Integer>queue=new LinkedList<>();
        ArrayList<Integer>res=new ArrayList<>();
        visited[0]=true;
        queue.offer(0);
        while(!queue.isEmpty()){
            int node=queue.poll();//removing from the queue and adding in the res
            res.add(node);
            for(int neighbour:adjList.get(node)){
                if(!visited[neighbour]){
                    visited[neighbour]=true;
                    queue.offer(neighbour);
                }
            }
        }
        return res;
    }
    //for multiple src node in the graph
    public ArrayList<Integer>multipleNodeGraph(int V,List<List<Integer>>adj){
        ArrayList<Integer>res=new ArrayList<>();
        boolean []visited=new boolean[V];
        Queue<Integer>queue=new LinkedList<>();
        for (int i=0;i<V;i++){
            if(!visited[i]){
                bfs(i,adj,queue,visited,res);
            }
        }
        return res;
    }

    private void bfs(int source,List<List<Integer>>adjList,Queue<Integer>queue,boolean []visited,ArrayList<Integer>res) {
        visited[source]=false;
        queue.offer(source);
        while(!queue.isEmpty()){
            int node=queue.poll();
            res.add(node);
            for(int neighbour:adjList.get(node)){
                if(!visited[neighbour]){
                    visited[neighbour]=true;
                    queue.offer(neighbour);
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("breadth first search graph traversal");
        // Number of vertices
        int V = 5;

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


        BFS graph = new BFS();
        ArrayList<Integer> bfsOfGraph = graph.bfsOfGraph(V, adjList);

        System.out.println("bfs traversal of the graph"+bfsOfGraph);


    }
}
