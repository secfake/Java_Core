package Bai_2;

import Bai_1.Student;

import java.awt.peer.PanelPeer;
import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        Student[] sv = nhapSinhVien();
        xuatSinhVien(sv);
        sapxep(sv);
        xuatSinhVien(sv);
        inSV_lop(sv);
    }

    public static Student[] nhapSinhVien() {
        System.out.print("Nhập số sinh viên: ");
        int n = new Scanner(System.in).nextInt();
        Student[] sv = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên " + (i + 1));
            sv[i] = new Student();
            sv[i].nhapThongTin();
        }
        return sv;
    }

    public static void xuatSinhVien(Student[] sv) {
        System.out.println("======================================================");
        System.out.printf("%-10s\t%-18s\t%-8s\t%-8s\n", "Mã SV", "Họ và tên", "Lớp", "Khóa");
        for (int i = 0; i < sv.length; i++) {
            sv[i].inSinhVien();
        }
    }

    public static void sapxep(Student[] sv) {
        int n = sv.length;
        Student temp;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }

                if (soSanh(sv[i], sv[j])) {
                    temp = sv[j];
                    sv[j] = sv[i];
                    sv[i] = temp;
                }
            }

        }
    }

    public static boolean soSanh(Student sv1, Student sv2) {
        String[] a = sv1.getTen().split(" ");
        String[] b = sv2.getTen().split(" ");
        int n = Math.min(a.length, b.length);
        int i = 1;
        while (i <= n) {
            int temp = a[a.length - i].compareToIgnoreCase(b[b.length - i]);
            if (temp < 0) {
                return true;
            }
            if (temp > 0) {
                break;
            }
            i += 1;
        }
        return false;
    }

    public static void inSV_lop(Student[] sv) {
        System.out.println("======================================================");
        System.out.print("Danh sách lớp: ");
        String s = new Scanner(System.in).nextLine();
        System.out.printf("%-10s\t%-18s\t%-8s\t%-8s\n", "Mã SV", "Họ và tên", "Lớp", "Khóa");
        for (Student student : sv) {
          if (student.getLop().equalsIgnoreCase(s)) {
                student.inSinhVien();
            }
        }
    }
}
