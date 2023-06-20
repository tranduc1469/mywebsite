package generic;

// Để sau tên class
public class Circle<T extends Number> {
    private T radius;

    public Circle(T radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
