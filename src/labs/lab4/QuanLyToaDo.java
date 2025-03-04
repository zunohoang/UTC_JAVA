package labs.lab4;

import lib.Keyboard;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

public class QuanLyToaDo {

    public static List<Diem2D> diem2DList = new ArrayList<>();
    public static List<Diem3D> diem3DList = new ArrayList<>();

    public static void nhapDiem2D(Diem2D diem){
        System.out.print("Moi nhap x, y: ");
        diem.setX(Keyboard.readDouble());
        diem.setY(Keyboard.readDouble());
    }

    public static void nhapDiem3D(Diem3D diem){
        nhapDiem2D(diem);
        diem.setZ(Keyboard.readDouble());
    }

    public static double tongKhoangCach2D(){
        double sum = 0;
        for(int i = 0; i < diem2DList.size(); i++){
            sum += diem2DList.get(i).khoangCach();
        }
        return sum;
    }

    public static double tongKhoangCach3D(){
        double sum = 0;
        for(int i = 0; i < diem3DList.size(); i++){
            sum += diem3DList.get(i).khoangCach();
        }
        return sum;
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Moi nhap n: ");
        n = Keyboard.readInt();
        System.out.println("Nhap danh sach: ");
        for(int i = 0; i < n; i++){
            System.out.printf("Moi nhap diem thu a[%d]", i);
            Diem2D diem = new Diem2D();
            nhapDiem2D(diem);;
            diem2DList.add(diem);
        }

        int m;
        System.out.println("Moi nhap m: ");
        m = Keyboard.readInt();
        System.out.println("Nhap danh sach: ");
        for(int i = 0; i < n; i++){
            System.out.printf("Moi nhap diem thu a[%d]", i);
            Diem3D diem = new Diem3D();
            nhapDiem3D(diem);
            diem3DList.add(diem);
        }

        System.out.println("TongKC2D: " + tongKhoangCach2D());
        System.out.println("TongKC2D: " + tongKhoangCach3D());
    }
}
