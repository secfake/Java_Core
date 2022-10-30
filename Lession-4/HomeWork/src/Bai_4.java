import java.util.Arrays;
import java.util.Scanner;

public class Bai_4 {
    public static void main(String[] args) {
        System.out.print("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập a[%d]: ", i);
            a[i] = new Scanner(System.in).nextInt();
        }
        demcap(a,n);
    }

    public static void demcap(int[] a, int n) {
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
