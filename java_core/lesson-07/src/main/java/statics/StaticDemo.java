package statics;
// static : Thuộc về class(tập thể)
// Có thể dùng ở class, property, method


// Tiết kiệm bộ nhớ
// Giá trị lưu từ lúc chạy đến lúc kết thúc chương trình ( Bộ nhớ giải phóng đến lúc kết thúc chương trình)
// Static method chỉ gọi được static method khác
//

public class StaticDemo {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        System.out.println("myMath.sum() = " + myMath.sum(1,6));


        System.out.println("MyMath.sum(1,2,3) = " + MyMath.sum(1, 2, 3));

    }
}
