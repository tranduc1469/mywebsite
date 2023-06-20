package annotation;

public class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Go, Go");
    }
    @SuppressWarnings("deprecation")
    @Override
    public void eat() {
        super.eat();
    }

}
