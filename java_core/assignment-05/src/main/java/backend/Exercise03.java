package backend;

import entity.HinhVuong;

public class Exercise03 {
    public static void question03() {
        System.out.println("tinh chu vi hinh vuong");
        HinhVuong hinhVuong = new HinhVuong(4);
        System.out.println("hinhVuong.chuVi() = " + hinhVuong.chuVi());
    }
}
