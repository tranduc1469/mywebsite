package entity;

public class CánBộ {

        protected String  hoTen;
        protected int tuoi;
        protected GioiTInh gioiTinh;
        protected String diaChi;

    public CánBộ(String hoTen, int tuoi, GioiTInh gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public GioiTInh getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(GioiTInh gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
