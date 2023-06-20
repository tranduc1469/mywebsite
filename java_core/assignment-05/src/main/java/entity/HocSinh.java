package entity;

import com.sun.xml.internal.fastinfoset.util.PrefixArray;

import java.util.Scanner;

public class HocSinh extends Person {
    private String maSinhVien;
    private double diemTrungBinh;
    private String email;

    public HocSinh() {
    }

    public HocSinh(String ten, GioiTInh gioiTinh, int ngaySinh, String diaChi, String maSinhVien, double diemTrungBinh, String email) {
        super(ten, gioiTinh, ngaySinh, diaChi);
        this.maSinhVien = maSinhVien;
        this.diemTrungBinh = diemTrungBinh;
        this.email = email;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "HocSinh{" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", diemTrungBinh=" + diemTrungBinh +
                ", email='" + email + '\'' +
                ", ten='" + ten + '\'' +
                ", gioiTinh=" + gioiTinh +
                ", ngaySinh=" + ngaySinh +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }

    @Override
    public void inputInfo() {
        super.inputInfo();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào thông tin học sinh.");

        System.out.println("Nhập vào mã sinh viên.");
        this.maSinhVien = scanner.next();
        System.out.println("Nhập vào điểm trung bình.");
        this.diemTrungBinh = scanner.nextDouble();
        System.out.println("Nhập vào email.");
        this.email = scanner.next();
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(this);
    }
    public boolean datDuocHocBong(){
        return diemTrungBinh >= 8 ;
    }


}
