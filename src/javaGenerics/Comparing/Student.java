package javaGenerics.Comparing;

public class Student implements Comparable<Student>{
    int rollNo;
    float marks;

    Student(int rollNo,float marks){
        this.rollNo=rollNo;
        this.marks=marks;
    }


//this is the method compareTO
    @Override
    public int compareTo(Student o) {
//        int diff=(int)(this.marks=o.marks);
        //if diff ==0 means both are equal
        // diff < 0 means o is bigger else o is smaller
//        return diff;
        return Float.compare(this.marks,o.marks);
    }
}
