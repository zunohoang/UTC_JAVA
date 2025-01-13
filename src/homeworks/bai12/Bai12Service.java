package homeworks.bai12;

/*
Viết chương trình tính chu vi, diện tích của hình tròn khi nhập bán kính R.
 */

import java.util.Scanner;

public class Bai12Service {
    public void run() {
        System.out.println("**Chu vi va dien tich hinh tron**");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ban kinh hinh tron: ");
        float r = scanner.nextFloat();

        float chuVi = 2 * r * (float) Math.PI;
        float dienTich = r * r * (float) Math.PI;

        System.out.println("Chu vi hinh tron la: " + chuVi);
        System.out.println("Dien tich hinh tron la: " + dienTich);
    }

    public static void main(String[] args) {
        Bai12Service bai12Service = new Bai12Service();
        bai12Service.run();
    }
}
