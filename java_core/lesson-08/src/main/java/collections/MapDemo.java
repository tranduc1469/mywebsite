package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        // Quản lý danh sách theo key - value

        // Với Array, List : Key là số nguyên
        // Khái niệm key trong array, list: key là giá trị gần giống như số thử tự được java tự động quy ước
        // Map là mở rộng : Key có thể là bất cử kiểu gì
        // Khái niệm key trong map : key là giá trị gần giống như số thử tự được người code quy ước


        Map<Integer, String> map = new HashMap<>();
        // Map<Integer, String> map = new LinkedHashMap<>();
        // Map<Integer, String> map = new TreeMap<>();


        // Thêm 1 phần tử vào map
        map.put(0,"Duy");
        map.put(1,"Nam");
        map.put(2,"Khoa");

        // Xóa phần tử ra khỏi map
        String name = map.remove(1);
        System.out.println("name = " + name);

        //
    }
}
