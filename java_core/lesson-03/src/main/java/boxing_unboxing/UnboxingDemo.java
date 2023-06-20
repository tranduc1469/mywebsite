package boxing_unboxing;

public class UnboxingDemo {
    public static void main(String[] args) {
        // từ kiểu Wrapper class lấy ra kiểu nguyên thủy

        Integer number = Integer.valueOf("5");

        // Thủ công
        int number1 = number.intValue();
        int number2 = Integer.parseInt("5");
        // Tự đông
        int number3 = number;
        // Đổi từ String sang int
        int number4 = Integer.parseInt("5");
    }
}
