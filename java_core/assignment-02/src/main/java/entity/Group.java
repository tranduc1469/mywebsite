package entity;

import java.time.LocalDateTime;

public class Group {
    public int id;
    public String name;
    public Account creator;
    public LocalDateTime createdDate;
    public Account[] accounts;

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
