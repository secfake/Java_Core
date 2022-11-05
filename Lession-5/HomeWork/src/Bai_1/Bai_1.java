package Bai_1;

public class Bai_1 {
    public static void main(String[] args) {
        Student sv = new Student();
        System.out.println("Nhập thông tin sinh viên:");
        sv.nhapThongTin();
        System.out.println("======================================================");
        System.out.printf("%-10s\t%-18s\t%-8s\t%-8s\n", "Mã SV", "Họ và tên", "Lớp", "Khóa");
        sv.inSinhVien();

    }
}
