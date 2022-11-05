package Bai_1;

import java.util.Locale;
import java.util.Scanner;

public class Student {
    String maSV;
    String ten;
    String lop;
    String khoa;

    public void nhapThongTin() {
        System.out.print("  Mã SV: ");
        this.maSV = new Scanner(System.in).nextLine();
        System.out.print("  Họ và tên: ");
        this.ten = new Scanner(System.in).nextLine().toUpperCase(Locale.ROOT);
        System.out.print("  Lớp: ");
        this.lop = new Scanner(System.in).nextLine();
        System.out.print("  Khóa: ");
        this.khoa = new Scanner(System.in).nextLine();
    }

    public void inSinhVien() {
        System.out.printf("%-10s\t%-18s\t%-8s\t%-8s\n", maSV, ten, lop, khoa);
    }

    public String getLop() {

        return lop;
    }

    public String getTen() {
        return ten;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getKhoa() {
        return khoa;
    }

}
