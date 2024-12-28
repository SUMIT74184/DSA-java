package Object.polymorhism;

import java.awt.*;

public class Main
{

    public int sum(int a, int b){
        return a-b;
    }

    public int sum(int a ,int b,int c){
        return a+b-c;
    }
    public static void main(String[] args) {
        shapes sh=new shapes();
        shapes cl =new circle();// how this is working
        // parent obj = new child
        //which method will be called is depend on the child
//        known as the upcasting
        Square sq=new Square();

        sh.area();
        cl.area();

        Main number=new Main();
    int ans= number.sum(2,3);
        System.out.println(ans);
        number.sum(2,3,5);
        System.out.println(number.sum(2,3,5));



        //static method is calling the shapes class only because
        // static cannot be overriden and also not require the object
        shapes cp= new circle();
        sh.greeting();
        circle.greeting();//you can inherit the class but cannot override

    }

    //how java know which method to run ---dynamic method dispatch
    //In java every class extends the object class by default
    //cannot override the method which is final
//    a call to one which be resolved in compile time only is known as early binding
    // the method which is to be called according to the object type of the reference variable is known as the early binding
    //sometimes we use final keyword to avoid the overriding and inheritance


}
