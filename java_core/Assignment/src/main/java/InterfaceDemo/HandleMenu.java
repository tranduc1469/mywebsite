package InterfaceDemo;

import java.util.Scanner;

public class HandleMenu {
    News news = new News();
    public void insertNews(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tiêu đề cho cho tin tức.");
        news.title = scanner.nextLine();
        System.out.println("Nhập vào ngày xuất bản.");
        news.ngayXuatBan = scanner.nextLine();
        System.out.println("Nhập vào tác giả.");
        news.author = scanner.nextLine();
        System.out.println("Nhập vào nội dung.");
        news.content = scanner.nextLine();
        System.out.println("Nhập vào đánh giá của bạn về tiêu đề");
        int rate1 = scanner.nextInt();
        System.out.println("Nhập vào đánh giá của bạn về nội dung");
        int rate2 = scanner.nextInt();
        System.out.println("Nhập vào đánh giá của bạn về tác giả");
        int rate3 = scanner.nextInt();
        news.rates = new int[]{rate1, rate2, rate3};
    }

    public void viewalistnews() {
        news.display();
    }

    public void xemDanhGiaTb() {
        news.averageRate = news.calculate();
        System.out.println("Đánh giá trung bình của khán giả là " + news.averageRate);
        news.display();
    }
}
