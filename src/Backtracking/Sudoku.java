package Backtracking;

public class Sudoku {

    static boolean isSafe(int [][] board,int row,int col,int num){
//        check the row
        for(int i=0;i<board.length;i++){
            if(board[row][i]==num){
                return false;
            }
        }
//        check for the col
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }

        int sqrt=(int)(Math.sqrt(board.length));
        int rowStart=row-row % sqrt;
        int colStart=col-col % sqrt;


        for(int r=rowStart;r<rowStart+sqrt;r++){
            for(int c=colStart;c<colStart+sqrt;c++){
            if(board[r][c]==num){
                return false;
            }
            }

        }
        return true;
    }

    static boolean solver(int [][]board){
        int n= board.length;
        int row=-1;
        int col=-1;

        boolean ItemsPlace=true;
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==0){
                    row=i;
                    col=j;
                    ItemsPlace=false;
                    break;
                }
            }
            if(!ItemsPlace){
                break;
            }
        }
        if(ItemsPlace){
            return true;
            //sudoku is solved
        }
        for (int number=1;number<=9;number++){
            if(isSafe(board,row,col,number)){
                board[row][col]=number;
                if(solver(board)){
//                    display(board);
                    return true;// board is solved
                }
            }
            board[row][col]=0;
        }
        return false;
//        after multiple attempts if the board is not solved then return false
    }

    static void display(int[][] board) {
       for(int[] row:board){
           for(int num:row){
               System.out.print(num+ " ");
           }
           System.out.println();
       }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

//        System.out.println(solver(board));
        if(solver(board)){
            display(board);
        }else{
            System.out.println("cannot solve the board");
        }
    }

}
