import java.util.Arrays;
import java.util.Scanner;

public class Bai_8 {
    public static void main(String[] args) {
        int[] a = nhap();
        int n = a.length;
        int[] b = new int[n];
        soLanXuatHien(a, b);
        int max = viTriMax(b);
        xuatPhanTu(a, b, max);
    }

    public static int[] nhap() {
        System.out.print("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        while (n <= 0) {
            System.out.print("Nhập lại n > 0: ");
            n = new Scanner(System.in).nextInt();
        }
        int[] a = new int[n];
        System.out.println("Nhập mảng số nguyên dương: ");
        for (int i = 0; i < n; i++) {
            do {
                System.out.printf("\tNhập a[%d]: ", i);
                a[i] = new Scanner(System.in).nextInt();
            } while (a[i] <= 0);
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

    public static int viTriMax(int[] b) {
        int max = b[0];
        for (int i = 1; i < b.length; i++) {
            if (max < b[i]) {
                max = b[i];
            }
        }
        return max;
    }

    public static void xuatPhanTu(int[] a, int[] b, int max) {
        System.out.println("Mảng a: " + Arrays.toString(a));
        System.out.println("Phần tử xuất hiện nhiều nhất:");
        for (int i = 0; i < b.length; i++) {
            if (b[i] == max) {
                System.out.println("Phần tử " + a[i] + ", xuất hiện " + max + " lần");
            }
        }
    }
}
