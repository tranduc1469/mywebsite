package entity;

public class HinhChuNhat {
    protected int chieuDai;
    protected int chieuRong;

    public HinhChuNhat(int chieuDai, int chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    public int chuVi(){
        return (chieuDai + chieuRong)*2;

    }
    public int dienTich(){
        return chieuDai*chieuRong;

    }

}
