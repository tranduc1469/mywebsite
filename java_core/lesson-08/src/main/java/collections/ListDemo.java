package collections;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {

        // Tạo list có thể thêm, sửa, xóa
        // List<String> fruits = new ArrayList<>();
        // khi nào muồn truy cập nhanh thì dùng ArrayList

        // List<String> fruits = new LinkedList<>();
        // khi nào muốn xóa thì dùng  LinkedList
        // fruits.add("cam");
        // fruits.add("táo");


        // Tạo list cố định luôn các phần tử, không thể thêm, sửa, xóa
        List<String> fruits = Arrays.asList("cam", "táo");

        System.out.println("fruits_1.size() = " + fruits.size());

        // isEmpty : kiểm tra xem số phần tử có bằng 0 hay không
        System.out.println("fruits.isEmpty() = " + fruits.isEmpty());


        // contains : kiểm tra xem có phần tử trong danh sách hay không
        System.out.println("fruits.contains(\"nho\") = " + fruits.contains("nho"));


    }
}
