package TestingSystem_Assignment_4.Exercise5;

public class KySu extends CanBo {
    String nganhDaoTao;

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    public KySu(String name, int age, Gender gender, String adress, String nganhDaoTao) {
        super(name, age, gender, adress);
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return "KySu{" +
                "nganhDaoTao='" + nganhDaoTao + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", adress='" + adress + '\'' +
                '}';
    }
}
