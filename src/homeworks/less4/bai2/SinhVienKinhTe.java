package homeworks.less4.bai2;


class SinhVienKinhTe extends SinhVien {
    private String kinhTeViMo;
    private String kinhTeViXMo;
    private String luatKinhTe;

    public SinhVienKinhTe(String ma, String hoTen, String ngaySinh, String gioiTinh, String tinDaiCuong, String chinhTri, String phapLuat, String kinhTeViMo, String kinhTeViXMo, String luatKinhTe) {
        super(ma, hoTen, ngaySinh, gioiTinh, tinDaiCuong, chinhTri, phapLuat);
        this.kinhTeViMo = kinhTeViMo;
        this.kinhTeViXMo = kinhTeViXMo;
        this.luatKinhTe = luatKinhTe;
    }

    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.print("Nhap kinh te vi mo: ");
        kinhTeViMo = lib.Keyboard.readString();
        System.out.print("Nhap kinh te vi mo: ");
        kinhTeViXMo = lib.Keyboard.readString();
        System.out.print("Nhap luat kinh te: ");
        luatKinhTe = lib.Keyboard.readString();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Kinh te vi mo: " + kinhTeViMo);
        System.out.println("Kinh te vi mo: " + kinhTeViXMo);
        System.out.println("Luat kinh te: " + luatKinhTe);
    }

    public static void main(String[] args) {
        SinhVienKinhTe sv = new SinhVienKinhTe("", "", "", "", "", "", "", "", "", "");
        sv.nhapThongTin();
        sv.hienThiThongTin();
    }
}
