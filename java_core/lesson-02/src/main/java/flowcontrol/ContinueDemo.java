package flowcontrol;

public class ContinueDemo {
    public static void main(String[] args) {
        // in ra  cái không phù hợp với điều kiện

        for (int i = 0; i < 10; i++) {
            if(i <= 5){
                continue;
            }
            System.out.println("dang tim kiem " + i);
        }
    }
}
