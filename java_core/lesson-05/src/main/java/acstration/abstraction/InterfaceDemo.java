package acstration.abstraction;
// Trừu tượng 100%
// Method : public abstract
// Thuộc tính (property) : public static final
// từ khóa implements
// hỗ trợ đa kế thừa

public class InterfaceDemo {
    public static void main(String[] args) {
        Bird bird = new Bird(1,"Angry Bird");
        bird.makeSound();
        bird.fly();
        bird.jump();

    }

}
