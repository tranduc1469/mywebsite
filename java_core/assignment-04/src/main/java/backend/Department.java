package backend;

public class Department {
    int id;
    String name;

    public Department() {
    }

    public Department(int id, String name) {
        this.id = 0;
        this.name = name;
    }

    @Override
    public String toString() {
        return "backend.Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
