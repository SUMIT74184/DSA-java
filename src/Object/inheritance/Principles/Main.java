package Object.inheritance.Principles;

public class Main {
    public static void main(String[] args) {
        //cube
//        index in=new index(32);
//        System.out.println(in.length*in.height* in.width);


        //triangle
//        index tri=new index(12,23,34);
//        System.out.println(tri.length* tri.width* tri.height);

        //copy constructor values passing the another object into the existing
//        index od=new index(tri);
//        System.out.println(tri.length+ tri.width+ tri.height);

        //default constructor
//        index og=new index();
//        System.out.println(og.length+og.width+og.height);
//

        indexPrice all=new indexPrice(12,23,34,56,78);
        System.out.println(all.weight);

        indexPrice ibp=new indexPrice(12,54,45);
        System.out.println(ibp.cost);
    }
}

//multiple inheritance is not allowed in java due to the problem of Ambiguity--not allowed
//hierarchical inheritance is different classes are inheriting each other
//hybrid inheritance is combination of single and multiple inheritance--not allowed