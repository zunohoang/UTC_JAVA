package labs.lab1;

import java.util.Scanner;

public class Lab1Sub1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ho va ten: ");
        String hoTen = sc.nextLine();

        System.out.print("Gioi tinh: ");
        String gioiTinh = sc.nextLine();

        System.out.print("Diem trung binh: ");
        double dtb = sc.nextDouble();

        System.out.printf("%-20s %-10s %-15s\n", "Ho ten", "Gioi tinh", "Diem trung binh");
        System.out.printf("%-20s %-10s %-15.2f\n", hoTen, gioiTinh, dtb);
    }

}
