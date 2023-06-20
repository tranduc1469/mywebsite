package flowcontrol;

public class DoWhileDemo {
    public static void main(String[] args) {
        // do while chạy khối lệnh ít nhất 1  lần
        int age = 1;

        do{
            System.out.println("tuổi của bạn là " + age);
            age = age + 1;
        } while (age < 1);
    }
}
