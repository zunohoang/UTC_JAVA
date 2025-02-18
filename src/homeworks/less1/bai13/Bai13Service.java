package homeworks.less1.bai13;

/*
Viết chương trình nhập vào một số giây sau đó in ra màn hình thời gian dưới
dạng giờ:phút:giây
Gợi ý:
- Ví dụ nhập vào 3769 giây thì in ra màn hình dưới dạng: 01:02: 49
- Giả sử nhập vào số giây là : t (giây) thì:
Giờ := t div 3600;
Phút := (t mod 3600) div 60;
Giây := (t mod 3600) mod 60;
 */

public class Bai13Service {
    public void run() {
        System.out.println("**Chuyen doi giay sang gio:phut:giay**");

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Nhap so giay: ");
        int t = scanner.nextInt();

        int gio = t / 3600;
        int phut = (t % 3600) / 60;
        int giay = (t % 3600) % 60;

        System.out.printf("%02d:%02d:%02d\n", gio, phut, giay);
    }

    public static void main(String[] args) {
        Bai13Service bai13Service = new Bai13Service();
        bai13Service.run();
    }
}
