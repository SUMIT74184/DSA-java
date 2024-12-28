package Object.sumit.intrd;

public class StaticBlock {
    static int a=4;
    static int b;

    //will run only once when the first time class is fully loaded
    static{
        b=a*5;
        System.out.println("inside the static block");
    }

    public static void main(String[] args) {
        StaticBlock obj =new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);

        StaticBlock.b=StaticBlock.b+3;

        StaticBlock obj2=new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);

        StaticBlock obj3=new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
    }
}
