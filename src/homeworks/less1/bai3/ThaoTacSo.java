package homeworks.less1.bai3;

import java.util.Scanner;

public class ThaoTacSo {
    public float add(float a, float b) {
        return a + b;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi nhap so thu nhat: ");
        float a = scanner.nextFloat();
        System.out.print("Moi nhap so thu hai: ");
        float b = scanner.nextFloat();
        System.out.println("Tong cua " + a + " va " + b + " la " + add(a, b));
    }

    public static void main(String[] args) {
        ThaoTacSo thaoTacSo = new ThaoTacSo();
        thaoTacSo.run();
    }
}
