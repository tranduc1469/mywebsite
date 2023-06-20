package comparing;

import java.util.*;

// Không cần phải implements Comparable thì mới chạy được thuật toán sắp xếp comparator
public class ComparatorDemo {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
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

        // Triển khai phương thức sắp xếp
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        // Sau
        System.out.println("------------Sau khi sắp xếp. ---------------");
        for (Student student : students) {
            System.out.println("student = " + student);
        }




    }

}
