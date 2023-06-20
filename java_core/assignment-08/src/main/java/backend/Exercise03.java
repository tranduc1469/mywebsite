package backend;

import emtity.MyMap;

public class Exercise03 {
    public static void q6() {
        MyMap<Integer,String> student = new MyMap<>(1,"duy");
        System.out.println("student.getKey() = " + student.getKey());
        System.out.println("student.getValue() = " + student.getValue());
    }

}
