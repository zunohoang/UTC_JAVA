package homeworks.less2;

/*
Bài 6. Hãy sinh ngẫu nhiên một dãy n số nguyên có giá trị nằm trong khoảng
từ 10 đến 90 (n nhập từ bàn phím). Hãy viết hàm tìm các phần tử có chữ số
tận cùng là 2, 4, 6 và đưa vào 1 mảng. In các phần tử trong mảng vừa mới
đưa vào.
 */

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Nhap n: ");
            n = sc.nextInt();
        } while(n <= 0);
        int[] a = new int[n];
        sinhMang(a, n);
        xuatMang(a, n);
        int[] b = timPhanTu(a, n);
        xuatMang(b, b.length);
    }

    static void sinhMang(int[] a, int n){
        for(int i = 0; i < n; i++){
            a[i] = (int)(Math.random() * 81) + 10;
        }
    }

    static void xuatMang(int[] a, int n){
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static int[] timPhanTu(int[] a, int n){
        int count = 0;
        for(int i = 0; i < n; i++){
            if(a[i] % 10 == 2 || a[i] % 10 == 4 || a[i] % 10 == 6){
                count++;
            }
        }
        int[] b = new int[count];
        int j = 0;
        for(int i = 0; i < n; i++){
            if(a[i] % 10 == 2 || a[i] % 10 == 4 || a[i] % 10 == 6){
                b[j++] = a[i];
            }
        }
        return b;
    }
}
