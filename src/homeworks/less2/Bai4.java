package homeworks.less2;

/*
Bài 4 . Nhập vào một chuỗi S và một từ. Tìm xem từ đó có trong chuỗi S
không, thông báo kết quả tìm kiếm ra màn hình.
 */

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();
        System.out.print("Nhap tu can tim: ");
        String word = sc.nextLine().trim();
        if (word.contains(" ")) {
            System.out.println("Day khong phai la mot tu.");
            return;
        }
        String[] words = s.split("\\s+");
        boolean found = false;
        for (String w : words) {
            if (w.equals(word)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Tu " + word + " co trong chuoi " + s);
        } else {
            System.out.println("Tu " + word + " khong co trong chuoi " + s);
        }
    }
}
