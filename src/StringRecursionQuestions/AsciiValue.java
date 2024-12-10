package StringRecursionQuestions;

import java.util.ArrayList;
import java.util.List;

public class AsciiValue {
    static void subseqAscii(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subseqAscii(p+ch,up.substring(1));
        subseqAscii(p,up.substring(1));
        subseqAscii(p+(ch+0),up.substring(1));
    }

    static ArrayList<String>subsetAscii(String p, String up){
        if(up.isEmpty()){
         ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String>left= subsetAscii(p+ch,up.substring(1));
        ArrayList<String>right=subsetAscii(p,up.substring(1));
        ArrayList<String>center=subsetAscii(p+(ch+0),up.substring(1));

        left.addAll(right);
        left.addAll(center);
        return left;
    }
    public static void main(String[] args) {
//        char ch='a';
//       char c=(char)(ch+2);
//        subseqAscii("","abc");
        System.out.println(subsetAscii("","abc"));

    }
}
