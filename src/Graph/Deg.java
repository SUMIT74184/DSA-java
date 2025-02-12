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
        int []InDegree=new int[nodes];
        int []OutDegree=new int[nodes];
        for(int []edge:edges){
            int From=edge[0];
            int To=edge[1];
            InDegree[To]++;
            OutDegree[From]++;
        }
        for(int i=0;i<nodes;i++){
            System.out.print("node -> " + i + " InDegree ->" +InDegree[i]+" - ");
            System.out.print("node -> " + i + " OutDegree ->" +OutDegree[i]);
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int [][]edges={{0,2},{0,1},{1,3}};
//        Deg Graphy=new Deg();
//        Graphy.findDegreeInUndirectedGraph(edges,4);

        Deg graphd=new Deg();
        graphd.FindDegreeInDirectedGraph(edges,4);
    }
}
