package Graph;

public class Deg {
    public void findDegreeInUndirectedGraph(int [][]edges,int nodes){
       int []degree= new int[nodes];
       for(int []edge:edges){
           int u=edge[0];
           int v=edge[1];
           degree[u]++;
           degree[v]++;
       }
       for(int i=0;i<nodes;i++){
           System.out.println("node -> " + i + " degree ->" +degree[i]);
       }
    }

    public void FindDegreeInDirectedGraph(int [][]edges,int nodes){
        int []Indegree=new int[nodes];
        int []OutDegree=new int[nodes];
        for(int []edge:edges){
            int From=edge[0];
            int To=edge[1];
            Indegree[To]++;
            OutDegree[From]++;
        }
        for(int i=0;i<nodes;i++){
            System.out.print("node -> " + i + " Indegree ->" +Indegree[i]+" - ");
            System.out.print("node -> " + i + " Outdegree ->" +OutDegree[i]);
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int [][]edges={{0,2},{0,1},{1,3}};
//        Deg graphy=new Deg();
//        graphy.findDegreeInUndirectedGraph(edges,4);

        Deg graphd=new Deg();
        graphd.FindDegreeInDirectedGraph(edges,4);
    }
}
