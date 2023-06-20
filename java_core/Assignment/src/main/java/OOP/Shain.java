package OOP;

public class Shain extends Gyoumu {
    int id;
    String name;

    public Shain(String tenCongTy, String tenPhongban, int id, String name1) {
        super(tenCongTy, tenPhongban);
        this.id = id;
        this.name = name1;
    }

    @Override
    public String toString() {
        return "Shain{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tenPhongban='" + tenPhongban + '\'' +
                ", tenCongTy='" + tenCongTy + '\'' +
                '}';
    }
}
