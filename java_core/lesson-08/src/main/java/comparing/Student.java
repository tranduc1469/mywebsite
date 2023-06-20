package comparing;

// Phải implements Comparable thì mới chạy được thuật toán sắp xếp comparable
public class Student implements Comparable<Student> {
    private int id;
    private String  name;
    public static int count;

    public Student(String name) {
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student that) {
        // Hàm conpareTo trả về số nguyên
        // Nếu > 0 : sắp xếp tăng dần
        // Nếu < 0 : sắp xếp nhỏ dần

        // Sắp xếp theo tên tăng dần
        // return this.name.compareTo(that.name);

        // Sắp xếp theo tên giảm dần
        // return this.name.compareTo(this.name);

        // Sắp xếp theo id tăng dần
        // kiểu nguyên thủy không có phương thức phải chuyển sang kiểu viết hoa chũ cái đầu
        return Integer.compare(that.id,this.id);

    }
}
