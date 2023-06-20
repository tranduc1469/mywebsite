package TestingSystem_Assignment_4.Exercise5.question6;


public class Sach extends TaiLieu {
    String tenTacGia;
    int soTrang;


    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public Sach(int id, String tenNhaXuatBan, String soBanPhatHanh, String tenTacGia, int soTrang) {
        super(id, tenNhaXuatBan, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    @Override
    public java.lang.String toString() {
        return "Sach{" +
                "tenTacGia=" + tenTacGia +
                ", soTrang=" + soTrang +
                ", id=" + id +
                ", tenNhaXuatBan=" + tenNhaXuatBan +
                ", soBanPhatHanh=" + soBanPhatHanh +
                '}';
    }
}
