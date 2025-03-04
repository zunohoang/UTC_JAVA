package homeworks.less4.bai2;

import java.util.List;

/*
Xây dựng chương trình với các lớp
đã cho để có thể lựa chọn và thực
hiện các thao tác với từng lớp Sinh
viên CNTT và Kinh tế.
 */
// chuong trinh nhap n sinh vien va xuat n sinh vien
public class Main {

    static int n;
    static List<SinhVien> sinhVienList;

    static void nhap(){
        System.out.print("Nhap so luong sinh vien: ");
        n = lib.Keyboard.readInt();
        sinhVienList = new java.util.ArrayList<SinhVien>(n);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap sinh vien thu " + (i + 1));
            System.out.print("1. Sinh vien CNTT\n2. Sinh vien Kinh te\nChon sinh vien: ");
            int chon = lib.Keyboard.readInt();
            switch (chon) {
                case 1:
                    SinhVienCNTT svCNTT = new SinhVienCNTT("", "", "", "", "", "", "", "", "", "", "");
                    svCNTT.nhapThongTin();
                    sinhVienList.add(svCNTT);
                    break;
                case 2:
                    SinhVienKinhTe svKinhTe = new SinhVienKinhTe("", "", "", "", "", "", "", "", "", "");
                    svKinhTe.nhapThongTin();
                    sinhVienList.add(svKinhTe);
                    break;
                default:
                    System.out.println("Khong hop le");
                    System.exit(1);
            }
        }
    }

    static void xuat(){
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh vien thu " + (i + 1));
            sinhVienList.get(i).hienThiThongTin();
            System.out.println("===================================");
        }
    }

    public static void main(String[] args) {
        nhap();
        xuat();
    }
}
