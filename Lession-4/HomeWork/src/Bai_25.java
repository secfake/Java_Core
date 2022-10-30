import java.util.Arrays;
import java.util.Scanner;

public class Bai_25 {
    public static void main(String[] args) {
        int[] a = nhap();
        System.out.println("Mảng số nguyên: " + Arrays.toString(a));
        timChanLe(a);
    }

    public static int[] nhap() {
        System.out.print("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        while (n <= 0) {
            System.out.print("Nhập lại n >0: ");
            n = new Scanner(System.in).nextInt();
        }
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập a[%d]: ", i);
            a[i] = new Scanner(System.in).nextInt();
        }
        return a;
    }

    public static void timChanLe(int[] a) {
        int n = a.length;
        int chan = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                chan += 1;
            }
        }
        System.out.printf("Mảng có %d số chăn, %d số lẻ",chan,n-chan);
    }
}
