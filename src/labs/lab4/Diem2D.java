package labs.lab4;

public class Diem2D {
    protected double x, y;

    public Diem2D(){}

    public Diem2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void show(){
        System.out.println("Toa do: (" + x + "," + y + ")");
    }

    public double khoangCach(){
        return Math.sqrt(x*x + y*y);
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
