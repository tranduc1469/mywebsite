import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Scanner;
import java.util.SortedMap;

public class Exercise04 {
    static Scanner sca = new Scanner(System.in);

    public static void question01() {
        System.out.println("Nhập tên bạn ơi");
        String str = sca.nextLine();
        int count = str.trim().split("\\s+").length;
        System.out.println("count = " + count);
    }

    public static void question04() {

        System.out.println("Nhập tên bạn ơi");
        String keyword = sca.next();
        for (int i = 0; i < keyword.length(); i++) {
            System.out.printf("Kí tự thứ %d là %c.%n = ", i +1, + keyword.charAt(i));
        }

    }




    public static void question02(){
        Scanner sca = new Scanner(System.in);
        System.out.println("Cho bố cái địa chỉ");
        String adress = sca.nextLine();

        System.out.println("Kết bạn với tao");
        String in4 = sca.nextLine();

        String dcm = adress.concat(in4);
        System.out.println("dcm = " + dcm);


    }
    public static void question03(){
        Scanner sca = new Scanner(System.in);
        System.out.println("Cho bố cái tên");
        String name = sca.nextLine();
        String s = StringUtils.capitalize(name);
        // name.substring(0,1);
        // System.out.println("Bố mày là " + name.substring(0,1).toUpperCase() + name.substring(1));
        System.out.println("s = " + s);

        // tran viet duc => tran viet Duc
        // int lastSpace = name.lastIndexOf(' ');
        // name.substring(lastSpace + 1);

    }
    public static void question06(){

        System.out.println("Mời bạn nhập vào họ và tên.");

        System.out.println("Nhập vào họ và tên:");
        String fullName = sca.nextLine();

        // Nguyễn Văn Nam
        // Họ: Từ đầu tiên => [0, firstSpace)
        // Tên: Từ cuối cùng => [lastSpace + 1, fullName.length)
        // Tên đệm: [firstSpace + 1, lastSpace)

        int firstSpace = fullName.indexOf(' ');
        int lastSpace = fullName.lastIndexOf(' ');
        String lastName = fullName.substring(0, firstSpace);
        String firstName = fullName.substring(lastSpace + 1);
        String middleName = fullName.substring(firstSpace + 1, lastSpace);
        System.out.printf("Họ là: %s.%n", lastName);
        System.out.printf("Tên đệm là: %s.%n", firstName);
        System.out.printf("Tên là: %s.%n", middleName);

    }
    private static void question08() {
        String[] groups = {"Database", "Java", "Java core", "Java advanced", "ReactJS"};
        for (String group : groups) {
            // contains : chứa
            // equals : so sánh bằng
            if (group.contains("Java")) {
                System.out.printf("=> group = %s.%n", group);
            }
        }
    }

    public static void main(String[] args) {
       // question01();
        // question03();
        question06();

    }
}
