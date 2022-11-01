import java.util.Arrays;
import java.util.Scanner;

public class Bai_7 {
    public static void main(String[] args) {
        int[] a = nhap();
        System.out.println("Mảng a: " + Arrays.toString(a));
        if (checkDoiXung(a)) {
            System.out.println("a là mảng đối xứng!");
        } else {
            System.out.println("a không phải mảng đối xứng!");
        }
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

    public static boolean checkDoiXung(int[] a) {
        int n = a.length;
        for (int i = 0; i < n / 2; i++) {
            if (a[i] != a[n - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
