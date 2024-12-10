package FundametalsMazes;

public class MazeWithObs {

    static void RestrictedPath(String p,boolean maze[][],int row,int col){
        if(row==maze.length-1 && col== maze[0].length-1){
            System.out.println(p);
            return;
        }
// main important condition for the restriction in the maze
        if(!maze[row][col]){
            return;
        }
        if(row<maze.length-1){
            RestrictedPath(p+'D',maze,row+1,col);
        }
        if(col<maze[0].length-1){
            RestrictedPath(p+'R',maze,row,col+1);
        }
    }
    public static void main(String[] args) {
        boolean[][] board={
                {true,true,true},
                {true,false,true},
                {true,true,true},
        };
       RestrictedPath("",board,0,0);
    }
}
