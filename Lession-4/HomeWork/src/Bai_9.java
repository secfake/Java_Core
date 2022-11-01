import java.util.Arrays;
import java.util.Scanner;

public class Bai_9 {
    public static void main(String[] args) {
        int[] a = nhap();
        int[] b = new int[a.length];
        soLanXuatHien(a, b);
        xuatPhanTu(a, b);
    }

    public static int[] nhap() {
        System.out.print("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        while (n <= 0) {
            System.out.print("Nhập lại n > 0: ");
            n = new Scanner(System.in).nextInt();
        }
        int[] a = new int[n];
        System.out.println("Nhập mảng số nguyên: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("\tNhập a[%d]: ", i);
            a[i] = new Scanner(System.in).nextInt();
        }
        return a;
    }

    public static int[] soLanXuatHien(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            b[i] = 0;
            for (int j = i; j < a.length; j++) {
                if (a[i] == a[j]) {
                    b[i] += 1;
                }
            }
        }
        return b;
    }

    public static void xuatPhanTu(int[] a, int[] b) {
        String ketqua = "";
        System.out.println("Mảng a: " + Arrays.toString(a));
        for (int i = 0; i < b.length; i++) {
            if (b[i] == 1) {
                ketqua += a[i] + " ";
            }
        }
        System.out.println("Các số khác nhau trong dãy: " + ketqua);
    }
}
