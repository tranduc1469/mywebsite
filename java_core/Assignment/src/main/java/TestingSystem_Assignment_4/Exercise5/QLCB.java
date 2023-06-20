package TestingSystem_Assignment_4.Exercise5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCB {
    Scanner scanner = new Scanner(System.in);
    List<CanBo> canBos = new ArrayList<>();
    public void create(){
        System.out.println("Nhập các số dưới đây để thêm cán bộ tương ứng.");
        System.out.println("1. Thêm Công Nhân");
        System.out.println("2. Thêm Kỹ Sư");
        int num = scanner.nextInt();

        System.out.println("Xin nhập vào tên");
        String name = scanner.next();
        System.out.println("Xin nhập vào tuổi");
        int age = scanner.nextInt();
        System.out.println("Xin nhập vào giới tính 1: NAM, 2: NỮ");
        Gender gender = Gender.values()[(scanner.nextInt() - 1)];
        scanner.nextLine();
        System.out.println("Xin nhập vào địa chỉ");
        String adress = scanner.nextLine();
        if (num == 1) {
            System.out.println("Xin nhập vào cấp bậc");
            int capBac = scanner.nextInt();
            CongNhan congNhan = new CongNhan(name,age,gender,adress,capBac);
            canBos.add(congNhan);
        }
        else if (num == 2) {
            System.out.println("Xin nhập vào ngành học");
            String nganhHoc = scanner.next();
            KySu kySu = new KySu(name,age,gender,adress,nganhHoc);
            canBos.add(kySu);
        }else {
            System.out.println("Vui long chon dung chuc nang");
        }

    }
    public void fillByName(){
        System.out.println("Nhập vào họ tên cần tìm: ");
        String hoTen = scanner.nextLine();
        for (CanBo canBo : canBos) {
            if (canBo.getName().equals(hoTen)) {
                System.out.println("canBo = " + canBo);
            }
        }
    }
    public void printInfor(){
        for (CanBo canBo : canBos) {
            System.out.println("canBo = " + canBo);
        }
    }
    public void deleteByName(){

    }
}
