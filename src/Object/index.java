package Object;

public class index {

    static class Student{
        int ArrNo; //instance variables
        String name;
        double marks;


//        we need a way to add the values of the above properties object by object
//        we need one word to access every object
//        default constructor
        Student(){
            this.ArrNo=23;
            this.marks=97;
            this.name="sr";
    //this keyword will put the another
        }

        void greeting(){
            System.out.println("hello brother greeting function is called "+ this.name);
        }

       Student(int ArrNo,String name,float marks ){
           this.ArrNo=ArrNo;
           this.name=name;
           this.marks=marks;

        }

        Student (Student other){
//            random.name=kun.name;
            this.ArrNo= other.ArrNo;
            this.name= other.name;
            this.marks=other.marks;
        }

//        calling another constructor inside the constructor
        //internally :new Student(parameters)
//        Student(){
//        this(13,"default",12);
//        }

//  you cannot free the memory by yourself but you can info the program what to do
//        @Override
//        protected void finalize() throws Throwable {
//            System.out.println("Object is destroyed");
//
//        }
    }


    public static class Car{
        String name;
        String EngineSpecs;
        int Price;
        int Miles;
    }


    public static void main(String[] args) {
        //object oriented programming

//   class is the group of name,id,(properties)
//        Student[] students=new Student[9];
        Student sum=new Student();
        Student kun=new Student(12,"mike",89.1f);
//        kun.marks=32.21;  //marks inside the student object is value 32.23
//        sum.marks=13.56;
//        sum.ArrNo=12;
//        sum.name="Sumit rai";
        System.out.println("marks for the ind man "+sum.marks);
        System.out.println("name for the indian man "+sum.name);
        System.out.println(sum.ArrNo);

        System.out.println("marks for the chinese man "+kun.marks);
//        All of these are calling the default constructor

        System.out.println(kun.ArrNo+" "+ kun.marks+" "+kun.name);
//        sum.greeting();

        Student random=new Student(kun);
        System.out.println("details foe the random "+random.name);

//        another class instance
        Car Maruti;
        Maruti = new Car();
        Maruti.name="Ciaz";
        System.out.println(Maruti.name);


//   object is the instance of the class ---physical reality // occupy space in memory
//   new allocate the memory in runtime and return reference to it
//   compile time--byte code--jvm--output
//   runtime--while running the memory is allocated in the ram

//        constructor
//        it is special function  when you create the object and it allocates some variables

    }
}
