package backend;

import entity.HocSinh;

public class Exercise02 {
    public static void question02(){
        HocSinh hocSinh = new HocSinh();
        hocSinh.inputInfo();
        hocSinh.showInfo();
        System.out.println("hocSinh.datDuocHocBong() = " + hocSinh.datDuocHocBong());
    }


}
