import java.util.Arrays;
import java.util.Scanner;

public class In_class {
    public static void main(String[] args) {
        System.out.printf("Nhập n: ");
        int sum = 0;
        int n = new Scanner(System.in).nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập a[%d]: ", i);
            a[i] = new Scanner(System.in).nextInt();
        }
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println((float) sum / n);
    }
}
