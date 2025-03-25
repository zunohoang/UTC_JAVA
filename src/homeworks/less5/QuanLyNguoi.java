package homeworks.less5;

import java.util.Scanner;
import java.util.ArrayList;

class Person {
    protected String fullName;
    protected int birthYear;
    protected String hometown;
    protected Scanner scanner;

    public Person() {
        scanner = new Scanner(System.in);
    }

    public void input() {
        System.out.print("Nhập họ tên: ");
        fullName = scanner.nextLine();

        System.out.print("Nhập năm sinh: ");
        birthYear = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập quê quán: ");
        hometown = scanner.nextLine();
    }

    public void output() {
        System.out.println("Họ tên: " + fullName);
        System.out.println("Năm sinh: " + birthYear);
        System.out.println("Quê quán: " + hometown);
    }
}

class Student extends Person {
    private double averageScore;

    @Override
    public void input() {
        super.input();
        System.out.print("Nhập điểm trung bình: ");
        averageScore = scanner.nextDouble();
    }

    @Override
    public void output() {
        super.output();
        System.out.printf("Điểm trung bình: %.2f\n", averageScore);
        System.out.println("Xếp loại học tập: " + getAcademicRanking());
    }

    public String getAcademicRanking() {
        if (averageScore >= 8.0) return "Giỏi";
        if (averageScore >= 6.5) return "Khá";
        if (averageScore >= 5.0) return "Trung bình";
        return "Yếu";
    }
}

class Teacher extends Person {
    private int teachingHours;
    private double basicSalary;
    private double allowance;

    @Override
    public void input() {
        super.input();
        System.out.print("Nhập số giờ dạy: ");
        teachingHours = scanner.nextInt();

        System.out.print("Nhập lương cơ bản: ");
        basicSalary = scanner.nextDouble();

        System.out.print("Nhập phụ cấp: ");
        allowance = scanner.nextDouble();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Số giờ dạy: " + teachingHours);
        System.out.printf("Lương cơ bản: %.2f\n", basicSalary);
        System.out.printf("Phụ cấp: %.2f\n", allowance);
        System.out.printf("Tổng thu nhập: %.2f\n", calculateIncome());
    }

    public double calculateIncome() {
        return basicSalary + allowance;
    }
}


public class QuanLyNguoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Teacher> teachers = new ArrayList<>();

        System.out.print("Nhập số lượng sinh viên: ");
        int studentCount = scanner.nextInt();

        System.out.print("Nhập số lượng giảng viên: ");
        int teacherCount = scanner.nextInt();

        System.out.println("\n--- Nhập thông tin sinh viên ---");
        for (int i = 0; i < studentCount; i++) {
            System.out.println("Sinh viên " + (i + 1) + ":");
            Student student = new Student();
            student.input();
            students.add(student);
        }

        System.out.println("\n--- Nhập thông tin giảng viên ---");
        for (int i = 0; i < teacherCount; i++) {
            System.out.println("Giảng viên " + (i + 1) + ":");
            Teacher teacher = new Teacher();
            teacher.input();
            teachers.add(teacher);
        }

        System.out.println("\n--- Thông tin sinh viên ---");
        for (Student student : students) {
            student.output();
            System.out.println("---");
        }

        System.out.println("\n--- Thông tin giảng viên ---");
        for (Teacher teacher : teachers) {
            teacher.output();
            System.out.println("---");
        }
    }
}