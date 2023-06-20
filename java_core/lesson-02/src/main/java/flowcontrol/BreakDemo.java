package flowcontrol;

public class BreakDemo {
    public static void main(String[] args) {
        // in ra cái phù  hợp với điều kiện, không in ra cái không phù hợp với đk
        for (int i = 0; i < 10; i++) {
            System.out.println("đang tìm kiếm vị trí thứ " + i);
            if (i == 5){
                System.out.println("da tim thay");
                break;
            }
        }
        System.out.println("duoi vong lap");
    }
}
