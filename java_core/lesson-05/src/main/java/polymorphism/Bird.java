package polymorphism;

public class Bird extends Animal implements Flyable{


    public Bird(int id, String name) {
        super(id, name);
    }

    @Override
    public void makeSound() {
        System.out.println("Chip chip");
    }

    @Override
    public void fly() {
        System.out.println("You can fly");
    }

    @Override
    public String toString() {
        return "Bird{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
