package testDaHInh;

public class Bird extends Animal implements Flyable{
    int soChan;

    @Override
    public void makeSound() {
        System.out.println("Chip Chip");
    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
