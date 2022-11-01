import java.util.Arrays;
import java.util.Scanner;

public class Bai_26 {
    public static void main(String[] args) {
        int[] a = nhap();
        System.out.println("Mảng số nguyên: " + Arrays.toString(a));
        timx(a);
    }

    public static int[] nhap() {
        System.out.print("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        while (n <= 0) {
            System.out.print("Nhập lại n >0: ");
            n = new Scanner(System.in).nextInt();
        }
        int[] a = new int[n];
        System.out.println("Nhập mảng:");
        for (int i = 0; i < n; i++) {
            System.out.printf("  Nhập a[%d]: ", i);
            a[i] = new Scanner(System.in).nextInt();
        }
        return a;
    }

    public static void timx(int[] a) {
        int n = a.length;
        int temp = 0;
        System.out.print("Nhập x: ");
        int x = new Scanner(System.in).nextInt();
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                temp += 1;
            }
        }
        System.out.printf("Số %d xuất hiện %d lần ", x, temp);
    }
}


