package javaGenerics.Comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student sumit = new Student(12, 23.0f);
        Student rahul = new Student(13, 34.0f);

        int result = sumit.compareTo(rahul); // Store the result
    Student[] list={sumit,rahul};
        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int)(o1.marks-o2.marks);
            }
        });


        if (result < 0) {
            System.out.println(result); // Print the difference
            System.out.println("Sumit just lost the match");
        } else if (result > 0) {
            System.out.println(result);
            System.out.println("Sumit won the match");
        } else {
            System.out.println(result);
            System.out.println("It's a tie!");
        }
    }
}
//integer value is type casted in this