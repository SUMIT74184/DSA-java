package RecursionArrays;

import java.util.ArrayList;

public class DiceThrow {
    static void dices(String p, int target) {
        if (target==0){
        System.out.println(p);
        return;
    }
    for(int i=1;i<=6 &&i<=target ;i++){
        dices(p+i,target-i);
    }
    }
    static ArrayList<String> dicesArray(String p, int target){
        if(target==0){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String>ans=new ArrayList<>();
        for(int i=1;i<=6 &&i<=target;i++){
          ans.addAll(dicesArray(p+i,target-i));
        }
        return ans;
    }

   static void diceFace(String p, int target,int Face) {
        if (target==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=Face &&i<=target ;i++){
            diceFace(p+i,target-i,Face);
        }
    }
  public  static void main(String[] args) {
        dices("",4);

        ArrayList<String>ans=dicesArray("",5);
      System.out.println(ans);
      diceFace("",4,6);
//    [1,2,3,4,5,6]
//    expected output is 4
    }
}
