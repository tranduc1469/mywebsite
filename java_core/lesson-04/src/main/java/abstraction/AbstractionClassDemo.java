package abstraction;

// Abstraction là tính trìu tượng
// Sử dụng abstract class
// thiết kế class không thể khởi tạo đối tượng
// Ủy quyền triển khai phương thức cho class con
// Abstract class có tính trừu tượng <= 100%
// Abstract class có thể kế thừa từ 1 Abstract class khác

public class AbstractionClassDemo {

    public static void main(String[] args) {
        Dog dog = new Dog(1,"Cờ hó");
        dog.makeSound();
        // Animal animal = new Animal(2,"Sư tử");

    }
}
