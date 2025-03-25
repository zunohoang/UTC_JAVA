package homeworks.less5;

import lib.Keyboard;

import java.security.Key;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyDiem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Point2D> points2D = new ArrayList<>();
        ArrayList<Point3D> points3D = new ArrayList<>();

        points2D.add(new Point2D(3, 4));
        points2D.add(new Point2D(-2, 5));

        points3D.add(new Point3D(1, 2, 3));
        points3D.add(new Point3D(-4, -5, 6));

        System.out.println("Danh sách điểm 2D:");
        for (Point2D p : points2D) {
            p.display();
        }

        System.out.println("Danh sách điểm 3D:");
        for (Point3D p : points3D) {
            p.display();
        }

        System.out.println("Khoảng cách giữa hai điểm 2D: " + points2D.get(0).distanceTo(points2D.get(1)));
        System.out.println("Khoảng cách giữa hai điểm 3D: " + points3D.get(0).distanceTo(points3D.get(1)));

        System.out.println("Danh sách điểm đối xứng 2D:");
        for (Point2D p : points2D) {
            p.symmetric().display();
        }

        System.out.println("Danh sách điểm đối xứng 3D:");
        for (Point3D p : points3D) {
            p.symmetric().display();
        }
    }
}

class Point2D {
    protected double x, y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("(" + x + ", " + y + ")");
    }

    public double distanceToOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    public double distanceTo(Point2D other) {
        return Math.sqrt(Math.pow(x - other.x, 2) + Math.pow(y - other.y, 2));
    }

    public Point2D symmetric() {
        return new Point2D(-x, -y);
    }

    public void inputFromKeyboard(){
        System.out.println("Moi nhap x y: ");
        this.x = Keyboard.readDouble();
        this.y = Keyboard.readDouble();
    }
}

class Point3D extends Point2D {
    protected double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public void display() {
        System.out.println("(" + x + ", " + y + ", " + z + ")");
    }

    @Override
    public double distanceToOrigin() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double distanceTo(Point3D other) {
        return Math.sqrt(Math.pow(x - other.x, 2) + Math.pow(y - other.y, 2) + Math.pow(z - other.z, 2));
    }

    public Point3D symmetric() {
        return new Point3D(-x, -y, -z);
    }

    @Override
    public void inputFromKeyboard() {
        super.inputFromKeyboard();
        this.z = Keyboard.readDouble();
    }
}