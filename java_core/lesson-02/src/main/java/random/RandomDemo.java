package random;

import java.time.LocalDate;
import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt();
        System.out.println("number = " + number);

        double score = random.nextDouble();
        System.out.println("score = " + score);

        // sinh ra 1 số nguyên ngẫu nhiên trong khoảng [min , max]
        // chú ý random.nextInt : lấy từ 0 dến max-1
        // lấy từ min đến max : min + random.nextInt(max - min + 1 )
        int min = 99;
        int max = 100;
        int lô = min + random.nextInt(max - min + 1);
        System.out.println("lô = " + lô);

        // Random date
        // 0------1000--------2000 (date)
        // quy đổi ra thành ngày
        // 0-----5000----------100000 (day)
        // => Random = 75000
        // => Convert day to date = 1500

        LocalDate from = LocalDate.of(1975, 4 ,30);
        LocalDate to = LocalDate.now();
        int fromDay = (int) from.toEpochDay();
        int toDay = (int) to.toEpochDay();
        int randomDay = fromDay + random.nextInt(toDay - fromDay + 1 );
        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
        System.out.println("randomDate = " + randomDate);


    }
}
