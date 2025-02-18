package homeworks.less2;

/*
Bài 5. Nhập vào các thông tin sau (yêu cầu kiểm tính hợp lệ thông qua biểu
thức chính qui nếu cần)
- Mã nhân viên (có 3 ký tự là chữ cái, 3 ký tự là chữ số)
- Họ và tên (tối thiểu 5 ký tự)
- Địa chỉ (tối đa 30 ký tự)
- Số điện thoại (đủ 10 chữ số)
- Ngày sinh (dạng yy-mm-yyyy)
- Email
- Số CMND (9 số)

 */
import java.util.Scanner;
import java.util.regex.Pattern;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String maNhanVien = getValidatedInput(sc, "Ma nhan vien (3 ky tu chu cai, 3 ky tu chu so): ", "[a-zA-Z]{3}\\d{3}");
        String hoTen = getValidatedInput(sc, "Ho va ten (toi thieu 5 ky tu): ", ".{5,}");
        String diaChi = getValidatedInput(sc, "Dia chi (toi da 30 ky tu): ", ".{1,30}");
        String soDienThoai = getValidatedInput(sc, "So dien thoai (10 chu so): ", "\\d{10}");
        String ngaySinh = getValidatedInput(sc, "Ngay sinh (dinh dang yy-mm-yyyy): ", "\\d{2}-\\d{2}-\\d{4}");
        String email = getValidatedInput(sc, "Email: ", "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
        String soCMND = getValidatedInput(sc, "So CMND (9 so): ", "\\d{9}");

        System.out.println("Thong tin nhan vien:");
        System.out.println("Ma nhan vien: " + maNhanVien);
        System.out.println("Ho va ten: " + hoTen);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("So dien thoai: " + soDienThoai);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Email: " + email);
        System.out.println("So CMND: " + soCMND);
    }

    private static String getValidatedInput(Scanner sc, String prompt, String regex) {
        System.out.print(prompt);
        String input = sc.nextLine();
        while (!Pattern.matches(regex, input)) {
            System.out.print("Khong hop le. Nhap lai: ");
            input = sc.nextLine();
        }
        return input;
    }
}