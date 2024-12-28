package Object.inheritance.Principles;

public class indexHeight extends index{
    public indexHeight(int length, int width, int height, double weight) {
        super(length, width, height);//this class does not know that,,,what base class
        // is containing so it is initialised first place
//super generally calls the parents class constructor
//        used to initialise the present in parent class
        this.weight = weight;
    }

    double weight;
    indexHeight(){
        this.weight=-1;
    }
    indexHeight(double weight){
        this.weight=weight;
    }
//copy constructor inside the child class
    indexHeight(indexHeight other){
        super(other);
        weight=other.weight;
    }

    indexHeight(int side,double weight){
        super(side);
        this.weight=weight;
    }

    public static void main(String[] args) {
        indexHeight Ih=new indexHeight();
        System.out.println("default constructor of both parent and child class are called:"+Ih.weight+" "+ Ih.length);

//        index Il=new index(12,23,34);
//        System.out.println(Il.length);
        indexHeight Ik=new indexHeight(12,34,56,56);
        System.out.println("so the entire ration of the parameter is "+Ik.length* Ik.height* Ik.width* Ik.weight);

        indexHeight Ip=new indexHeight(34.5);
        System.out.println("parameters of the child class is derived"+Ip.weight);


        //parent class is referencing to child class
        //so i can access the index class parameter which are present in the super class
        index imu=new indexHeight(122,232,452,56);
        System.out.println("referencing of parent class "+imu.length);

        // what about this
//        indexHeight ihj=new index();
//        System.out.println(ihj.weight);
        indexHeight imk=new indexHeight(Ip);
        System.out.println("copy constructor value is printing "+Ip.weight);

    }
}
