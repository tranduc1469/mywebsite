package TestingSystem_Assignment_4.Exercise5;

public class CanBo {
    String name;
    int age;
    Gender gender;
    String adress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public CanBo(String name, int age, Gender gender, String adress) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.adress = adress;
    }
}
