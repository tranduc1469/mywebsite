package string;

public class StringDemo {
    public static void main(String[] args) {
        // String vừa là kểu nguyên thủy vừa là kiểu object

        // Kiểu nguyên thủy
        String s1 = "Java core";

        // Kiểu object
        String s2 = new String("Java core");

        System.out.println("s1 == s2 = " + (s1 == s2));
        System.out.println("s1.equals(s2) = " + s1.equals(s2));

        // Với toán tử == : so sánh theo ô nhớ
        // equals : So sánh theo nội dung
        // Kết luận : Nếu  có  object tham gia vào phép so sánh thì  sử dụng equals


    }
}
