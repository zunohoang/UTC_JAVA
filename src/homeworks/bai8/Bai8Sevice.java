package homeworks.bai8;

/*
Sử dụng một số hàm lượng giác và nhập dữ liệu từ bàn phím Kết hợp định
dạng xuất dữ liệu.( tiếp tục làm quen với class Math). Nhập cạnh a>0, b>0, c>0. Nếu
a, b, c tạo thành tam giác thì hãy tính và xuất chu vi, diện tích hình tam giác. Ngược
lại thông báo “Không tạo thành tam giác
 */

import java.util.Scanner;

public class Bai8Sevice {
    public void run() {
        System.out.println("**Tinh chu vi va dien tich tam giac**");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap canh a: ");
        float a = scanner.nextFloat();
        System.out.print("Nhap canh b: ");
        float b = scanner.nextFloat();
        System.out.print("Nhap canh c: ");
        float c = scanner.nextFloat();

        if (a + b > c && a + c > b && b + c > a) {
            float chuVi = a + b + c;
            System.out.println("Chu vi hinh tam giac la: " + chuVi);
            float p = chuVi / 2;
            float dienTich = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("Dien tich hinh tam giac la: " + dienTich);
        } else {
            System.out.println("Khong tao thanh tam giac");
        }
    }

    public static void main(String[] args) {
        Bai8Sevice bai8Sevice = new Bai8Sevice();
        bai8Sevice.run();
    }
}
