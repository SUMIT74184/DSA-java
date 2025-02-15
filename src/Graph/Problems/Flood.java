package Graph.Problems;

import java.util.LinkedList;
import java.util.Queue;

public class Flood {
    int rows;
    int cols;
    //we need to color the 1's in the matrix starting from the 1x1
    //also need to check the out-off bound condition which are 4 directionally
    public void dfs(int row,int col,int color,int currColor,boolean [][]visited,int [][]image){
        if(row<0 || row>=rows || col<0 || col>=cols || image[row][col]!=currColor || visited[row][col]){
            return;
        }
        image[row][col]=color;
        visited[row][col]=true;
        //neighbors
        int [][]adjList={{row-1,col},{row,col+1},{row+1,col},{row,col-1}};
        for(int []neighbour:adjList){
            dfs(neighbour[0],neighbour[1],color,currColor,visited,image);
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        //visited array is important
        rows= image.length;
        cols= image[0].length;
        boolean [][]visited=new boolean[rows][cols];
//        dfs(sr,sc,color,image[sr][sc],visited,image);
//        return image;

//        breadth first search graph
        int curColor=image[sr][sc];
        Queue<int[]>queue=new LinkedList<>();
        queue.offer(new int[]{sr,sc});
        image[sr][sc]=color; //fill and visited at the same time
        while (!queue.isEmpty()){
            int []node=queue.poll();
            int row=node[0];
            int col=node[1];
            int [][]adjList={{row-1,col},{row,col+1},{row+1,col},{row,col-1}};
            for(int []neighbour:adjList){
                int r=neighbour[0];
                int c=neighbour[1];
                if(r<0 || r>=rows || c<0 || c>=cols || image[r][c]!=curColor || image[r][c]==color){
                    continue;
                }
                queue.offer(new int[]{r,c});
                image[r][c]=color;

            }
        }
//        dfs(sr,sc,color,image[sr][sc],visited,image);
        return image;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
