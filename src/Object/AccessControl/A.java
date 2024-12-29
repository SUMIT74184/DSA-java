package Object.AccessControl;

public class A {
    private int num;
    //if we will not set the access to it by default it is always the private
    String name;
    int []arr;


//    both getter and setter are used to invoke the data from the private modifiers
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }



    A(int num,String name){
        this.num=num;
        this.name=name;
        this.arr=new int[21];
    }

    //access modifiers
}
