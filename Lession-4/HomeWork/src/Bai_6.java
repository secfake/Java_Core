import java.util.Arrays;
import java.util.Scanner;

public class Bai_6 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập a[%d]: ", i);
            a[i] = sc.nextInt();
        }
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
        System.out.println(max_2);
    }
}
