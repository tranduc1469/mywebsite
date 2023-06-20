import java.time.LocalDate;
import java.util.Random;

public class Exercise04 {
    public static void question01(){
        Random number = new Random();
        int score = number.nextInt();
        System.out.println("score = " + score);
    }
    public static void question02(){
        Random number = new Random();
        double socore = number.nextDouble();
        System.out.println("socore = " + socore);
    }
    public static void question03(){

        String[] name = {"duc" , "tung" , "khoa"} ;
        Random r = new Random();
        int min = 0;
        int max = name.length -1;
        int index = min + r.nextInt(max - min + 1 );
        System.out.printf("name[%d] = %s  " , index, name[index]);
    }
    public static void question04(){
        Random random = new Random();
        LocalDate from = LocalDate.of(1995, 07  ,24);
        LocalDate to = LocalDate.of(1995,12,20);
        int fromDay = (int) from.toEpochDay();
        int toDay = (int) to.toEpochDay();
        int randomDay = fromDay + random.nextInt(toDay - fromDay + 1 );
        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
        System.out.println("randomDate = " + randomDate);
    }
    public static void question05(){
        // minus là trừ năm or tháng or tuần or ngày

        Random random = new Random();
        LocalDate from = LocalDate.now().minusYears(1);
        LocalDate to = LocalDate.now();
        int fromDay = (int) from.toEpochDay();
        int toDay = (int) to.toEpochDay();
        int randomDay = fromDay + random.nextInt(toDay - fromDay + 1 );
        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
        System.out.println("randomDate = " + randomDate);
    }

    public static void question06(){


        Random random = new Random();
        LocalDate to = LocalDate.now();
        int fromDay = 0;
        int toDay = (int) to.toEpochDay();
        int randomDay = fromDay + random.nextInt(toDay - fromDay + 1 );
        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
        System.out.println("randomDate = " + randomDate);
    }
    public static void question07(){
        Random random = new Random();
        int min =100;
        int max = 1000;
        int so3chuso = min + random.nextInt(max -min+1);
        System.out.println("so3chuso = " + so3chuso);
    }

    public static void main(String[] args) {
    question01();
    question02();
    question03();
    question04();
    question05();
    question06();
    question07();
    }
}
