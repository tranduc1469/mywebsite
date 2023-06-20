package Entity;

import utils.ScannerUtils;

public class Account {
    int id;
    int age;
    String name;

    public Account() {
        System.out.println("Mời bạn nhập vào account.");

        System.out.println("Nhập vào account id: ");
        this.id = ScannerUtils.inputPositiveInt("Nhập lại");

        System.out.println("Nhập vào age: ");
        this.age = ScannerUtils.inputAge();
    }

    public int inputAge(){

        int age = ScannerUtils.inputInt("Nhập lại");

        if (age > 0){
            return age;
        }
        throw new InvalidAgeInputingException("The age must be greater than 0");

    }
    public int inputAccountAge(){
        while(true){
            try{
                int age = inputAge();
                if (age < 18) {
                    System.out.println("Your age must be greater than 18");
                    System.out.println("Nhap lai");
                } else {
                    return age;
                }

            } catch (InvalidAgeInputingException e){
                throw new RuntimeException(e.getMessage());
            }
        }
    }

    public Account(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

}
