package javaGenerics;

public class ExceptionHandling {
    public static void main(String[] args) {
        int a=4;
        int b=0;
        try{
            int result= (int) (a/b);
            System.out.println(result);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("no matter this will always run");
        }
    }
}
