import java.util.Arrays;
import java.util.Scanner;

public class Bai_5 {
    public static void main(String[] args) {
        System.out.print("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập a[%d]: ", i);
            a[i] = new Scanner(System.in).nextInt();
        }
        soLonThu2(a,n);
    }

    public static void soLonThu2(int[] a, int n) {
        int max_1 = a[0];
        int max_2 = a[0];
        for (int i = 0; i < n - 1; i++)
            if (a[i] < a[i + 1]) {
                max_1 = a[i + 1];
            }
        for (int i = 0; i < n - 1; i++)
            if (a[i] < a[i + 1] && a[i + 1] != max_1) {
                max_2 = a[i + 1];
            }
        System.out.println("Dãy số nguyên: " + Arrays.toString(a));
        if (max_1 != max_2) {
            System.out.println("Số lớn thứ 2: " + max_2);
        } else {
            System.out.println("Không có số lớn thứ 2!");
        }
    }
}
