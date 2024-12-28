package Object.sumit.intrd;



public class InnerClass {
//static is present
  static class Testing{
        String name;

        Testing(String name){
            this.name=name;

        }
    }
//    static void Learning(){
//        System.out.println("now we can access this");
//    }

public static void main(String[] args) {
    Testing obj=new Testing("paari");
    System.out.println(obj.name);

    InnerClass obj2=new InnerClass();
//    InnerClass.name();
}


}
