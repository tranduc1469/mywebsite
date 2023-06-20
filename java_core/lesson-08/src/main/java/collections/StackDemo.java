package collections;

import com.sun.org.apache.bcel.internal.generic.StackInstruction;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        // Last In , First Out
        // Vào trước, ra sau
        Stack<String> stack = new Stack<>();

        // Thêm phân tử
        // phần tử nào thêm vào cuối sẽ là phần thử đầu tiên


        stack.push("cam");
        stack.push("dứa");
        stack.push("nho");
        stack.push("xoài");




        // Lấy ra khỏi 1 phần tử
        String fruit = stack.pop();
        System.out.println("fruit = " + fruit);

        // Cách xem phần tử đầu tiên
        String top = stack.peek();
        System.out.println("top = " + top);

        // Lặp
        // Trong khi stack còn phần tử thì thêm !
        while (!stack.empty()){
            String pop = stack.pop();
            System.out.println("- pop = " + pop);
        }


    }
}
