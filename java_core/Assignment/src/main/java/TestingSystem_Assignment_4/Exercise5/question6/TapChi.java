package TestingSystem_Assignment_4.Exercise5.question6;


public class TapChi extends TaiLieu {
    int soPhatHanh;
    int thangPhatHanh;

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    public TapChi(int id, String tenNhaXuatBan, String soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
        super(id, tenNhaXuatBan, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public java.lang.String toString() {
        return "TapChi{" +
                "soPhatHanh=" + soPhatHanh +
                ", thangPhatHanh=" + thangPhatHanh +
                ", id=" + id +
                ", tenNhaXuatBan=" + tenNhaXuatBan +
                ", soBanPhatHanh=" + soBanPhatHanh +
                '}';
    }
}
