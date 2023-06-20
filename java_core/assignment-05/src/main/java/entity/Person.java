package entity;

import java.util.Scanner;

public class Person {

    String ten;
    GioiTInh gioiTinh;
    int ngaySinh;
    String diaChi;

    public Person() {
    }

    public Person(String ten, GioiTInh gioiTinh, int ngaySinh, String diaChi) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public GioiTInh getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(GioiTInh gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(int ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ten='" + ten + '\'' +
                ", gioiTinh=" + gioiTinh +
                ", ngaySinh=" + ngaySinh +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }

    public void inputInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào thông tin");
        System.out.println("Nhập vào tên sinh viên");
        this.ten = scanner.nextLine();
        System.out.println("Nhập giới tính");
        this.gioiTinh = GioiTInh.values()[scanner.nextInt() - 1];
        System.out.println("Nhâp vào ngày sinh");
        int ngaySinh =scanner.nextInt();
        System.out.println("Nhập vào địa chỉ");
        String diaChi = scanner.nextLine();

    }
    public void showInfo(){

        System.out.println(this);

    }

}
