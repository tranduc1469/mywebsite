package objectmethod;

public class ObjectMethodDemo {
    public static void main(String[] args) {
        // Bất cứ  1 class nào đều có lớp cha là Object
        // Những phương thức được cung cấp:
        // toString, equals
        Student stusent = new Student();
        stusent.id = 1;
        stusent.name = "Duc";
        System.out.println("stusent = " + stusent);

        Student student = new Student();
        student.id = 1;
        student.name = "Duc";
        System.out.println("student = " + student);

        System.out.println("stusent.equals(student) = " + stusent.equals(student));



    }



}
