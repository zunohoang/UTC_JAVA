package homeworks.bai15;

/*
Viết chương trình nhập vào một điểm của một học sinh, kiểm tra sự hợp lệ
của điểm (>=0 và <=10) và in ra kết quả xếp loại của học sinh đó.
Nếu điểm nhập vào <5: học lực Yếu
Nếu điểm nhập vào ≥5 và <6: học lực Trung bình
Nếu điểm nhập vào ≥6 và <7: học lực Trung bình khá
Nếu điểm nhập vào ≥7 và <8: học lực Khá
Nếu điểm nhập vào ≥8 và <9: học lực Giỏi
Nếu điểm nhập vào ≥9 và ≤10: học lực Xuất sắc
 */

public class Bai15Service {

    public void run() {
        System.out.println("**Xep loai hoc sinh**");

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Nhap diem: ");
        float diem = scanner.nextFloat();

        if (diem < 0 || diem > 10) {
            System.out.println("Diem khong hop le");
        } else if (diem < 5) {
            System.out.println("Hoc luc yeu");
        } else if (diem < 6) {
            System.out.println("Hoc luc trung binh");
        } else if (diem < 7) {
            System.out.println("Hoc luc trung binh kha");
        } else if (diem < 8) {
            System.out.println("Hoc luc kha");
        } else if (diem < 9) {
            System.out.println("Hoc luc gioi");
        } else {
            System.out.println("Hoc luc xuat sac");
        }
    }

    public static void main(String[] args) {
        Bai15Service bai15Service = new Bai15Service();
        bai15Service.run();
    }

}
