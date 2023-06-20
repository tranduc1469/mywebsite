package encapsulations;

import encapsulations.entity.Student;

public class GetterSetterDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(1);
        student.setName("Đức");
        System.out.println("student = " + student);
    }
}
