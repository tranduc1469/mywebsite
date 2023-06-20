package entity;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private String hometown;
    private double score;



    public Student() {
        Scanner sca = new Scanner(System.in);
        System.out.println("Kết bạn với tao");
        this.name = sca.next();

        sca.nextLine();

        System.out.println("Cho bố xin cái địa chỉ");
        this.hometown = sca.nextLine();
        this.score = 0;
    }


    public void setScore(double score) {
        this.score = score;
    }
    public void plusScore(double value){
        this.score += value;
    }
    public void showInfor(){
        String rank;
        if (score < 4.0) {
            rank = "yếu sl";
        } else if(score <6.0) {
            rank = "Khá Bảnh";
        } else {
            rank = "Giỏi";
        }
        System.out.printf("=> %s - %s.%n", name, rank);
    }
}
