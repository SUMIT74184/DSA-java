package FundametalsMazes;

//Backtracking Question
public class BacktrackingConcept {
    static void AllPath(String p,boolean [][]maze,int row,int col){
        if(row==maze.length-1 && col== maze[0].length-1){
            System.out.println(p);
            return;
        }
// main important condition for the restriction in the maze
        if(!maze[row][col]){
            return;
        }
        maze[row][col]=false;

        if(row<maze.length-1){
            AllPath(p+'D',maze,row+1,col);
        }
        if(col<maze[0].length-1){
            AllPath(p+'R',maze,row,col+1);
        }
        if(row>0){
            AllPath(p+'U',maze,row-1,col);
        }
        if(col>0){
            AllPath(p+'L',maze,row,col-1);
        }
//backtracking our path again
        maze[row][col]=true;
    }
    public static void main(String[] args) {
        boolean[][] board={
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };
        AllPath("",board,0,0);

        //In this question the while going back again we are facing the
        // infinite recursion call which are repeating the same path

        //hint to solve the question:-mark the visited cells with false or visited
        //  Important Note:...when the function is returned --->when that recursion call is over then reset the current path travelled
    }
}
