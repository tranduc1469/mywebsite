package backend;

import emtity.Student;

import java.util.*;

public class Exercise01 {
    public static void q1(){

        // câu a
        Student student1 = new Student("duy");
        Student student2 = new Student("duy");
        Student student3 = new Student("duy");
        Student student4 = new Student("đức");
        Student student5 = new Student("khoa");

        List<Student> student = new ArrayList<>();
        student.add(student1);
        student.add(student2);
        student.add(student3);
        student.add(student4);
        student.add(student5);
        // câu b
        System.out.println("Tổng số phần tử là " + student.size());
        System.out.println("Phần tử số 4 là " + student.get(3));
        // câu c
        System.out.println("Phần tử đầu là " + student.get(0));
        System.out.println("Phần tử cuối là " + student.get(student.size() - 1));



        // câu d : Thêm 1 phần tử vào vị trí đầu(cuối) của students
        System.out.println("Thêm 1 phân tử vào đầu của student");
        student.add(0, new Student("tùng"));

        System.out.println("Thêm 1 phân tử vào cuối của student");
        student.add(new Student("dũng"));

        // Câu j
        for (Student student6 : student) {
            if(student6.getId() == 2){
                student6.setName(null);
            }
        }

        System.out.println("add tất cả students vào studentCopies");
        List<Student> studentCopies = new ArrayList<>();
        studentCopies.addAll(student);

    }
    // câu i
  // private void q1_1(List<Student> students){
  //     for (int i = 0; i < students.size(); i++) {
  //         String search = students.get();
  //         for (int j = 0; j < students.size(); i++) {
  //             if (that.getName().equals(search)){
  //                 System.out.println("student = " + student);
  //             }
  //         }
  //     }
  // }
    private static void q1_1(List<Student> students){
        // Lặp để Đếm số lần xuất hiện của tên học sinh

        Map<String,Integer> map = new HashMap<>();
        for (Student student : students) {
            String name = student.getName();
            int count = map.getOrDefault(name,0);
            map.put(name,count+1);
        }
        // Lấy ra tên có số lần lớn hơn 1 ( có nghĩa là trùng nhau)

        for(Map.Entry<String,Integer> entry:map.entrySet()){
            int count = entry.getValue();
            if (count > 1){
                String name = entry.getKey();
                System.out.println("- Student " + name);
            }
        }

    }
    public static void q4(){
        Set<String> set = new LinkedHashSet<>();
        set.add("Duy");
        set.add("Cường");
        set.add("Đức");
        set.add("Huy");
        for (String name : set) {
            System.out.println("name = " + name);
        }
    }

    public static void q5(){
        Set<String> set = new TreeSet<>();
        set.add("Duy");
        set.add("Cường");
        set.add("Đức");
        set.add("Huy");
        for (String name : set) {
            System.out.println("name = " + name);
        }
    }

    public static void q6(){
        Map<Integer,String> student = new HashMap<>();
        student.put(1,"Duy");
        student.put(2,"Cuong");
        student.put(3,"Dau Moi");

        for (Integer id : student.keySet()) {
            System.out.println(" - id = " + id);
        }

        for (String name : student.values()) {
            System.out.println("name = " + name);
        }



    }

}
