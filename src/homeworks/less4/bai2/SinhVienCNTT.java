package homeworks.less4.bai2;

class SinhVienCNTT extends SinhVien {
    private String ctDLGT;
    private String toanRR;
    private String csdl;
    private String lapTrinhOOP;

    public SinhVienCNTT(String ma, String hoTen, String ngaySinh, String gioiTinh, String tinDaiCuong, String chinhTri, String phapLuat, String ctDLGT, String toanRR, String csdl, String lapTrinhOOP) {
        super(ma, hoTen, ngaySinh, gioiTinh, tinDaiCuong, chinhTri, phapLuat);
        this.ctDLGT = ctDLGT;
        this.toanRR = toanRR;
        this.csdl = csdl;
        this.lapTrinhOOP = lapTrinhOOP;
    }

    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.print("Nhap ctDLGT: ");
        ctDLGT = lib.Keyboard.readString();
        System.out.print("Nhap toanRR: ");
        toanRR = lib.Keyboard.readString();
        System.out.print("Nhap csdl: ");
        csdl = lib.Keyboard.readString();
        System.out.print("Nhap lapTrinhOOP: ");
        lapTrinhOOP = lib.Keyboard.readString();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("CtDLGT: " + ctDLGT);
        System.out.println("ToanRR: " + toanRR);
        System.out.println("Csdl: " + csdl);
        System.out.println("LapTrinhOOP: " + lapTrinhOOP);
    }

    public static void main(String[] args) {
        SinhVienCNTT sv = new SinhVienCNTT("", "", "", "", "", "", "", "", "", "", "");
        sv.nhapThongTin();
        sv.hienThiThongTin();
    }

}

