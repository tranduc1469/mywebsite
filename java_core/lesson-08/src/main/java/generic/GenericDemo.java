package generic;
// Generic : Trong ngoặc nhọn không dùng với kiểu nguyên thủy, phải dùng kiểu object
// Có thể sủ dụng cho property và method

// Các kí tự viết tắt và ý nghĩa
// T : Type (loại)
// E : Element ( thường dung với List)
// N : Number
// K : Key
// V : Value


// Giới hạn kiểu dử dữ liệu cho kiểu dữ liệu tự khai báo

// Wildcard : ? , extends, super
// ? : Không quan tâm đến kiểu dữ liệu


import java.util.Arrays;
import java.util.List;

public class GenericDemo {

    public static void main(String[] args) {

        // Trong ngoặc nhọn không dùng với kiểu nguyên thủy, phải dùng kiểu object
        Circle<Integer> circle = new Circle(10);
        System.out.println("circle = " + circle);

        showInfor(circle);
        showInfor("hùng");
        showInfor(100);

        // Wildcard
        List<Integer> scores = Arrays.asList(1,2,3,4,5);
        System.out.println("length(scores) = " + length(scores));
    }
    private static int length(List<?> list){
        return list.size();
    }

    // Để trước dữ liệu tuyền vào
    private static <T> void showInfor(T a){
        System.out.println("showInfor() " + a);

    }
}
