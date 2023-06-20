package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        // Tập hợp các phân tử riêng biệt
        // Set<String> set = new HashSet<>();
        // Set<String> set = new LinkedHashSet<>();
        Set<String> set = new TreeSet<>();

        // thêm 1 phân tử
        set.add("duy");
        set.add("duy");
        set.add("duy");
        set.add("hùng");
        set.add("cường");
        set.add("nam");

        for (String name : set) {
            System.out.println("name = " + name);
        }
    }
}
