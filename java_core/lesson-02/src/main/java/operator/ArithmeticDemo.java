package operator;

public class ArithmeticDemo {
    public static void main(String[] args) {
        int x = 1050;
        int y = 100;
        System.out.println("(x+i) = " + (x + y));
        System.out.println("(x-y) = " + (x - y));
        System.out.println("(x*y) = " + (x * y));
        System.out.println("(x/y) = " + (x / y));
        System.out.println("(x%y) = " + (x % y));


        // x = x+50;
        //x += 50;
        // Tiền tố ++<tên biến> : cộng trước gán sau
        // <tên biến>++ : gán trước cộng sau
        // ++x sẽ cộng 1 vào z
        // x++ cộng 1 vào x
        int z = x++ + y;
        System.out.println("z = " + z);
        System.out.println("x = " + x);

    }
}
