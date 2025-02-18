package homeworks.less1.bai9;

import java.util.Scanner;

public class Bai9Service {

    public void run() {
        System.out.println("**Tinh tong chuoi**");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong n: ");
        int n = scanner.nextInt();
        System.out.print("Nhap so thuc x: ");
        float x = scanner.nextFloat();

        float sum = 0;
        float gt = 1;
        for(int i = 1; i <= n; i++) {
            gt *= i;
            sum += (float) (Math.pow(x, i) / gt);
        }

        System.out.printf("S(%.2f,%d) = %.2f", x, n, sum);

    }
}
