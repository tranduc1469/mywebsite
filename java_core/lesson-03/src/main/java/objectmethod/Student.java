package objectmethod;

import java.util.Objects;

public class Student {
    int id;
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        //if (this == o) return true;
        //if (o == null || getClass() != o.getClass()) return false;
//
        //Student student = (Student) o;
//
        //if (id != student.id) return false;
        //return Objects.equals(name, student.name);
        return name.equals("Duc");
    }

    @Override
    public int hashCode() {
        // int result = id;
        // result = 31 * result + (name != null ? name.hashCode() : 0);
        // return result;
        return 1;
    }
}

