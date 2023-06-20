package TestingSystem_Assignment_4.Exercise5.question6;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QLTV qltv = new QLTV();
        while (true) {
            System.out.println("Chọn số ứng với chương trình tương ứng");
            System.out.println("1. Thêm mới tài liệu");
            System.out.println("2. Hiển thị thông tin mã tài liệu");
            System.out.println("3. Tìm kiếm tài liệu theo loại");
            System.out.println("4. Thông tin mượn sách");
            System.out.println("5. Thoát chương trình");

            int maMenu = scanner.nextInt();
            switch (maMenu){
                case 1:
                    System.out.println("Thêm mới tài liệu");
                    qltv.create();
                    break;
                case 2:
                    System.out.println("Hiển thị thông tin mã tài liệu");
                    qltv.showInfo();
                    break;
                case 3:
                    System.out.println("Tìm kiếm tài liệu theo loại");
                    qltv.fillById();
                    break;
                case 4:
                    System.out.println("Thông tin mượn sách");
                    qltv.ttMuonSach();
                    break;
                case 5:
                    System.out.println("Thoát chương trình");
                    return;
            }
        }
    }
}
