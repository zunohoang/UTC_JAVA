package homeworks.less1.bai10;

/*
Sử dụng hàm toán học và nhập dữ liệu từ bàn phím Kết hợp định dạng
xuất dữ liệu. Tạo Project mới với tên là SoGaSoCho. Tìm số gà và số chó, biết: Vừa
gà vừa chó, Bó lại cho tròn, Ba mươi sáu con, Một trăm chân chẵn
 */

public class Bai10Service {
    public void run() {
        System.out.println("**So ga so cho**");

        int soGa = 0;
        int soCho = 0;
        for (int i = 0; i <= 36; i++) {
            soGa = i;
            soCho = 36 - i;
            if (soGa * 2 + soCho * 4 == 100) {
                break;
            }
        }

        System.out.println("So ga: " + soGa);
        System.out.println("So cho: " + soCho);
    }

    public static void main(String[] args) {
        Bai10Service bai10Service = new Bai10Service();
        bai10Service.run();
    }
}
