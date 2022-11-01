import java.util.Arrays;
import java.util.Scanner;

public class Bai_4 {
    public static void main(String[] args) {
        int[] a = nhap();
        demcap(a);
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

    public static void demcap(int[] a) {
        int n = a.length;
        int k = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] == a[i + 1]) {
                k += 1;
            }
        }
        System.out.println("Dãy số nguyên: " + Arrays.toString(a));
        System.out.println("Số cặp liên tiếp bằng nhau: " + k);
    }


}
