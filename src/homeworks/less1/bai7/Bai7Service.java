package homeworks.less1.bai7;

/*
Sử dụng một số hàm lượng giác và nhập dữ liệu từ bàn phím Kết hợp định
dạng xuất dữ liệu.( tiếp tục làm quen với class Math). Nhập 1 góc x. Tính và xuất
sinx, cosx, tgx, cotgx. Hàm lượng giác truyền vào là 1 số Radian, phải đổi góc x ra
radian, công thức đổi như sau a=x*PI/180.
 */

import java.util.Scanner;

public class Bai7Service {
    public void run(){
        System.out.println("**Luong giac**");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap goc x: ");
        float x = scanner.nextFloat();
        float a = x * (float) Math.PI / 180;
        System.out.println("sin(" + x + ") = " + Math.sin(a));
        System.out.println("cos(" + x + ") = " + Math.cos(a));
        System.out.println("tan(" + x + ") = " + Math.tan(a));
        System.out.println("cotan(" + x + ") = " + 1 / Math.tan(a));
    }

    public static void main(String[] args) {
        Bai7Service bai7Service = new Bai7Service();
        bai7Service.run();
    }
}
