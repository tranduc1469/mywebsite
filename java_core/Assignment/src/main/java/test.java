import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {

    public static <abc> void main(String[] args) {
        List<Integer> abcs =new ArrayList<>();
        Scanner scanner =new Scanner(System.in);


        while (true) {
            int a = scanner.nextInt();
            abcs.add(a);
            int count1 = 0;
            int count2 = 0;
            int count3 = 0;
            for (int i = 0; i < abcs.size(); i++) {
                if (abcs.get(i) == 1) {
                    count1 += 1;
                } else if (abcs.get(i) == 2) {
                    count2 += 1;
                } else if (abcs.get(i) == 3) {
                    count3 += 1;
                }
            }
            System.out.println("Kí tự 1 xuất hiện " + count1 + " lần");
            System.out.println("Kí tự 2 xuất hiện " + count2 + " lần");
            System.out.println("Kí tự 3 xuất hiện " + count3 + " lần");
        }
    }
}
