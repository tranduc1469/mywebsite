package entity;

public class Student {
    protected String soBaoDanh;
    protected String hoTen;
    protected String diaChi;
    protected int mucUuTien;
    protected char khoiThi;


    public Student(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        this.soBaoDanh = soBaoDanh;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.mucUuTien = mucUuTien;
    }

    public String getSoBaoDanh() {
        return soBaoDanh;
    }

    public void setSoBaoDanh(String soBaoDanh) {
        this.soBaoDanh = soBaoDanh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getMucUuTien() {
        return mucUuTien;
    }

    public void setMucUuTien(int mucUuTien) {
        this.mucUuTien = mucUuTien;
    }

    public char getKhoiThi() {
        return khoiThi;
    }

    public void setKhoiThi(char khoiThi) {
        this.khoiThi = khoiThi;
    }

    @Override
    public String toString() {
        return "Student{" +
                "soBaoDanh='" + soBaoDanh + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", mucUuTien=" + mucUuTien +
                ", khoiThi=" + khoiThi +
                '}';
    }
}
