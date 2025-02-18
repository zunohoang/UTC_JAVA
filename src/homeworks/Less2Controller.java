package homeworks;

import java.util.Scanner;
import homeworks.less2.*;

public class Less2Controller {
    // chuong trinh goi tat ca cac class trong less2 package
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int option;
            System.out.println("Voi long chon bai [1-7] hoac 0 de thoat: ");
            option = sc.nextInt();
            switch(option){
                case 0:
                    System.out.println("Ket thuc chuong trinh!");
                    return;
                case 1:
                    Bai1.main(args);
                    break;
                case 2:
                    Bai2.main(args);
                    break;
                case 6:
                    Bai6.main(args);
                    break;
                case 7:
                    Bai7.main(args);
                    break;
                default:
                    System.out.println("Khong co bai nao phu hop!");
            }
        }
    }
}
