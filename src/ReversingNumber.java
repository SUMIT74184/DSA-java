public class ReversingNumber {
    static int sum=0;
    public  static void RevNumber(int n){
        if(n==0){
            return;
        }
        int rem=n%10;
        sum=sum*10+rem;
        RevNumber(n/10);
    }
    public static int helper(int n,int digits){
        if(n%10==n){
            return n;
        }
        int rem=n%10;
        return rem *(int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
    }
    public static int Rv2(int n){
    //sometimes you might need some additional variables in the argument
        //in that case.make another function
        int digits=(int)(Math.log(n)+1);
        return helper(n,digits);

    }
    static boolean palin(int n){
        return n==Rv2(n);
    }

    public static void main(String[] args) {
//    RevNumber(1234);
//        System.out.println(sum);
        Rv2(123321);
        System.out.println(palin(1));
    }

}
