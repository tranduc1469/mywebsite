package entity;

public class Position {
    int id;
    public PositionName name;

    @Override
    public String toString() {
        return "Position{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}
