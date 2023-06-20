import com.sun.xml.internal.ws.api.ha.StickyFeature;
import com.sun.xml.internal.ws.util.StringUtils;
import entity.Account;
import entity.Department;
import entity.Position;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Program {
    public static  void question05(){
        Position position1 = new Position();
        position1.setPositionName("Dev");
        Position position2 = new Position();
        position2.setPositionName("Test");
        Position position3 = new Position();
        position3.setPositionName("SM");
        Position position4 = new Position();
        position4.setPositionName("PM");

        Position[] positions = {position1,position2,position3,position4};

        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        System.out.println("Nhập vào id");
        account.setAccountId(scanner.nextInt());
        System.out.println("Nhập vào email");
        account.setEmail(scanner.next());
        System.out.println("Nhập vào username");
        account.setUsername(scanner.next());
        scanner.nextLine();
        System.out.println("Nhập vào full name");
        account.setFullName(scanner.nextLine());
        System.out.println("Nhập vào chức vụ");
        int soChucVu = scanner.nextInt();
        switch (soChucVu) {
            case 1:
                account.setPositionId(positions[0]);
                break;
            case 2:
                account.setPositionId(positions[1]);
                break;
            case 3:
                account.setPositionId(positions[2]);
                break;
            case 4:
                account.setPositionId(positions[3]);
                break;
        }
        scanner.close();
        System.out.println("account = " + account);
    }
    public static void main(String[] args) {
//        Department department1 = new Department();
//        department1.setDepartmentId(1);
//        department1.setDepartmentName("Giám đốc");
//
//        Department department2 = new Department();
//        department2.setDepartmentId(2);
//        department2.setDepartmentName("Nhân viên");
//
//        Department department3 = new Department();
//        department3.setDepartmentId(3);
//        department3.setDepartmentName("Bảo vệ");
//
//        Account account1 = new Account();
//        account1.setAccountId(1);
//        account1.setEmail("tranvietduc1469@gmail.com");
//        account1.setFullName("Trần Việt Đức");
//        account1.setDepartmentId(department1);
//        account1.setCreateDate(LocalDateTime.now());
//
//        Account account2 = new Account();
//        account2.setAccountId(2);
//        account2.setEmail("tranvietduc1469@gmail.com");
//        account2.setFullName("Trần Thị Hà Phương");
//        account2.setDepartmentId(department2);
//        account2.setCreateDate(LocalDateTime.now());
//
//        Account account3 = new Account();
//        account3.setAccountId(3);
//        account3.setEmail("tranvietduc1469@gmail.com");
//        account3.setFullName("Trần Văn Đạt");
//        account3.setDepartmentId(department3);
//        account3.setCreateDate(LocalDateTime.now());
//
//        Random random = new Random();
//        int number  = random.nextInt();
//        System.out.println("number = " + number);
//        System.out.println("account1 = " + account1);
//        System.out.println("account2 = " + account2);
//        System.out.println("account3 = " + account3);
//
//        String[] names = {account1.getFullName(), account2.getFullName(), account2.getFullName()};
//        int max = names.length - 1 ;
//        int min = 0;
//        int index = min + random.nextInt(max - min + 1);
//        System.out.println("names[index] = " + names[index]);
//
////        LocalDate fromDate = LocalDate.of(1999,4,14);
//        LocalDate toDate = LocalDate.now();
////        int fromDay = (int) fromDate.toEpochDay();
//        int toDay = (int) toDate.toEpochDay();
//        int randomDay = 0 + random.nextInt(toDay - 0 + 1);
//        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
//        System.out.println("randomDate = " + randomDate);
//
//
//        for (int i = 0; i < 10; i++) {
//            if (i%2 == 0){
//                System.out.println("i = " + i);
//            }
//        }
//        System.out.println("Các số còn lại là số lẻ");


//            question05();
//        Random random = new Random();
//        int maxNum = 100000;
//        int number = random.nextInt(maxNum);
//        System.out.printf("number = %05d %n", number);
//        if (number !=0 && number < 9){
//            System.out.println("number = 0000" + number);
//        } else if (number >9 && number < 100){
//            System.out.println("number = 000" + number);
//        }else if (number >99 && number < 1000){
//            System.out.println("number = 00" + number);
//        }else if (number >999 && number < 10000){
//            System.out.println("number = 0" + number);
//        } else {
//            System.out.println("number = " + number);
//        }
//        int n = number/10000;
//        if (n !=0 && n < 9){
//            System.out.println("number = " + number);
//        }else {
//            System.out.printf("number = %05d %n", number);
//        }
//
//        Integer salary = 5000;
//        float fsalary = salary.floatValue();
//        System.out.printf("salary = %.2f %n", fsalary);
//
//        String sNum = "1234567";
//        Integer Inum = Integer.valueOf(sNum);
//        int iNum1 = Inum.intValue();
//        int iNum2 = Inum;
//        System.out.println("iNum1 = " + iNum1);
//        System.out.println("iNum2 = " + iNum2);
//
//        int a = 123456;
//        String b = Integer.toString(a);
//        System.out.println("b = " + b);

//        String s1 = "abc";
//        String s2 = "def";
//        System.out.printf("s3 = %s%s%n",s2,s1);
//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên của bạn");
        String name = scanner.nextLine();
//        char[] a = name.toCharArray();
//        for (int i = 0; i < a.length; i++) {
//            System.out.println("Ki tu thu " + (i+1) + " là " + a[i]);
//        }
//        String[] listwords = name.trim().split("\\s+");
//        String chuoiChuanHoa = "";
//        for (int i = 0; i < listwords.length; i++) {
//            chuoiChuanHoa += StringUtils.capitalize(listwords[i]);
//            if (i != listwords.length - 1){
//                chuoiChuanHoa += " ";
//            }
//        }
//        System.out.println("chuoiChuanHoa = " + chuoiChuanHoa);

        char[] kiTu = name.toCharArray();
        int count = 0;
        for (int i = 0; i < kiTu.length; i++) {
            System.out.println("kiTu["+i+"] = " + kiTu[i]);
            if (kiTu[i] != 'a'){
                System.out.println("Không phải kí tự a");
            } else {
                count += 1;
                System.out.println("Kí tự a xuất hiện "+count+" lần");
            }
        }
        System.out.println("Tổng số lần xuất hiện kí tự a là " + count);

    }
}
