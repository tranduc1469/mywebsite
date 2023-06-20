package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TuyenSinh implements ITuyenSinh {
    protected Scanner scanner = new Scanner(System.in);

    protected List<Student> studentsList = new ArrayList<>();


    @Override
    public void themThiSinh() {
        System.out.println("Nhập vào thí sinh.");
        System.out.println("Nhập vào SBD");
        String soBaoDanh = scanner.next();

        scanner.nextLine();

        System.out.println("Nhập vào họ và tên: ");
        String hoTen = scanner.nextLine();

        System.out.println("Nhập địa chỉ ");
        String diaChi = scanner.nextLine();

        System.out.println("Nhập vào mức ưu tiên");
        int mucUuTien = scanner.nextInt();
        System.out.println("Nhập vào khối thi");
        char khoiThi  = scanner.next().charAt(0);

        Student student = new Student (soBaoDanh,hoTen,diaChi,mucUuTien);


    }

    @Override
    public void hienThiDSTS() {
        for (Student student: studentsList){
            System.out.println("student = " + student);
        }

    }

    @Override
    public void timKiemTheoSBD() {
        System.out.println("Nhập SBD cần tìm");
        String soBaoDanh = scanner.next();
        for (Student student : studentsList) {
            if (student.getSoBaoDanh().equals(soBaoDanh)) {
                System.out.println("student = " + student);
            }

        }
    }
}
