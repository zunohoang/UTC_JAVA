package labs.lab3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SinhVien {
    private String hoTen;
    private String diaChi;
    private String gioiTinh;
    private float diem;

    public SinhVien() {}

    public SinhVien(String hoTen, String diaChi, String gioiTinh, float diem) {
        setHoTen(hoTen);
        setDiaChi(diaChi);
        setGioiTinh(gioiTinh);
        setDiem(diem);
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Moi nhap ho ten: ");
                setHoTen(sc.nextLine());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Loi: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Moi nhap dia chi: ");
                setDiaChi(sc.nextLine());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Loi: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Moi nhap gioi tinh (Nam/Nu): ");
                setGioiTinh(sc.nextLine());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Loi: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Mời nhập điểm: ");
                if (!sc.hasNextFloat()) {
                    throw new IllegalArgumentException("Điểm phải là số thực.");
                }

                float diem = sc.nextFloat();
                setDiem(diem);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Lỗi: " + e.getMessage());
                sc.nextLine();
            }
        }
    }

    public void xuat() {
        System.out.println("\nThong tin hoc sinh");
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("Diem: " + diem);
        System.out.println("Xep loai: " + xepHang());
    }

    public void inTheoDong(){

    }

    public String xepHang() {
        if (diem < 5) return "TB";
        else if (diem < 8) return "KHA";
        return "GIOI";
    }

    public void setHoTen(String hoTen) {
        if (!Pattern.matches("^[a-zA-Z\\s]{1,50}$", hoTen))
            throw new IllegalArgumentException("Ho ten chi duoc chua chu cai, khoang trang va toi da 50 ky tu.");
        this.hoTen = hoTen;
    }

    public void setDiaChi(String diaChi) {
        if (!Pattern.matches("^[a-zA-Z0-9\\s,]{5,100}$", diaChi))
            throw new IllegalArgumentException("Dia chi chi duoc chua chu cai, so, cach va toi da 100 ky tu.");
        this.diaChi = diaChi;
    }

    public void setGioiTinh(String gioiTinh) {
        if (!Pattern.matches("^(Nam|Nu)$", gioiTinh))
            throw new IllegalArgumentException("Gioi tinh chi duoc la 'Nam' hoac 'Nu'.");
        this.gioiTinh = gioiTinh;
    }

    public void setDiem(float diem) {
        if (diem < 0.0 || diem > 10.0)
            throw new IllegalArgumentException("Diem phai tu 0.0 den 10.0.");
        this.diem = diem;
    }

    public float getDiem() {
        return diem;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getHoTen() {
        return hoTen;
    }
}
