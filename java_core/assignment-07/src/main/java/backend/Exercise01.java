package backend;

import entity.Student;

import java.util.Arrays;
import java.util.List;

public class Exercise01 {

    public static void question01(){
        Student studentA = new Student("Nguyen Van A");
        Student studentB = new Student("Nguyen Van B");
        Student studentC = new Student("Nguyen Van C");

        Student.setCollege("Đại học Bách Khoa");
        for (Student student : Arrays.asList(studentA, studentB, studentC)) {
            System.out.println("student = " + student);
        }

        Student.setCollege("Đại học công nghệ");
        for (Student student : Arrays.asList(studentA, studentB, studentC)) {
            System.out.println("student = " + student);
        }
        System.out.println("Số học sinh được tạo là " + Student.count);

    }
}
