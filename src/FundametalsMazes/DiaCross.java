package FundametalsMazes;

public class DiaCross {
    static void DiagonalPathAdded(String p,int row,int col){
        if(row==1 && col==1){
            System.out.println(p);
            return;
        }
//        going in the diagonal direction in the maze
        if(row>1 && col>1){
            DiagonalPathAdded(p+'C',row-1,col-1);
        }
        if(row>1){
            DiagonalPathAdded(p+'V',row-1,col);
        }
        if(col>1){
            DiagonalPathAdded(p+'H',row,col-1);
        }
    }
    public static void main(String[] args) {
//        System.out.println();
        DiagonalPathAdded("",3,3);
    }

}
