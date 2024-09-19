package RecursionProblems;

public class Recursion {
    //recursion most
//    public static  void message(){
//        System.out.println("hello");
//    }
//    public static  void message2(){
//          System.out.println("hwllo1");
//        message();
//    }
    public static void Number1(int n){

        if(n>25){//base case
            return;
        }
        System.out.println(n);
        Number1(n*3);//the function call itself again and again
    }
    //find the n fibonacci numbers
    public static int Fibo(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
//        System.out.println(n);
       return Fibo(n-1)+Fibo(n-2);//recurrent relation

    }
    public static void main(String []a){
//      Number1(2);
//        System.out.println( Fibo(6));
int ans=Fibo(50);
        System.out.println(ans);
    //final main function will be removed from the stack

    }


}
