package gc;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + " đã bị bay màu. ");
    }
}
