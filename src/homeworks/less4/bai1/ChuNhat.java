package homeworks.less4.bai1;

public class ChuNhat extends Hinh {
    private float chieuDai;
    private float chieuRong;

    public ChuNhat(float chieuDai, float chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public float dienTich() {
        return chieuDai * chieuRong;
    }

    @Override
    public float chuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    public float getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(float chieuDai) {
        this.chieuDai = chieuDai;
    }

    public void setChieuRong(float chieuRong) {
        this.chieuRong = chieuRong;
    }

    public float getChieuRong() {
        return chieuRong;
    }
}