package method;

public class MethodDemo {
    public static void main(String[] args) {
        int c = sum(10, 100);
        System.out.println("c = " + c);
    }

    // [] : có hoặc không => vs: public
    // <> : phải có
    // Cú pháp
    // [Phạm vi truy cập] [static] <kiểu dữ liệu trả về> <tên phương thức>(kiểu dữ liệu or tên tham số, ...) {khối lệnh}
    // void : phương thức không trả về dữ liệu
    // return : Trả về dữ liệu

    public static int sum(int a, int b) {

        return a + b;

    }
}