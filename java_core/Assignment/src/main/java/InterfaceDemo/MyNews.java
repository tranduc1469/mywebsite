package InterfaceDemo;

import java.util.Scanner;

public class MyNews {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HandleMenu handleMenu = new HandleMenu();
        while (true){
            System.out.println("Mời nhập vào số tương ứng với chức năng sau.");
            System.out.println("1.Đăng bài.");
            System.out.println("2.Xem danh sách.");
            System.out.println("3.Tỷ lệ trung bình.");
            System.out.println("4.Thoát chương trình.");
            int maSo = sc.nextInt();
            switch (maSo) {
                case 1:
                    System.out.println("Đăng bài");
                    handleMenu.insertNews();
                    break;
                case 2:
                    System.out.println("Xem danh sách");
                    handleMenu.viewalistnews();
                    break;
                case 3:
                    System.out.println("Tỷ lệ trung bình");
                    handleMenu.xemDanhGiaTb();
                    break;
                case 4:
                    System.out.println("Thoát chương trình");
                    return;
            }
        }

    }

}
