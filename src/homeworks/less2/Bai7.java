package homeworks.less2;

/*
Bài 7. Nhập một chuỗisố nguyên từ bàn phím (mỗi số cách nhau bởi khoảng
trắng). Hãy sắp xếp các phần tử chẳn lên đầu dãy và tăng dần, các phần tử
lẻ xuống cuối dãy và giảm dần.
 */

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.print("Nhap n: ");
            n = sc.nextInt();
        } while(n <= 0);
        int[] a = new int[n];
        System.out.println("Nhap mang: ");
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        sapXep(a);
        xuatMang(a);
    }

    static void sapXep(int[] a){
        int n = a.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(a[i] % 2 == 0 && a[j] % 2 == 0 && a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                } else if(a[i] % 2 != 0 && a[j] % 2 != 0 && a[i] < a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    static void xuatMang(int[] a){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
