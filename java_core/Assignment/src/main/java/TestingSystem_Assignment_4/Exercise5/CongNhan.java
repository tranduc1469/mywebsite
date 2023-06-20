package TestingSystem_Assignment_4.Exercise5;

public class CongNhan extends CanBo{
    int capBac;

    public int getCapBac() {
        return capBac;
    }

    public void setCapBac(int capBac) {
        this.capBac = capBac;
    }

    public CongNhan(String name, int age, Gender gender, String adress, int capBac) {
        super(name, age, gender, adress);
        this.capBac = capBac;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "capBac=" + capBac +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", adress='" + adress + '\'' +
                '}';
    }
}
