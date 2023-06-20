package acstration.abstraction;

public class Bird extends Animal implements Flyable, Jumpable {

    public Bird(int id, String name) {
        super(id, name);
    }

    @Override
    public void makeSound() {
        System.out.println("Con cac con cac...");
    }

    @Override
    public void fly() {
        System.out.println("You can fly");
    }

    @Override
    public void jump() {
        System.out.println("You can jump");
    }
}
