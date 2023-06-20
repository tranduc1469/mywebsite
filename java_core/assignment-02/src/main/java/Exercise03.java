import entity.Account;
import entity.Department;

public class Exercise03 {
    public static void question03() {
        Account account = new Account();
        account.department = new Department();
        String massage = (account.department == null)
                ? "Nhan vien nay chua co phong ban"
                : "Phong ban cua nhan vien la ...";
        System.out.println(massage);
    }

    public static void main(String[] args) {
        question03();
    }
}
