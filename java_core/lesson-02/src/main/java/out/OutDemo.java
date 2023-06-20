package out;

import java.util.Locale;

public class OutDemo {
    public static void main(String[] args) {
        // kí tự xuống dòng : \n
        // kí tự nháy đơn : \'
        char c = '\'';
        // kí tự nháy kép : \"

        // println là in ra thêm 1 dòng mới
        System.out.println("Hello Java Core");
        System.out.println();
        System.out.println("Hello Java Core");

        // print: in ra bình thường không có dòng mới
        System.out.print("Hello Java Core\n");
        System.out.print("Hello Java Core\n");

        // printf : in ra  với định dạng
        // %n : xuống dòng

        // %s : đại diện cho chuỗi
        // %S (S viết hoa) : tự động đổi chuỗi sang viết hoa
        // %d : là số nguyên
        // %f : đại diện cho số thực

        // %__s : có thể cho số vào giữa dấu % và <s,d,f> thì số dấu cách tương đương sẽ được cho vào
        // số dương là căn về trái
        // số âm là căn lề phải
        // %._f : làm tròn bao nhiêu số đằng sau dấu phẩy
        // %,d : là định dạng số


        String name = "khoa";
        int age = 18;
        double score = 8.5;
        System.out.println("name = " + name + ", age = " + age + ", score = " + score );
        System.out.printf("name = %s, age = %d, score = %f\n", name , age, score);
        System.out.printf(new Locale("vi","VN"),"%,d", 10000);

    }
}
