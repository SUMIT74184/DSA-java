public class Main {

    public static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println("printing the number in reverse order "+n);
        fun(n-1);
        System.out.println(n);
    }
//    public static void fun1(int n1){
//        if(n1==6){
//            return;
//        }
//        System.out.println(n1);
//        fun1(n1+1);
//    }

    //factorial of the number
   public static int fact(int n){
        if(n==0){
            return 1 ;
        }
       int ans= n*fact(n-1);
//       System.out.println(n);
       return ans;

   }
   public static int Summing(int n){
        if(n==1){
            return 1;
        }
        return n+Summing(n-1);
   }
   //sum of digits
    public static int DigitSum(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+DigitSum(n/10);
    }
    public static int PrdNum(int n){
        if(n%10==n){
            return n;
        }
        return (n%10)*PrdNum(n/10);
    }
    public static void main(String[] args) {
        fun(5);
//        System.out.println();
       int k= fact(6);
        System.out.println(k);
//        System.out.println("now in the right order");
//        fun1(1);
        int p=Summing(12);
        System.out.println(p);

        int g=DigitSum(1347);
        System.out.println("sum of the digit are "+g);

        int y=PrdNum(123);
        System.out.println("Products of the digits are "+y);
    }
}