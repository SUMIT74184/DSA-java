package Graph;

import java.util.ArrayList;
import java.util.List;

public class GraphLec {

    class Pair{
        int node;
        int weight;
        Pair(int n,int w){
            node=n;
            weight=w;
        }

        public String toString(){
            return "(" +node+","+ weight +")";
        }
    }

    int [][]adjMatrix;

    List<List<Integer>>adjList;

    List<List<Pair>>adjListWithWeight;

    GraphLec(int nodes){
        adjMatrix=new int[nodes][nodes];

        adjList=new ArrayList<>();

        adjListWithWeight=new ArrayList<>();

        //creating the list of array for every node
        for(int i=0;i<nodes;i++){
            adjList.add(new ArrayList<>());
            adjListWithWeight.add(new ArrayList<>());
        }
    }
//    ->[[0,1],[1,0],[0,2],[2,0]
    public void addEdgesInMatrix(int [][]edges,boolean isDirected){
        for(int []edge:edges){
            int u=edge[0];
            int v=edge[1];
//            directed
            if(isDirected) {
                adjMatrix[u][v] = 1;
            }else {
//            undirected graph
                adjMatrix[u][v] = 1;
                adjMatrix[v][u] = 1;
            }
        }
    }

    public void AddEdgesInAdjList(int [][]edges,boolean isDirected){
        for(int []edge:edges){
            int u=edge[0];
            int v=edge[1];
            if(isDirected){
                adjList.get(u).add(v);
            }else{
                adjList.get(u).add(v);
                adjList.get(v).add(u);
            }
        }
    }

    public void AddEdgesWtInMatrix(int [][]edges,boolean isDirected){
        for(int []edge:edges){
            int u=edge[0];
            int v=edge[1];
            int w=edge[2];
            if(isDirected){
                adjMatrix[u][v]=w;
            }else{
                adjMatrix[u][v]=w;
                adjMatrix[v][u]=w;
            }

        }
    }

    public void AddEdgesWtInAdjList(int [][]edges,boolean isDirected){
        for(int []edge:edges){
            int u=edge[0];
            int v=edge[1];
            int w=edge[2];

            if(isDirected){
                Pair pair =new Pair(v,w);
                adjListWithWeight.get(u).add(pair);

            }else{
                Pair pair1 =new Pair(v,w);
                Pair pair2 =new Pair(u,w);
                adjListWithWeight.get(u).add(pair1);
                adjListWithWeight.get(v).add(pair2);
            }
        }
    }

    public void printing() {
        for (int i = 0; i < adjMatrix.length; i++) {
            System.out.print("row " + i + " -> "); // Changed println to print
            for (int j = 0; j < adjMatrix[i].length; j++) {
                System.out.print(adjMatrix[i][j]);
                System.out.print(",");
            }
            System.out.println(); // Move to the next line after each row
        }
    }

//    public void PrintList(){
//        for(int i=0;i<adjList.size();i++){
//            System.out.print(i+ " -> ");
//            System.out.print("[");
//            for(int j=0;j<adjList.get(i).size();j++){
//                System.out.print(adjList.get(i).get(j)+ ",");
//            }
//            System.out.print("]");
//            System.out.println();
//        }
//
//    }

    public void PrintListWitWt(){
        for(int i=0;i<adjListWithWeight.size();i++){
            System.out.print(i+ " -> ");
            System.out.print("[");
            for(int j=0;j<adjListWithWeight.get(i).size();j++){
                System.out.print(adjListWithWeight.get(i).get(j)+ ",");
            }
            System.out.print("]");
            System.out.println();
        }

    }


    public static void main(String[] args) {
//        int [][]edges={{0,2},{0,1},{1,3}};
//        int nodes=4;
//        GraphLec graph1=new GraphLec(nodes);
//        graph1.addEdgesInMatrix(edges,false);
//        graph1.printing();
//        System.out.println("printing the directed graph");
//        GraphLec graph2=new GraphLec(nodes);
//        graph2.addEdgesInMatrix(edges,true);
//        graph2.printing();


//        int [][]edges={{0,2,10},{0,1,5},{1,3,1}};
//        int nodes=4;
//        System.out.println("weighted Undirected Graph ->");
//        GraphLec graph3=new GraphLec(nodes);
//        graph3.AddEdgesWtInMatrix(edges,false);
//        graph3.printing();
//        System.out.println();
//        System.out.println("weighted Directed Graph ->");
//        GraphLec graph4=new GraphLec(nodes);
//        graph4.AddEdgesWtInMatrix(edges,true);
//        graph4.printing();


//        adjList
//       int [][]edges={{0,2},{0,1},{1,3}};
//       int nodes=4;
//        System.out.println("printing the undirected graph");
//       GraphLec graph1=new GraphLec(nodes);
//       graph1.AddEdgesInAdjList(edges,false);
//       graph1.PrintList();
//       System.out.println("printing the directed graph");
//       GraphLec graph2=new GraphLec(nodes);
//       graph2.AddEdgesInAdjList(edges,true);
//       graph2.PrintList();


        int [][]edges={{0,2,10},{0,1,5},{1,3,1}};
        int nodes=4;
        System.out.println("weighted Undirected Graph ->");
        GraphLec graph3=new GraphLec(nodes);
        graph3.AddEdgesWtInAdjList(edges,false);
        graph3.PrintListWitWt();
        System.out.println();
        System.out.println("weighted Directed Graph ->");
        GraphLec graph4=new GraphLec(nodes);
        graph4.AddEdgesWtInAdjList(edges,true);
        graph4.PrintListWitWt();
    }
}
