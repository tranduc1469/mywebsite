package object;

public class WrapperClassDemo {
    public static void main(String[] args) {
        // Primitive => Wrapper Class
        // byte      => Byte
        // short     => Short
        // int       => Integer
        // float     => Float
        // double    => Double
        // char      => Character

        // Wrapper Class sẽ chiếm nhiều bộ nhớ hơn Primitive
        // Lí do cần Wrapper Class
        // 1. Cung cấp các phương thức mà kiểu nguyên thủy không có
        // 2. Lưu trữ các thông tin hữu ích
        // 3. Có thể chứa giá  trị null


        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);

        int number = 5;
        Integer iNumber = new Integer(5);

        System.out.println("number = " + number);
        System.out.println("iNumber = " + iNumber);
    }
}
