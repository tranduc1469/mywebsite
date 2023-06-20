package frontend;

import backend.controller.IUserController;
import backend.controller.UserController;
import entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class UserFunction {
    private final IUserController controller = new UserController();

    public void showEmloyeeMenu() throws SQLException, IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Thêm user");
            System.out.println("2. Hiển thị danh sách user");
            System.out.println("3. Tìm kiếm user theo id");
            System.out.println("4. Thoát chương trình");
            System.out.println("Mời bạn chọn chức năng");

            int menu = scanner.nextInt();
            if (menu == 1) {
                return;
            } else if (menu == 2) {
                findAll();
            } else if (menu == 3) {
                findById();
            } else {
                System.out.println("Vui lòng chọn chức năng");
            }
        }
    }

    public void showAdminMenu() throws SQLException, IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Đăng xuất");
            System.out.println("2. Hiển thị danh sách user");
            System.out.println("3. Tìm kiếm user theo id");
            System.out.println("4. Thêm user");
            System.out.println("5. Xóa user theo id");
            System.out.println("Mời bạn chọn chức năng");

            int menu = scanner.nextInt();

            if (menu == 1) {
                return;
            } else if (menu == 2) {
                findAll();
            } else if (menu == 3) {
                findById();
            } else if (menu == 4) {
                create();
            } else if (menu == 5) {
                deleteById();
            } else {
                System.out.println("Vui lòng chọn chức năng");
            }
        }
    }

    public void findAll() throws SQLException, IOException {
        List<User> users = controller.findAll();
        System.out.println("+------+--------------------+--------------------+");
        System.out.println("|  ID  |        NAME        |        EMAIL       |");
        System.out.println("+------+--------------------+--------------------+");
        if(users.isEmpty()){
            System.out.printf("| %-4s | %-18s | %-18s |%n", "null", "null", "null");
            System.out.println("+------+--------------------+--------------------+");
        }else {
            for (User user : users) {
                System.out.printf("| %-4d | %-18s | %-18s |%n", user.getId(), user.getFullName(), user.getEmail() );

            }
            System.out.println("+------+--------------------+--------------------+");
        }
    }

    public void findById() throws SQLException, IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào id cần xóa");
        int id = scanner.nextInt();
        User users = controller.findById(id);
        System.out.println("+------+--------------------+--------------------+");
        System.out.println("|  ID  |        NAME        |        EMAIL       |");
        System.out.println("+------+--------------------+--------------------+");
        if(users == null){
            System.out.printf("| %-4s | %-18s | %-18s |%n", "null", "null", "null");
            System.out.println("+------+--------------------+--------------------+");
        }else {
            System.out.printf("| %-4d | %-18s | %-18s |%n", users.getId(), users.getFullName(), users.getEmail()) ;
            System.out.println("+------+--------------------+--------------------+");
        }
    }
    public void deleteById() throws SQLException, IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào id cần xóa");
        int id = scanner.nextInt();
        int rows = controller.deleteById(id);
        System.out.printf("Đã xóa thành công %d user(s).%n",rows);
    }
    public User login() throws SQLException, IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào email");
        String email = scanner.next();
        System.out.println("Nhập vào password");
        String password = scanner.next();
        return controller.login(email,password);
    }
    public int create() throws SQLException, IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào full name.");
        String fullName = scanner.nextLine();
        System.out.println("Nhập vào email.");
        String email = scanner.nextLine();
        int rows = controller.create(fullName,email);
        System.out.printf("Đã thêm thành công %d user(s).%n ", rows);
        return controller.create(fullName,email);
    }


}

