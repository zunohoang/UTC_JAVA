package homeworks.bai14;

// Viết chương trình in ra màn hình các số lẻ không vượt quá 100

public class Bai14Service {
    public void run() {
        System.out.println("**Cac so le khong vuot qua 100**");

        for (int i = 1; i <= 100; i += 2) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Bai14Service bai14 = new Bai14Service();
        bai14.run();
    }
}
