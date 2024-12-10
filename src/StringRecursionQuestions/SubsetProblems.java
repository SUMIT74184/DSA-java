package StringRecursionQuestions;

import java.util.*;

public class SubsetProblems {
    //permutations and combinations
//    in subset the ordering doesn't matter at all and repetition is not allowed
    static void FuncSub(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        FuncSub(p+ch,up.substring(1));//we are including the element in the call
        FuncSub(p,up.substring(1));//we are ignoring the element in the call

    }

    static ArrayList<String> subset(String p, String up){
     if(up.isEmpty()){
        ArrayList<String>list=new ArrayList<>();
        list.add(p);
        return list;
     }
     char ch=up.charAt(0);
     ArrayList<String>left=subset(p+ch,up.substring(1));
     ArrayList<String>right=subset(p,up.substring(1));
     right.addAll(left);//we are combining the both left and right arraylist
     return right;
    }
    public static void main(String[] args) {
//        FuncSub("","abc");
        System.out.println(subset("","abc"));
    }
}
