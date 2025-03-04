package labs.lab3;

import java.util.Scanner;

/*
Tạo thêm các hàm:
- nhập vào danh sách n sinh viên
- In danh sách sinh viên ra màn hình
- Hàm sắp xếp danh sách sinh viên tăng dần theo điểm
- Thực thi các phương thức trong main()
 */

public class QuanLySinhVien {
    private SinhVien[] dsSinhVien;

    public QuanLySinhVien() {
    }

    public void nhapDanhSach() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap so luong sinh vien: ");
            n = sc.nextInt();
        } while (n <= 0);
        dsSinhVien = new SinhVien[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
            SinhVien sv = new SinhVien();
            sv.nhap();
            dsSinhVien[i] = sv;
        }
    }

    public void inDsSinhVien() {
        for (int i = 0; i < dsSinhVien.length; i++) {
            System.out.println("Thong tin sinh vien thu " + (i + 1) + ":");
            dsSinhVien[i].xuat();
            System.out.println();
        }
    }

    public void sapXepTheoDiem(){
        for(int i = 0; i < dsSinhVien.length - 1; i++){
            for(int j = i + 1; j < dsSinhVien.length; j++){
                if(dsSinhVien[i].getDiem() > dsSinhVien[j].getDiem()){
                    SinhVien temp = dsSinhVien[i];
                    dsSinhVien[i] = dsSinhVien[j];
                    dsSinhVien[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        QuanLySinhVien qlsv = new QuanLySinhVien();
        qlsv.nhapDanhSach();
        System.out.println("Danh sach sinh vien vua nhap:");
        qlsv.inDsSinhVien();

        qlsv.sapXepTheoDiem();
        System.out.println("Danh sach sinh vien sau khi sap xep theo diem:");
        qlsv.inDsSinhVien();
    }
}
