import java.util.Arrays;
import java.util.Scanner;

public class Bai_6 {
    public static void main(String[] args) {
        int[] a = nhap();
        int b, c;
        while (true) {
            System.out.print("Nhập b: ");
            b = new Scanner(System.in).nextInt();
            System.out.print("Nhập c: ");
            c = new Scanner(System.in).nextInt();
            if (b < c) {
                break;
            } else {
                System.out.println("Nhập b < c! Nhập lại!");
            }
        }
        System.out.println("Dãy số nguyên: " + Arrays.toString(a));
        System.out.printf("Trung bình cộng các số trong khoảng [%d,%d] là: %.2f", b, c, trungBinh(a, b, c));
    }

    public static int[] nhap() {
        System.out.print("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        while (n <= 0) {
            System.out.print("Nhập lại n > 0: ");
            n = new Scanner(System.in).nextInt();
        }
        int[] a = new int[n];
        System.out.println("Nhập mảng:");
        for (int i = 0; i < n; i++) {
            System.out.printf("\tNhập a[%d]: ", i);
            a[i] = new Scanner(System.in).nextInt();
        }
        return a;
    }

    public static float trungBinh(int[] a, int b, int c) {
        int n = a.length;
        int sum = 0;
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] >= b && a[i] <= c) {
                sum += a[i];
                k += 1;
            }
        }
        if (k == 0) {
            return 0;
        }
        return (float) sum / k;
    }
}
