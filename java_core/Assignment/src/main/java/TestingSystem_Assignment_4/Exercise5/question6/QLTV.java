package TestingSystem_Assignment_4.Exercise5.question6;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLTV {
    Scanner scanner = new Scanner(System.in);
    List<TaiLieu> taiLieus = new ArrayList<>();
    List<Integer> ids =new ArrayList<>();
    public void create(){
        System.out.println("Nhập các số dưới đây để thêm tài liệu tương ứng.");
        System.out.println("1. Thêm Sách");
        System.out.println("2. Thêm Tạp chí");
        System.out.println("3. Thêm Báo");
        int num = scanner.nextInt();
        ids.add(num);

        scanner.nextLine();
        System.out.println("Xin nhập tên Nhà xuất bản");
        String tenNhaXuatBan = scanner.nextLine();
        System.out.println("Xin nhập số bản phát hành");
        String soBanPhatHanh = String.format("TL%05d",scanner.nextInt());
        scanner.nextLine();
        if (num == 1) {
            int id = 1;
            System.out.println("Xin nhập vào tên Tác giả");
            String tenTacGia = scanner.nextLine();
            System.out.println("Xin nhập vào số trang");
            int abc = scanner.nextInt();
            Sach sach = new Sach(id,tenNhaXuatBan,soBanPhatHanh,tenTacGia,abc);
            taiLieus.add(sach);
        }
        else if (num == 2) {
            int id = 2;
            System.out.println("Xin nhập vào số phát hành");
            int soPhatHanh = scanner.nextInt();
            System.out.println("Xin nhập vào tháng phát hành");
            int thangPhatHanh = scanner.nextInt();
            TapChi tapChi = new TapChi(id,tenNhaXuatBan,soBanPhatHanh,soPhatHanh,thangPhatHanh);
            taiLieus.add(tapChi);
        } else if (num == 3) {
            int id = 3;
            System.out.println("Xin nhập vào ngày phát hành");
            int ngayPhatHanh = scanner.nextInt();
            Bao bao = new Bao(id,tenNhaXuatBan,soBanPhatHanh,ngayPhatHanh);
            taiLieus.add(bao);
        }else {
            System.out.println("Vui lòng chọn lại chức năng");
        }

    }
    public void fillById(){
        System.out.println("Nhập vào loại bạn cần tìm: ");
        System.out.println("Với id = 1 cho sách");
        System.out.println("Với id = 2 cho tạp chí");
        System.out.println("Với id = 3 cho báo");
        int loai = scanner.nextInt();
        for (TaiLieu lieus : taiLieus) {
            if (lieus.getId() == loai) {
                System.out.println("Tài liệu bạn cần tìm là " + lieus);
            }
        }
    }
    public void showInfo(){
        if (taiLieus.size() == 0){
            System.out.println("Chưa có tài liệu nào được thêm vào");
        }else {
            for (TaiLieu lieus : taiLieus) {
                System.out.println("Tài liệu gồm thông tin như sau " + lieus);

            }
        }
    }
    public void ttMuonSach(){
        System.out.println("Nhập vào loại bạn muốn mượn ");
        System.out.println("Với id = 1 cho sách");
        System.out.println("Với id = 2 cho tạp chí");
        System.out.println("Với id = 3 cho báo");
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < ids.size(); i++) {
            if (ids.get(i) == 1) {
                count1 += 1;
            } else if (ids.get(i) == 2) {
                count2 += 1;
            } else if (ids.get(i) == 3) {
                count3 += 1;
            }
        }
        int id = scanner.nextInt();
        if (id == 1){
            int giaMuonSach = 5000;
            System.out.println("Bạn muốn mượn sách");
            System.out.println("Giá mượn sách là 5000 VND/ quyển / ngày");
            System.out.println("Hãy nhập số ngày bạn muốn mượn");
            int soNgayMuon = scanner.nextInt();
            System.out.println("Nhập số sách bạn muốn mượn");
            int soLuong = scanner.nextInt();
            if (soLuong <= count1){
                System.out.println("Tổng số tiền bạn cần trả là " + (soLuong * soNgayMuon * giaMuonSach));
                System.out.println("Số lượng sách còn lại trong kho là" + (count1 -soLuong));
            }
            else {
                System.out.println("Không đủ số sách để mượn");
            }
        } else if (id == 2) {
            int giaMuonSach = 7000;
            System.out.println("Bạn muốn mượn tạp chí");
            System.out.println("Giá mượn sách là 7000 VND/ quyển / ngày");
            System.out.println("Hãy nhập số ngày bạn muốn mượn");
            int soNgayMuon = scanner.nextInt();
            System.out.println("Nhập số sách bạn muốn mượn");
            int soLuong = scanner.nextInt();
            if (soLuong <= count2){
                System.out.println("Tổng số tiền bạn cần trả là " + (soLuong * soNgayMuon * giaMuonSach));
                System.out.println("Số lượng sách còn lại trong kho là" + (count2 -soLuong));
            }
            else {
                System.out.println("Không đủ số sách để mượn");
            }
        } else if (id == 3) {
            int giaMuonSach = 3000;
            System.out.println("Bạn muốn mượn báo");
            System.out.println("Giá mượn sách là 3000 VND/ quyển / ngày");
            System.out.println("Hãy nhập số ngày bạn muốn mượn");
            int soNgayMuon = scanner.nextInt();
            System.out.println("Nhập số sách bạn muốn mượn");
            int soLuong = scanner.nextInt();
            if (soLuong <= count3){
                System.out.println("Tổng số tiền bạn cần trả là " + (soLuong * soNgayMuon * giaMuonSach));
                System.out.println("Số lượng sách còn lại trong kho là" + (count3 -soLuong));
            }
            else {
                System.out.println("Không đủ số sách để mượn");
            }
        }

    }
}
