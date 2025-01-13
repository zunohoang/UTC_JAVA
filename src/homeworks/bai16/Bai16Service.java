package homeworks.bai16;

/*
Viết chương trình nhập vào một dãy số nguyên. Kiểm tra xem dãy đó tăng
hay giảm. In và thong báo ra màn hình
 */

public class Bai16Service {
    public void run() {
        System.out.println("**Kiem tra day so tang hay giam**");

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Nhap so phan tu cua day: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhap day so: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean isIncreasing = true;
        boolean isDecreasing = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isIncreasing = false;
            } else if (arr[i] < arr[i + 1]) {
                isDecreasing = false;
            }
        }

        if (isIncreasing) {
            System.out.println("Day so tang");
        } else if (isDecreasing) {
            System.out.println("Day so giam");
        } else {
            System.out.println("Day so khong tang cung khong giam");
        }
    }

    public static void main(String[] args) {
        Bai16Service bai16Service = new Bai16Service();
        bai16Service.run();
    }
}
