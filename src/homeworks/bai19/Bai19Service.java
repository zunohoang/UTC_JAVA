package homeworks.bai19;

/*
Viết chương trình nhập dãy số thực có n phần tử và một số x. In ra màn hình
các phần tử là số hoàn hảo.
 */

public class Bai19Service {
    public void run() {
        System.out.println("**So hoan hao**");

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Nhap so phan tu cua day: ");
        int n = scanner.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = scanner.nextDouble();
        }

        System.out.print("Nhap so x: ");
        double x = scanner.nextDouble();

        System.out.println("Cac phan tu la so hoan hao:");
        for (int i = 0; i < n; i++) {
            if (isPerfectNumber(arr[i])) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Bai19Service bai19 = new Bai19Service();
        bai19.run();
    }

    public boolean isPerfectNumber(double n) {
        if (n < 1) {
            return false;
        }

        double sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum == n;
    }
}
