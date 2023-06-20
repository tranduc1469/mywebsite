package datatypecasting;

public class WideningDemo {

    // Widening là nới rộng
    // Số nguyên byte 1, short 2, int 4, long 8, float 4, double 8
    // byte -> short -> byte -> long -> float -> double

    public static void main(String[] args) {
        int iNumber = 10;
        long lNumber = iNumber;
        System.out.println("lNumber = " + lNumber);


    }
}
