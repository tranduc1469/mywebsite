package collections;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {


        // Last in , last out
        // Vào sau , ra sau

        Queue<String> queue = new ArrayDeque<>();
        // Queue<String> queue = new LinkedList<>();
        // Queue<String> queue = new PriorityQueue<>();


        // Thêm 1 phần tử vào hàng đợi
        queue.offer("duy");
        queue.offer("ngọc anh");
        queue.offer("nam");
        queue.offer("đức anh");
        // không nên dùng   queue.add("hùng");

        // Lấy 1 phần tử ra khỏi hàng đợi
        String first = queue.poll();
        System.out.println("first = " + first);

        // Xem phần tử sắp được phục vụ
        String peek = queue.peek();
        System.out.println("peek = " + peek);

        // Lấy từng phần tử
        while (!queue.isEmpty()){
            String name = queue.poll();
            System.out.println("name = " + name);
        }

    }
}
