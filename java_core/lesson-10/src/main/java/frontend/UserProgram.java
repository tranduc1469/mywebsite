package frontend;

import backend.controller.UserController;
import entity.User;
import utils.JDBCUtils;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class UserProgram {
    // Kiến trúc 3 tầng : Repository -> Service -> Controller
    // Repository : Người lấy nguyên liệu (Thao tác trục tiếp (lấy dữ liệu) với database)
    // Service : Người đầu bếp ( Xử lý dữ liệu đã lấy)
    // Controller : Người phục vụ

    // JDBC : Java Database Connectivity
    // Connection : Kết nối vật lý tới database

    // So sánh statement vs PreparedStatement
    // Statement : Dùng để tạo câu truy vấn KHÔNG CÓ THAM SỐ
    // PreparedStatement : Dùng để tạo câu truy vấn CÓ THAM SỐ
    // Statement.executeQuery() : Lấy dữ  liệu trong database (SElECT)
    // Statement.executeQuery() : Cập nhập dữ liệu trong database (INSERT, UPDATE, DELETE)



    public static void main(String[] args) throws SQLException, IOException {
        // JDBCUtils.checkConnection();
        UserFunction function = new UserFunction();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Thêm user");
            System.out.println("2. Hiển thị danh sách user");
            System.out.println("3. Xóa user theo id");
            System.out.println("4. Thoát chương trình");
            System.out.println("Mời bạn chọn chương trình");

            int menu = scanner.nextInt();
            if (menu == 1) {
                function.create();
            } else if (menu == 2) {
                function.findAll();
            } else if (menu == 3) {
                function.deleteById();
            } else if (menu == 4) {
                return;
            } else {
                System.out.println("Vui lòng chọn chức năng");
            }
        }

    }
}
