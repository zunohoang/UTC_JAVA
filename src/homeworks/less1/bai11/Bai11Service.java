package homeworks.less1.bai11;

/*
Viết chương trình tính diện tích hình thang có đáy lớn a, đáy nhỏ b và chiều
cao h như sau: S:=1/2*(a+b)*h
 */

import java.util.Scanner;

public class Bai11Service {
    public void run() {
        System.out.println("**Dien tich hinh thang**");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap do dai day lon a: ");
        float a = scanner.nextFloat();
        System.out.print("Nhap do dai day nho b: ");
        float b = scanner.nextFloat();
        System.out.print("Nhap chieu cao h: ");
        float h = scanner.nextFloat();

        float s = (a + b) * h / 2;
        System.out.println("Dien tich hinh thang la: " + s);
    }

    public static void main(String[] args) {
        Bai11Service bai11Service = new Bai11Service();
        bai11Service.run();
    }
}
