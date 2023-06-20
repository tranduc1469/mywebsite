import java.util.Scanner;

public class Exercise05 {
    public  static void question05() {
        System.out.println("Đang tạo nhé bro");
    }
    public static void question06() {
        System.out.println("Kết bạn với taooo");
    }
    public  static void question08() {
        while (true){
        Scanner sca = new Scanner(System.in);
        System.out.println("1.Tạo account đê bro");
        System.out.println("2.Tạo department đê bro");
        System.out.println("3.Thoát đê bro");
        System.out.println("Chọn chức năng đê bro");
        int menu = sca.nextInt();
        if (menu == 1) {
            question05();
        } else if (menu == 2){
            question06();
        } else if (menu == 3){
            sca.close();
            return;
        } else {
            System.out.println("Cho bố cái địa chỉ ...");
        }

        }
    }
    public static void main(String[] args) {
        question08();

    }
}
