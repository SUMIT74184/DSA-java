package RecursionArrays;

import java.util.ArrayList;

public class permutations {

    //every recursion call one step is increasing
    static void PermutationOfString(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            PermutationOfString(f+ch+s,up.substring(1));
        }

    }

    static ArrayList<String> PermutationOfStrings(String p, String up){
        if(up.isEmpty()){
          ArrayList<String> list=new ArrayList<>();
          list.add(p);
          return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> ans=new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            ans.addAll(PermutationOfStrings(f+ch+s,up.substring(1)));
        }
        return ans;
    }
    public static void main(String[] args) {
        PermutationOfString("","abd");
        ArrayList<String>ans=PermutationOfStrings("","abc");
        System.out.println(ans);
    }
}
