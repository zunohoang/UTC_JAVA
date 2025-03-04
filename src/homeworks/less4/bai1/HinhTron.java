package homeworks.less4.bai1;

public class HinhTron extends Hinh {
    private float banKinh;

    public HinhTron(float banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public float dienTich() {
        return (float) (Math.PI * Math.pow(banKinh, 2));
    }

    @Override
    public float chuVi() {
        return (float) (2 * Math.PI * banKinh);
    }

    public float getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(float banKinh) {
        this.banKinh = banKinh;
    }
}
