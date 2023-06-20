package TestingSystem_Assignment_4.Exercise5;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        boolean i = true;
        QLCB qlcb = new QLCB();
        Scanner scanner = new Scanner(System.in);
        while (i) {
            System.out.println("Mời nhập vào số tương ứng với mỗi chức năng.");
            int maMenu = scanner.nextInt();
            switch (maMenu){
                case 1:
                    System.out.println("Thêm mới cán bộ");
                    qlcb.create();
                    break;
                case 2:
                    System.out.println("Tìm kiếm theo tên");
                    qlcb.fillByName();
                    break;
                case 3:
                    System.out.println("Hiển thị thông tin về danh sách các cán bộ");
                    qlcb.printInfor();
                    break;
                case 4:
                    System.out.println("Nhập vào tên và xóa cán bộ đó");
                    qlcb.deleteByName();
                    break;
                case 5:
                    System.out.println("Thoát chương trình");
                    i = false;
                    break;
            }
        }
    }
}
