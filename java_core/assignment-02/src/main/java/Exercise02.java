import java.time.LocalDateTime;
import java.util.Locale;

public class Exercise02 {
    public static void question01(){
        int number = 5;
        System.out.printf("score = %d",number);

    }
    public static void question02(){
      int number = 10000000;
        System.out.printf("number = %,d"  , 10000000);
    }
    public static void question03(){
        double number = 5.567098;
        System.out.printf("number = %.4f",number);
    }
    public static void question04(){
        String fullname = "Tran Viet Duc";
        System.out.printf("Ten toi la \"%s\" va toi dang doc than %n", fullname );

    }
    public static void question05(){

        LocalDateTime now = LocalDateTime.now();


    }
    public static void main(String[] args) {
        //question01();
        //question02();
        //question03();
        //question04();
        question05();

    }
}
