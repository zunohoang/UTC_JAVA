package homeworks;

import homeworks.bai1.Bai1Service;
import homeworks.bai10.Bai10Service;
import homeworks.bai11.Bai11Service;
import homeworks.bai12.Bai12Service;
import homeworks.bai13.Bai13Service;
import homeworks.bai14.Bai14Service;
import homeworks.bai15.Bai15Service;
import homeworks.bai16.Bai16Service;
import homeworks.bai17.Bai17Service;
import homeworks.bai18.Bai18Service;
import homeworks.bai19.Bai19Service;
import homeworks.bai2.Bai2Service;
import homeworks.bai3.ThaoTacSo;
import homeworks.bai4.TinhDienTich;
import homeworks.bai5.PhuongTrinhBac1;
import homeworks.bai6.PhuongTrinhBac2;
import homeworks.bai7.Bai7Service;
import homeworks.bai8.Bai8Sevice;
import homeworks.bai9.Bai9Service;

import java.util.Scanner;

public class HomeworkController {

    public void run() {
        System.out.println("Chon bai tap:");
        System.out.println("1. Bai 1");
        System.out.println("2. Bai 2");
        System.out.println("3. Bai 3");
        System.out.println("4. Bai 4");
        System.out.println("5. Bai 5");
        System.out.println("6. Bai 6");
        System.out.println("7. Bai 7");
        System.out.println("8. Bai 8");
        System.out.println("9. Bai 9");
        System.out.println("10. Bai 10");
        System.out.println("11. Bai 11");
        System.out.println("12. Bai 12");
        System.out.println("13. Bai 13");
        System.out.println("14. Bai 14");
        System.out.println("15. Bai 15");
        System.out.println("16. Bai 16");
        System.out.println("17. Bai 17");
        System.out.println("18. Bai 18");
        System.out.println("19. Bai 19");

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Chon: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Bai1Service bai1 = new Bai1Service();
                bai1.run();
                break;
            case 2:
                Bai2Service bai2 = new Bai2Service();
                bai2.run();
                break;
            case 3:
                ThaoTacSo bai3 = new ThaoTacSo();
                bai3.run();
                break;
            case 4:
                TinhDienTich bai4 = new TinhDienTich();
                bai4.run();
                break;
            case 5:
                PhuongTrinhBac1 bai5 = new PhuongTrinhBac1();
                bai5.run();
                break;
            case 6:
                PhuongTrinhBac2 bai6 = new PhuongTrinhBac2();
                bai6.run();
                break;
            case 7:
                Bai7Service bai7 = new Bai7Service();
                bai7.run();
                break;
            case 8:
                Bai8Sevice bai8 = new Bai8Sevice();
                bai8.run();
                break;
            case 9:
                Bai9Service bai9 = new Bai9Service();
                bai9.run();
                break;
            case 10:
                Bai10Service bai10 = new Bai10Service();
                bai10.run();
                break;
            case 11:
                Bai11Service bai11 = new Bai11Service();
                bai11.run();
                break;
            case 12:
                Bai12Service bai12 = new Bai12Service();
                bai12.run();
                break;
            case 13:
                Bai13Service bai13 = new Bai13Service();
                bai13.run();
                break;
            case 14:
                Bai14Service bai14 = new Bai14Service();
                bai14.run();
                break;
            case 15:
                Bai15Service bai15 = new Bai15Service();
                bai15.run();
                break;
            case 16:
                Bai16Service bai16 = new Bai16Service();
                bai16.run();
                break;
            case 17:
                Bai17Service bai17 = new Bai17Service();
                bai17.run();
                break;
            case 18:
                Bai18Service bai18 = new Bai18Service();
                bai18.run();
                break;
            case 19:
                Bai19Service bai19 = new Bai19Service();
                bai19.run();
                break;
            default:
                System.out.println("Khong co bai tap nay");
                break;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        HomeworkController controller = new HomeworkController();
        while(true) {
            controller.run();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Tiep tuc? (y/n): ");
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("y")) {
                break;
            }
        }
    }
}
