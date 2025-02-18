package homeworks.less1.bai6;

import java.util.Scanner;

public class PhuongTrinhBac2 {
    public void run() {
        System.out.println("*** Giai phuong trinh bac 2 ***");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a: ");
        float a = scanner.nextFloat();
        System.out.print("Nhap b: ");
        float b = scanner.nextFloat();
        System.out.print("Nhap c: ");
        float c = scanner.nextFloat();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh co vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                float x = -c / b;
                System.out.println("Nghiem cua phuong trinh la: " + x);
            }
        } else {
            float delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                float x = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep: " + x);
            } else {
                float x1 = (-b + (float) Math.sqrt(delta)) / (2 * a);
                float x2 = (-b - (float) Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co 2 nghiem phan biet: x1 = " + x1 + ", x2 = " + x2);
            }
        }
    }

    public static void main(String[] args) {
        PhuongTrinhBac2 phuongTrinhBac2 = new PhuongTrinhBac2();
        phuongTrinhBac2.run();
    }
}
