package homeworks.less1.bai18;

/*
Viết chương trình nhập dãy số thực có n phần tử và một số x. Dò xem trong
dãy có hai phần tử liền nhau nào mà tổng của chúng bằng x không?
 */

import java.util.Scanner;

public class Bai18Service {
    public void run() {
        System.out.println("**Tim hai phan tu lien nhau co tong bang x**");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua day: ");
        int n = scanner.nextInt();

        float[] arr = new float[n];
        System.out.println("Nhap day so: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextFloat();
        }

        System.out.print("Nhap so thuc x: ");
        float x = scanner.nextFloat();

        boolean found = false;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] + arr[i + 1] == x) {
                System.out.printf("Hai phan tu lien nhau co tong bang %.2f la phan tu thu %.2f va %.2f\n", x, i, i + 1);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.printf("Khong tim thay hai phan tu lien nhau co tong bang %.2f\n", x);
        }
    }

    public static void main(String[] args) {
        Bai18Service bai18Service = new Bai18Service();
        bai18Service.run();
    }
}
