package polymorphism;

public class Dog extends Animal{

    public Dog(int id, String name) {
        super(id, name);
    }

    @Override
    public void makeSound() {
        System.out.println("Go Go");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
