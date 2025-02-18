package homeworks.less1.bai2;

import java.util.Scanner;


public class Bai2Service {

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = scanner.nextInt();
        double y = Math.pow(2, x);
        System.out.print("y = 2^x = " + y);
    }

    public static void main(String[] args) {
        Bai2Service bai2Service = new Bai2Service();
        bai2Service.run();
    }
}
