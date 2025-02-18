package homeworks.less1.bai4;

import java.util.Scanner;

public class TinhDienTich {

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        float dai = scanner.nextFloat();
        System.out.print("Nhap chieu rong: ");
        float rong = scanner.nextFloat();
        float dienTich = dai * rong;
        System.out.println("Dien tich hinh chu nhat la: " + dienTich);
        float chuVi = (dai + rong) * 2;
        System.out.println("Chu vi hinh chu nhat la: " + chuVi);
    }

    public static void main(String[] args) {
        TinhDienTich tinhDienTich = new TinhDienTich();
        tinhDienTich.run();
    }
}
