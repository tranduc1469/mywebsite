package constuctor;

public class ConsrtuctorDemo {
    // Constructor : Phương thức trả về
    // 1. Không có dữ liệu trả về
    // 2. Tên phương thức là tên class

    // 3. This trỏ đến chính đổi tượng phía trên
    // Default Constructor : Không tham số
    public static void main(String[] args) {

        Student student = new Student(1,"Duc");
        System.out.println("student = " + student);

    }
}
