package labs.lab2;

import java.util.Scanner;

public class Lab2Sub2 {

    public static void main(String[] args) {
        int countLogin = 0;
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Vui long nhap thong tin:");
            System.out.print("Username: ");
            String username = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();
            if(username.equalsIgnoreCase("hello") && password.length() > 8 ) {
                System.out.println("Dung dinh dang");
                break;
            }
            countLogin += 1;
            if(countLogin >= 3) {
                System.out.println("Ban da nhap qua so lan");
                break;
            }
        }
    }
}
