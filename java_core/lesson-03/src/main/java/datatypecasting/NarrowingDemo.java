package datatypecasting;

public class NarrowingDemo {

    // Narrowing là thu hẹp
    // Số nguyên byte 1, short 2, int 4, long 8, float 4, double 8
    // byte <- short <- byte <- long <- float <- double

    public static void main(String[] args) {
        // Vd1
        int iNumber = 10;
        byte bNumber = (byte) iNumber;
        System.out.println("bNumber = " + bNumber);

        // Chú ý : Có thể tràn số

        long lDanSo = 8000000000L ;
        int  iDanSo = (int) lDanSo;
        System.out.println("iDanSo = " + iDanSo);
        // Vd2

        // Trong 1 phép toán, kiểu dữ liệu trả về là lớn nhất
        int a = 1;
        int b = 2;

        System.out.println("(a / b) = " + ((float)a / b));

    }
}
