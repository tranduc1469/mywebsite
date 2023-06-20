package backend;

import entity.Student;

public class Execise04 {
    public static void question01(){
        Student student = new Student();
        student.setScore(5.0);
        student.plusScore(3.5);
        student.showInfor();
        System.out.println("student = " + student);


    }
}
