import java.util.Scanner;

public class Bai_12 {
    public static void main(String[] args) {
        System.out.println("Nhập n, m, k lớn hơn 0:");
        int m = nhap("m");
        int n = nhap("n");
        int k = nhap("k");
        System.out.println("\nNhập ma trận A:");
        int[][] a = nhap(m, n, "a");
        System.out.println("\nNhập ma trận B:");
        int[][] b = nhap(n, k, "b");
        xuat(a, "A");
        xuat(b, "B");
        int[][] c = tichMaTran(a, b);
        xuat(c, "tích");
    }

    public static int nhap(String s) {
        System.out.print("  Nhập " + s + ": ");
        int n = new Scanner(System.in).nextInt();
        while (n <= 0) {
            System.out.print("  Nhập lại " + s + ": ");
            n = new Scanner(System.in).nextInt();
        }
        return n;
    }

    public static int[][] nhap(int m, int n, String s) {
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("  Nhập %s[%d][%d]: ", s, i, j);
                a[i][j] = new Scanner(System.in).nextInt();
            }
        }
        return a;
    }

    public static void xuat(int[][] a, String s) {
        System.out.println("Ma trận " + s);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print("\t" + a[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] tichMaTran(int[][] a, int[][] b) {
        int m = a.length;
        int n = b.length;
        int k = b[0].length;
        int[][] c = new int[m][k];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                c[i][j] = 0;
                for (int l = 0; l < n; l++) {
                    c[i][j] += a[i][l] * b[l][j];
                }
            }
        }
        return c;
    }
}
