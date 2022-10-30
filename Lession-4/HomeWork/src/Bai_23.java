import java.util.Scanner;

public class Bai_23 {
    public static void main(String[] args) {
        int n = 0;
        int m = 0;
        while (n <= 0) {
            System.out.print("Nhập n: ");
            n = new Scanner(System.in).nextInt();
        }
        while (m <= 0) {
            System.out.print("Nhập m: ");
            m = new Scanner(System.in).nextInt();
        }
        System.out.println("\nNhập ma trận A");
        int[][] a = nhap("a", n, m);
        System.out.println("\nNhập ma trận B");
        int[][] b = nhap("b", n, m);
        int[][] c = tongMaTran(a, b);
        xuat(a, "A");
        xuat(b, "B");
        xuat(c, "tổng C");
    }

    public static int[][] nhap(String s, int n, int m) {
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("Nhập %s[%d][%d]: ", s, i, j);
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

    public static int[][] tongMaTran(int[][] a, int[][] b) {
        int n = a.length;
        int m = a[0].length;
        int[][] c = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

}
