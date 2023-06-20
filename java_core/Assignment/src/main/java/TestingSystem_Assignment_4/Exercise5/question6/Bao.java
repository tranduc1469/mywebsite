package TestingSystem_Assignment_4.Exercise5.question6;


public class Bao extends TaiLieu {
    int ngayPhatHanh;

    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Bao(int id, String tenNhaXuatBan, String soBanPhatHanh, int ngayPhatHanh) {
        super(id, tenNhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public java.lang.String toString() {
        return "Bao{" +
                "ngayPhatHanh=" + ngayPhatHanh +
                ", id=" + id +
                ", tenNhaXuatBan=" + tenNhaXuatBan +
                ", soBanPhatHanh=" + soBanPhatHanh +
                '}';
    }
}
