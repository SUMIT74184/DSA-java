package FundametalsMazes;

import java.util.Arrays;

public class PrintMatrixCount {
    static void AllPath(String p,boolean [][]maze,int row,int col,int [][]path,int step){
        if(row==maze.length-1 && col== maze[0].length-1){
            path[row][col]=step;
            for(int []arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
// main important condition for the restriction in the maze
        if(!maze[row][col]){
            return;
        }
        maze[row][col]=false;
        path[row][col]=step;

        if(row<maze.length-1){
            AllPath(p+'D',maze,row+1,col,path,step+1);
        }
        if(col<maze[0].length-1){
            AllPath(p+'R',maze,row,col+1,path,step+1);
        }
        if(row>0){
            AllPath(p+'U',maze,row-1,col,path,step+1);
        }
        if(col>0){
            AllPath(p+'L',maze,row,col-1,path,step+1);
        }
//backtracking our path again
        maze[row][col]=true;
        path[row][col]=0;
    }
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };
        int [][]path=new int [board.length][board[0].length];
        AllPath("", board, 0, 0,path,1);
    }
}
