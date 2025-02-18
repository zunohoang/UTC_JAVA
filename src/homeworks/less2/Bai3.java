package homeworks.less2;

/*
Bài 3 . Nhập một chuỗi ký tự. Đếm xem chuỗi đó có bao nhiêu từ (mỗi từ
cách nhau bởi một khoảng trắng có thể là một hoặc nhiều dấu cách, tab, xuống
dòng).
Ví dụ nhập vào chuỗi "Tôi muốn học tốt môn lập trình java " có 8 từ.

 */

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String str = sc.nextLine();
        System.out.println("So tu trong chuoi: " + countWords(str));
    }

    static int countWords(String str){
        int count = 0;
        boolean isWord = false;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' ' && !isWord){
                isWord = true;
                count++;
            } else if(str.charAt(i) == ' '){
                isWord = false;
            }
        }
        return count;
    }
}
