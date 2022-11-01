import java.util.Arrays;
import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args) {
        int[] a = nhap();
        sapXepTang(a);
    }

    public static int[] nhap() {
        System.out.print("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        while (n <= 0) {
            System.out.print("Nhập lại n > 0: ");
            n = new Scanner(System.in).nextInt();
        }
        int[] a = new int[n];
        System.out.println("Nhập dãy số:");
        for (int i = 0; i < n; i++) {
            System.out.printf("\tNhập a[%d]: ", i);
            a[i] = new Scanner(System.in).nextInt();
        }
        return a;
    }

    public static void sapXepTang(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("Dãy số nguyên: " + Arrays.toString(a));
    }
}
