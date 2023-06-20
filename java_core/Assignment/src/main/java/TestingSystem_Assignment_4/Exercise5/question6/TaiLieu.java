package TestingSystem_Assignment_4.Exercise5.question6;


public class TaiLieu {
    int id;
    String tenNhaXuatBan;
    String soBanPhatHanh;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenNhaXuatBan() {
        return tenNhaXuatBan;
    }

    public void setTenNhaXuatBan(String tenNhaXuatBan) {
        this.tenNhaXuatBan = tenNhaXuatBan;
    }

    public String getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(String soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public TaiLieu(int id, String tenNhaXuatBan, String soBanPhatHanh) {
        this.id = id;
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    @Override
    public java.lang.String toString() {
        return "TaiLieu{" +
                "id=" + id +
                ", tenNhaXuatBan=" + tenNhaXuatBan +
                ", soBanPhatHanh=" + soBanPhatHanh +
                '}';
    }
}
