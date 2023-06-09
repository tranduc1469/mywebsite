package entity;

public class Student {
    private int id;
    private String name;
    private int count;

    public Student( String name) {
        this.id = ++count;
        this.name = name;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
