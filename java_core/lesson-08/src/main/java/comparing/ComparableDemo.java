package comparing;

import java.util.*;
import java.util.stream.Collectors;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student>students = Arrays.asList(
                new Student("duy"),
                new Student("hùng"),
                new Student("cường"),
                new Student("đức"),
                new Student("huy")
        );
        // Collection có s
        // sort sắp xếp


        // Trước
        System.out.println("------------Trước khi sắp xếp. ---------------");
        for (Student student : students) {
            System.out.println("student = " + student);
        }
        //
        Collections.sort(students);
        // Sau
        System.out.println("------------Sau khi sắp xếp. ---------------");
        for (Student student : students) {
            System.out.println("student = " + student);
        }



    }
}
