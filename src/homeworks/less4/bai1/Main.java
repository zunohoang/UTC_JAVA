package homeworks.less4.bai1;

import lib.Keyboard;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.exit;

public class Main {
    private static int n;
    private static List<Hinh> hinhList;

    public static void nhap(){
        System.out.print("Nhap so luong hinh: ");
        n = Keyboard.readInt();
        hinhList = new ArrayList<Hinh>(n);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap hinh thu " + (i + 1));
            System.out.print("1. Hinh tron\n2. Hinh chu nhat\n3. Tam giac\nChon hinh: ");
            int chon = Keyboard.readInt();
            switch (chon) {
                case 1:
                    System.out.print("Nhap ban kinh: ");
                    float banKinh = Keyboard.readFloat();
                    hinhList.add(new homeworks.less4.bai1.HinhTron(banKinh));
                    break;
                case 2:
                    System.out.print("Nhap chieu dai: ");
                    float chieuDai = Keyboard.readFloat();
                    System.out.print("Nhap chieu rong: ");
                    float chieuRong = Keyboard.readFloat();
                    hinhList.add(new homeworks.less4.bai1.ChuNhat(chieuDai, chieuRong));
                    break;
                case 3:
                    System.out.print("Nhap canh 1: ");
                    float canh1 = Keyboard.readFloat();
                    System.out.print("Nhap canh 2: ");
                    float canh2 = Keyboard.readFloat();
                    System.out.print("Nhap canh 3: ");
                    float canh3 = Keyboard.readFloat();
                    hinhList.add(new homeworks.less4.bai1.TamGiac(canh1, canh2, canh3));
                    break;
                default:
                    System.out.println("Khong hop le");
                    exit(1);
            }
        }
    }

    public static void xuat(){
        for (int i = 0; i < n; i++) {
            System.out.println("Hinh thu " + (i + 1));
            System.out.println("Loai hinh: " + hinhList.get(i).getClass().getSimpleName());
            System.out.println("Dien tich: " + hinhList.get(i).dienTich());
            System.out.println("Chu vi: " + hinhList.get(i).chuVi());
            System.out.println("===================================");
        }
    }

    public static void main(String[] args) {
        nhap();
        xuat();
    }
}
