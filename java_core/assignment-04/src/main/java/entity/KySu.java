package entity;

public class KySu extends CánBộ {
    private String nganhDaoTao;

    public KySu(String hoTen, int tuoi, GioiTInh gioiTinh, String diaChi) {
        super(hoTen, tuoi, gioiTinh, diaChi);
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }
}
