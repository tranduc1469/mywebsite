package scanner;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập vào 1 từ
        System.out.println("Nhập tên của bạn");
        String name = scanner.next();
        System.out.println("Tên của bạn là: " + name);


        // Chú ý: Nếu bên trên nextLine() không phải  là một nextLine()
        // thì mình cần ăn bỏ kí tự SPACE hoặc ENTER


        // cách bỏ kí tự SPACE hoặc ENTER
        scanner.nextLine();

        // Nhập vào 1 chuỗi
        System.out.println("Nhập vào họ và tên của bạn");
        String fullName = scanner.nextLine();
        System.out.println("Họ và tên là: " + fullName);

        // Nhập vào 1 số nguyên
        // System.out.println("Nhâp tuổi của bạn: ");
        // int age = scanner.nextInt();
        // System.out.println("Tuổi của bạn là: "  + age);

        // Kiểm tra định dạng đầu vào
        while (true){
            System.out.println("Nhâp tuổi của bạn: ");
            if (scanner.hasNextInt()) {
                int age = scanner.nextInt();
                System.out.println("Nhâp tuổi của bạn: ");
                break;
            } else {
                scanner.nextLine();
                System.out.println("Vui lòng nhập đúng định dạng");
            }
        }
        // Chuyển đổi chuỗi người dùng nhập vào sang định dạng ngày tháng
        System.out.println("Nhập vào định dạng Năm-Tháng-Ngày");
        String str = scanner.next();
        LocalDate birthday = LocalDate.parse(str);
        // parse : Giải mã chuỗi

        System.out.println("Hôm nay là " + birthday);


        scanner.close();

    }
}
