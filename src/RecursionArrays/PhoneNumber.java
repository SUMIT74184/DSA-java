package RecursionArrays;


import java.util.ArrayList;

public class PhoneNumber {

    static void pad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit=up.charAt(0)-'0';
        for(int i=(digit-1)*3 ;i<digit*3;i++){
            char ch=(char)('a'+i);
            pad(p+ch,up.substring(1));
        }
    }

    static int CountPad(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int count=0;
        int digit=up.charAt(0)-'0';
        for(int i=(digit-1)*3 ;i<digit*3;i++){
            char ch=(char)('a'+i);
           count=count+CountPad(p+ch,up.substring(1));
        }
        return count;
    }


    //using the array list
    static ArrayList<String> keypadCombination(String p, String up){
        if(up.isEmpty()){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit=up.charAt(0)-'0';
        ArrayList<String>ans=new ArrayList<>();
        for(int i=(digit-1)*3 ;i<digit*3;i++){
            char ch=(char)('a'+i);
            ans.addAll(keypadCombination(p+ch,up.substring(1)));
        }
        return ans;
    }


    public static void main(String[] args) {
//    pad("","98");
        ArrayList<String>digits= keypadCombination("","34");
        System.out.println(digits);

        int ans=CountPad("","45");
        System.out.println(ans);

    }
}
