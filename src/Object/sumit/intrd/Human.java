package Object.sumit.intrd;

public class Human {
    public static class Man{
        int age;
        String name;
        int Salary;
       static long population;


//        parameterised constructor
        public Man(int age, String name, int salary1) {
//            .dot operator binds the instance variable with reference variable
            this.age = age;
            this.name = name;
            this.Salary = salary1;
            Man.population +=1;

        }
    }
//    public static void main(String[] args) {
//          Man bs=new Man(12,"sumit",400000);
//        System.out.println("man new in the middle ");
//
//    }
}
