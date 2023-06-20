package TestingSystem_Assignment_4.Exercise4;

import java.time.LocalDate;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Student student = new Student("Chi Pu","Ha Noi",0);
        student.setAvgScore(2);
        student.congDiem(2.5f);
        System.out.println("student = " + student);
    }
}
