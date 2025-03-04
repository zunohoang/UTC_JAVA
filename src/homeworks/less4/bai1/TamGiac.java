package homeworks.less4.bai1;

public class TamGiac extends Hinh {
    private float canh1;
    private float canh2;
    private float canh3;

    public TamGiac(float canh1, float canh2, float canh3) {
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canh3 = canh3;
    }

    @Override
    public float dienTich() {
        float p = chuVi() / 2;
        return (float) Math.sqrt(p * (p - canh1) * (p - canh2) * (p - canh3));
    }

    @Override
    public float chuVi() {
        return canh1 + canh2 + canh3;
    }

    public float getCanh1() {
        return canh1;
    }

    public float getCanh2() {
        return canh2;
    }

    public float getCanh3() {
        return canh3;
    }

    public void setCanh1(float canh1) {
        this.canh1 = canh1;
    }

    public void setCanh2(float canh2) {
        this.canh2 = canh2;
    }

    public void setCanh3(float canh3) {
        this.canh3 = canh3;
    }
}
