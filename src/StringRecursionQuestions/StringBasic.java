package StringRecursionQuestions;

public class StringBasic {
    //skip the character
    static void RemovingChar(String pro,String Up){
    if(Up.isEmpty()){
        System.out.println(pro);
        return;
    }
    char ch=Up.charAt(0);
    if(ch=='a'){
    RemovingChar(pro,Up.substring(1));
    }else{
        RemovingChar(pro+ch,Up.substring(1));//so we are taking the character
    }
    }

    static String RemovingCharacter(String Up){
        if(Up.isEmpty()){
            return "";
        }
        char ch=Up.charAt(0);
        if(ch=='a'){
           return RemovingCharacter(Up.substring(1));
        }else{
          return ch + RemovingCharacter(Up.substring(1));//so we are taking the character
        }

    }
    static String SkipCharacter(String Up){
        if(Up.isEmpty()){
            return "";
        }

        if(Up.startsWith("apple")){
            return SkipCharacter(Up.substring(5));
        }else{
            return Up.charAt(0) + SkipCharacter(Up.substring(1));//so we are taking the character
        }

    }


    //skip app but not from the apple
    static String Supplementation(String Up){
        if(Up.isEmpty()){
            return "";
        }

        if(Up.startsWith("app") && !Up.startsWith("apple")){
            return Supplementation(Up.substring(3));
        }else{
            return Up.charAt(0) + Supplementation(Up.substring(1));//so we are taking the character
        }

    }

    public static void main(String[] args) {
//    RemovingChar(" ","bccabcaberina");
//        System.out.println(RemovingCharacter("bfaioqhdasian"));
//        System.out.println(SkipCharacter("aisdapplefsfi"));//removing the entire character
        System.out.println(Supplementation("asdireappsdfnsnfapple"));
    }

}
