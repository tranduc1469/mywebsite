package entity;

public class CongNhan extends CánBộ {
    private int bac;


    public CongNhan(String hoTen, int tuoi, GioiTInh gioiTinh, String diaChi, int bac) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.bac = bac;
    }
}
