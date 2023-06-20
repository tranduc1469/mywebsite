package finals;

public class Animal {
    private final String name;
    public void eat(){

        System.out.println("Animal should be eat...");
    }

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
