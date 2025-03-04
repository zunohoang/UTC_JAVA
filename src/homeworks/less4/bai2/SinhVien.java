package homeworks.less4.bai2;

public class SinhVien {
    private String ma;
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String tinDaiCuong;
    private String chinhTri;
    private String phapLuat;

    public SinhVien(String ma, String hoTen, String ngaySinh, String gioiTinh, String tinDaiCuong, String chinhTri, String phapLuat) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.tinDaiCuong = tinDaiCuong;
        this.chinhTri = chinhTri;
        this.phapLuat = phapLuat;
    }

    public void nhapThongTin() {
        System.out.print("Nhap ma: ");
        ma = lib.Keyboard.readString();
        System.out.print("Nhap ho ten: ");
        hoTen = lib.Keyboard.readString();
        System.out.print("Nhap ngay sinh: ");
        ngaySinh = lib.Keyboard.readString();
        System.out.print("Nhap gioi tinh: ");
        gioiTinh = lib.Keyboard.readString();
        System.out.print("Nhap tin dai cuong: ");
        tinDaiCuong = lib.Keyboard.readString();
        System.out.print("Nhap chinh tri: ");
        chinhTri = lib.Keyboard.readString();
        System.out.print("Nhap phap luat: ");
        phapLuat = lib.Keyboard.readString();
    }

    public void hienThiThongTin() {
        System.out.println("Ma: " + ma);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("Tin dai cuong: " + tinDaiCuong);
        System.out.println("Chinh tri: " + chinhTri);
        System.out.println("Phap luat: " + phapLuat);
    }

    public static void main(String[] args) {
        SinhVien sv = new SinhVien("", "", "", "", "", "", "");
        sv.nhapThongTin();
        sv.hienThiThongTin();
    }

}
