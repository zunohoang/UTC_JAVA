package homeworks.bai5;

import java.util.Scanner;

public class PhuongTrinhBac1 {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a: ");
        float a = scanner.nextFloat();
        System.out.print("Nhap b: ");
        float b = scanner.nextFloat();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            float x = -b / a;
            System.out.println("Nghiem cua phuong trinh la: " + x);
        }
    }

    public static void main(String[] args) {
        PhuongTrinhBac1 phuongTrinhBac1 = new PhuongTrinhBac1();
        phuongTrinhBac1.run();
    }
}
