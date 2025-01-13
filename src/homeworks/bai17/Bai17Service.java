package homeworks.bai17;

/*
Viết chương trình thực hiện các công việc sau:
a. In ra màn hình bảng cửu chương từ 2 tới 9.
b. Nhập vào một số k (2≤k≤9), in ra bảng cửu chương k.
 */

import java.util.Scanner;

public class Bai17Service {
    public void run() {
        System.out.println("**Bang cuu chuong**");

        for (int i = 2; i <= 9; i++) {
            System.out.println("Bang cuu chuong " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so k (2<=k<=9): ");
        int k = scanner.nextInt();

        if (k < 2 || k > 9) {
            System.out.println("So k khong hop le");
        } else {
            System.out.println("Bang cuu chuong " + k);
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d x %d = %d\n", k, i, k * i);
            }
        }
    }

    public static void main(String[] args) {
        Bai17Service bai17 = new Bai17Service();
        bai17.run();
    }
}
