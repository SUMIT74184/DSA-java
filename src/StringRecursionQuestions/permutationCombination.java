package StringRecursionQuestions;

public class permutationCombination {
//    position are changing in the problem and every step the recursion
//    size of processed is increasing by one
    static void PermutationString(String p,String up){
    if(up.isEmpty()){
        System.out.println(p);
        return;
    }
    char ch=up.charAt(0);
    for(int i=0;i<=p.length();i++){
        String f=p.substring(0,i);
        String s=p.substring(i,p.length());
        PermutationString(f+ch+s,up.substring(1));
    }
    }

    //returning the array list
    public static void main(String[] args) {
        PermutationString("","abc");
    }
}
