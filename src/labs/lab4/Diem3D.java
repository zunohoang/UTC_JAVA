package labs.lab4;

public class Diem3D extends Diem2D{
    protected double z;

    public Diem3D(){}

    public Diem3D(double x, double y, double z){
        super(x, y);
        this.z = z;
    }

    @Override
    public void show() {
        System.out.println("Toa do: (" + x + "," + y + "," + z + ")");
    }

    @Override
    public double khoangCach() {
        return Math.sqrt(x*x + y*y + z*z);
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
}
