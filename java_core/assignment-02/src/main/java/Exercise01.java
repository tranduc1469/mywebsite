import entity.*;
import org.openjsse.util.RSAKeyUtil;

public class Exercise01 {
    public static void  question01() {
        Account account = new Account();
        account.department = new Department();
        if (account.department == null){
            System.out.println("Nhan vien nay chua co phong ban");
        } else {
            System.out.printf("Phong ban cua nhan vien la ...");
        }
    }
     public static void question02(){
         Account account = new Account();
         account.groups = null;
         if (account.groups == null || account.groups.length == 0) {
             System.out.println("nhan vien chua co group");
         } else if (account.groups.length == 1 ||  account.groups.length == 2){
             System.out.println("abc");
         } else if (account.groups.length ==3){
             System.out.println("def");
         } else {
             System.out.println("ght");
         }
    }
    
    public static void  question03(){
        Group group = new Group();
        group.accounts = new Account[]{new Account(),new Account()};
        switch (group.accounts.length){
            case 1:
                System.out.println("nhom co 1 thanh vien");
                break;
            case 2:
                System.out.println("nhom co 2 thanh vien");
                break;
            case 3:
                System.out.println("nhom co 3 thanh vien");
                break;
            default:
                System.out.println("con lai");
                break;


        }
    }
    public static void question04(){
        Account account = new Account();
        account.position = new Position();
        Position position = null;
        position.name = PositionName.DEV;
        account.position = position;
        String messesge = (account.position.name == PositionName.DEV)
                ? "asdas"
                : "fafaf";
        System.out.println(messesge);

    }
    public static void question06() {
        Account account = new Account();
        account.groups = new Group[] {new Group()};
        if (account.groups == null) {
            System.out.println("Nhân viên này chưa có group");
        } else {
            int length = account.groups.length;
            switch (length) {
                case 0:
                    System.out.println("Nhân viên này chưa có group");
                    break;
                case 1:
                case 2:
                    System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
                    break;
                case 3:
                    System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
                    break;
                default:
                    System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
                    break;
            }
        }
    }

    public static void question07(){
        Account account = new Account();
        account.position = new Position();
        Position position = null;
        position.name = PositionName.DEV;
        account.position = position;
        String messesge = (account.position.name == PositionName.DEV)
                ? "asdas"
                : "fafaf";
        System.out.println(messesge);

        switch (account.position.name){
            case DEV:
                System.out.println("asfaf");
                break;
            default:
                System.out.println("sfsf");
                break;
        }
    }
    public static void question08() {
        Department department = new Department();
        department.name = " ky thuat";

        Account accounts = new Account();
        accounts.fullName = "Nguyen Van Khoa";
        accounts.email = "nvkhoa05@gmail.com";
        accounts.department = department;

        Account[] account = {accounts, accounts};
        for (Account acc : account) {
            System.out.println("acc.email = " + acc.email);
            System.out.println("acc.fullName = " + acc.fullName);
            System.out.println("acc.department.name = " + acc.department.name);
        }
    }
    public static void question09(){
        Department department = new Department();
        department.id = 1;
        department.name = "giam doc";

        Department[] departments = {department};

        for (Department dep : departments) {
            System.out.println("dep.id = " + dep.id);
            System.out.println("dep.name = " + dep.name);
        }
    }
    public static void question10() {
        Department department = new Department();
        department.name = " ky thuat";

        Account accounts = new Account();
        accounts.fullName = "Nguyen Van Khoa";
        accounts.email = "nvkhoa05@gmail.com";
        accounts.department = department;

        Account[] account = {accounts, accounts};
        for (int i = 0; i < account.length; i++) {
            System.out.println("thong tin thu" + (i + 1) + "la");
            System.out.println("Email:" + account[i].fullName);
            System.out.println();
        }
    }
    public static void question11(){
        Department department = new Department();
        department.id = 1;
        department.name = "giam doc";

        Department[] departments = {department};

        for (Department dep : departments) {
            System.out.println("dep.id = " + dep.id);
            System.out.println("dep.name = " + dep.name);
        }
    }
    public static void question13(){
        Department department = new Department();
        department.name = " ky thuat";

        Account accounts = new Account();
        accounts.fullName = "Nguyen Van Khoa";
        accounts.email = "nvkhoa05@gmail.com";
        accounts.department = department;

        Account[] account = {accounts, accounts};
        for (int i = 0; i < account.length; i++) {
            if (i !=1){
            System.out.println("thong tin thu" + (i + 1) + "la");
            System.out.println("Email:" + account[i].fullName);
            System.out.println();
            }
        }
    }
    public static void question14(){
        Department department = new Department();
        department.name = " ky thuat";

        Account accounts = new Account();
        accounts.fullName = "Nguyen Van Khoa";
        accounts.email = "nvkhoa05@gmail.com";
        accounts.department = department;

        Account[] account = {accounts, accounts};
        for (int i = 0; i < account.length; i++) {
            if (account[i].id < 4){
                System.out.println("thong tin thu" + (i + 1) + "la");
                System.out.println("Email:" + account[i].fullName);
                System.out.println();
            }
        }
    }
    public static void question15() {
        for (int i = 0; i < 20; i = i + 2) {
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        //question01();
        question03();
    }
}
