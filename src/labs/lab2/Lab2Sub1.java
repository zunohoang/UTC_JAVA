package labs.lab2;

import java.util.Arrays;

public class Lab2Sub1 {
    public static void main(String[] args) {
        int[] a = {7,1,2,3,4};
        System.out.println("Mang la: " + Arrays.toString(a));

        Arrays.sort(a);
        System.out.println("Mang sort: " + Arrays.toString(a));

        Arrays.fill(a, 100);
        System.out.println("Mang fill: " + Arrays.toString(a));
    }
}
