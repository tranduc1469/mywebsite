package entity;

public class NhanVien extends CánBộ {
    private String congViec;
    public NhanVien(String hoTen, int tuoi, GioiTInh gioiTinh, String diaChi) {
        super(hoTen, tuoi, gioiTinh, diaChi);
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }
}
