import java.util.Random;

public class Exercise01 {
    public static  void question01() {
        float luong1 = 5240.5F;
        float luong2 = 10970.055F;
        int luonglamtron = (int) luong1;
        int luonglamtron2 = (int) luong2;
        System.out.println("luonglamtron = " + luonglamtron);
        System.out.println("luonglamtron2 = " + luonglamtron2);
    }
    public static  void question02() {
        Random random = new Random();
        int min = 0;
        int max = 99999;
        int number = min + random.nextInt(max - min +1);



        }


    public static void main(String[] args) {

        question01();


    }
}
