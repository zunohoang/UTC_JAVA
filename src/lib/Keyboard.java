package lib;

import java.util.Scanner;

public class Keyboard {
    public static Scanner scanner = new Scanner(System.in);

    public static int readInt(){
        return scanner.nextInt();
    }

    public static float readFloat(){
        return scanner.nextFloat();
    }

    public static double readDouble(){
        return scanner.nextDouble();
    }

    public static String readString(){
        return scanner.nextLine();
    }
}
