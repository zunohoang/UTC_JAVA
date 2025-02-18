package homeworks.less2;

import java.util.Scanner;

import java.util.*;

public class Bai1 {

    static void nhapMang(float[] a, int n){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            a[i] = sc.nextFloat();
        }
    }

    static void xuatMang(float[] a, int n){
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 5;
        float[] a = new float[n];
        nhapMang(a, n);
        Arrays.sort(a);
        System.out.println("Mang sau khi sap xep la: ");
        xuatMang(a, n);
        System.out.println("Max: " + a[n - 1]);
        System.out.println("Min: " + a[0]);
    }
}
