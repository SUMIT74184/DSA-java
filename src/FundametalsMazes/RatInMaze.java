package FundametalsMazes;


import java.util.ArrayList;

public class RatInMaze {


//    printing the number of paths
    static int count(int RowAns,int ColAns){
        if(RowAns==1 || ColAns==1 ){
            return 1;
        }
        int left=count(RowAns-1,ColAns);
        int right=count(RowAns,ColAns-1);

        int SumOFAll;
        SumOFAll=left+right;
        return SumOFAll;
    }

// printing the actual path through which we are traversing

    static void ActualPath(String p,int row,int col){
        if(row==1 && col==1){
            System.out.println(p);
            return;
        }
//        we are adding into the p because the p+"old path we have taken" and rest the same recusrion tree
        if(row>1){
            ActualPath(p+'D',row-1,col);
        }
        if(col>1){
            ActualPath(p+'R',row,col-1);
        }
    }

    // Now to return the path inside the arrays
    static ArrayList<String>ActualPathReturn(String p,int row,int col){
        if(row==1 && col==1){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
//  we are adding into the p because the p+"old path we have taken" and rest the same recursion tree
        ArrayList<String> list = new ArrayList<>();
        if(row>1){
            list.addAll(ActualPathReturn(p+'D',row-1,col));
        }
        if(col>1){
           list.addAll(ActualPathReturn(p+'R',row,col-1));
        }
        return list;
    }
    public static void main(String[] args) {
//    Q1    System.out.println(count(3,3));
//    Q2      ActualPath("",3,3);
        System.out.println(ActualPathReturn("",3,3));
       //IN how many ways we can reach the goal in the maze
    }
}
