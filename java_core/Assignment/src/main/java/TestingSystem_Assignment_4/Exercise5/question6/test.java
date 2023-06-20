package TestingSystem_Assignment_4.Exercise5.question6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        List<Integer> ids =new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int count1 = 0;
            int count2 = 0;
            int count3 = 0;
            int num = scanner.nextInt();
            ids.add(num);
            for (int i = 0; i < ids.size(); i++) {
                if (ids.get(i) == 1) {
                    count1 += 1;
                } else if (ids.get(i) == 2) {
                    count2 += 1;
                } else if (ids.get(i) == 3) {
                    count3 += 1;
                }
            }
            System.out.println("Số lượng sách còn lại trong kho là" + count1);
            System.out.println("Số lượng sách còn lại trong kho là" + count2);
            System.out.println("Số lượng sách còn lại trong kho là" + count3);
            for (Integer id : ids) {
                System.out.println("id = " + id);
            }
        }


    }
}
