public class CountingZeros {
    public static void main(String[] args) {
        System.out.println(Count(320145600));
    }
    static int Count(int n){
        return helper(n,0);
    }
    //special function to return the value of the above functiona
    private static int helper(int n,int count){
        if(n==0){
            return count;
        }
        int rem=n%10;
        if(rem==0){
            return helper(n/10,count+1);
        }else{
            return helper(n/10,count);

        }
    }
}
