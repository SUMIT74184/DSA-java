package Object.sumit.intrd;

public class Main {

     static void FUnction(){
        //greeting();

//       so by making it for the Main object we can access the non-static functions
//       you cannot access non-static stuff without referencing their instances in a static context
        Main obj=new Main();  //Main of the major class
        obj.greeting();

    }

    void FUnction2(){
        //so somewhere at the end this function is going to be called inside the main function with obj
        greeting();
    }

    void greeting(){
        System.out.println("A non-static function");
    }
    //everything is present inside the Man class for the human
    public static void main(String[] args) {
        Human.Man bs=new Human.Man(22,"sd",23456);
        System.out.println(bs.name);
        System.out.println(Human.Man.population);

        Human.Man Kp=new Human.Man(32,"rahul",12443);
        System.out.println(Human.Man.population);

        Human.Man bk=new Human.Man(32,"hul",12443);
        System.out.println(Human.Man.population);

        //static variable are not dependent on the object but still we can use the referencing and it will work
        //static method can access on static data not the non-static data

        //non-static function can access the static data and the functions
    }


}
