package homeworks.less2;

/*
Bài 2 . Viết chương trình nhập vào một mảng số nguyên gồm n phần tử
- Tính trung bình cộng các phần tử không âm
- In ra danh sách các phần tử chia hết cho 3 nhưng không chia hết cho 6
- In ra danh sách các phần tử là số chính phương
- Nhập vào một số nguyên x, tìm các phần tử trong mảng có giá trị bằng
bình phương của x.
 */

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        int n = 5;
        int[] a = new int[n];
        nhapMang(a, n);
        xuatMang(a, n);
        trungBinhCong(a, n);
        chiaHetCho3KhongChiaHetCho6(a, n);
        soChinhPhuong(a, n);
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap x: ");
        int x = sc.nextInt();
        timPhanTuBangBinhPhuongCuaX(a, n, x);
    }

    static void nhapMang(int[] a, int n){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
    }

    static void xuatMang(int[] a, int n){
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void trungBinhCong(int[] a, int n){
        int sum = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(a[i] >= 0){
                sum += a[i];
                count++;
            }
        }
        System.out.println("Trung binh cong cac phan tu khong am: " + (float)sum / count);
    }

    static void chiaHetCho3KhongChiaHetCho6(int[] a, int n){
        System.out.print("Cac phan tu chia het cho 3 nhung khong chia het cho 6: ");
        for(int i = 0; i < n; i++){
            if(a[i] % 3 == 0 && a[i] % 6 != 0){
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }

    static boolean isPerfectSquare(int x){
        int sqrt = (int)Math.sqrt(x);
        return sqrt * sqrt == x;
    }

    static void soChinhPhuong(int[] a, int n){
        System.out.print("Cac phan tu la so chinh phuong: ");
        for(int i = 0; i < n; i++){
            if(isPerfectSquare(a[i])){
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }

    static void timPhanTuBangBinhPhuongCuaX(int[] a, int n, int x) {
        System.out.print("Cac phan tu co gia tri bang binh phuong cua " + x + ": ");
        for (int i = 0; i < n; i++) {
            if (a[i] == x * x) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }
}
