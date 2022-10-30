import java.util.Arrays;
import java.util.Scanner;

public class Bai_27 {
    public static void main(String[] args) {
        System.out.print("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        while (n <= 0) {
            System.out.print("Nhập lại n >0: ");
            n = new Scanner(System.in).nextInt();
        }
        int[] a = nhap(n, "a");
        int[] b = nhap(n, "b");
        int[]c = tinhTong(a,b);
        System.out.println("Mảng A: " + Arrays.toString(a));
        System.out.println("Mảng B: " + Arrays.toString(b));
        System.out.println("Tổng A và B: " + Arrays.toString(c));
    }

    public static int[] nhap(int n, String s) {
        int[] a = new int[n];
        System.out.println("Nhập mảng " + s.toUpperCase());
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập %s[%d]: ", s, i);
            a[i] = new Scanner(System.in).nextInt();
        }
        return a;
    }

    public static int[] tinhTong(int[] a, int[] b) {
        int n = a.length;
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
                         c[i]=a[i]+b[n-i-1];
        }
        return c;
    }
}
