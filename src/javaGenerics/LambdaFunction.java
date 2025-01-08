package javaGenerics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunction {
    public static void main(String[] args) {
//        System.out.println();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<5;i++){
            arr.add(i);
        }

        //item represent every single item in the loops

//        arr.forEach((item)->{
//            System.out.println(item*2);
//        });

        Consumer<Integer> fun=(item)-> System.out.println(item*3);
        arr.forEach(fun);

        Operation sum=(a,b,c)-> {
            return a + b + c;
        };
        Operation prod=(a,b,c)-> {
            return a * b * c;
        };
//        Operation division=(a,b)->a/b+c;

        LambdaFunction calc=new LambdaFunction();
      int result= calc.operate(3,4,5,sum);
       int result2= calc.operate(4,6,3,prod);
        System.out.println("printing the result :"+result2);

    }
    public int operate(int a,int b,int c,Operation op){
        return op.operator(a,b,c);
    }
    interface Operation{
//        int operator(int a,int b);
        int operator(int a,int b,int c);
    }



    int sum(int a,int b){
        return a+b;
    }
}
