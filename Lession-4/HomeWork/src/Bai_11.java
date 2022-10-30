import java.util.Arrays;
import java.util.Scanner;

public class Bai_11 {
    public static void main(String[] args) {
        System.out.print("Nhập m: ");
        int m = new Scanner(System.in).nextInt();
        System.out.print("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        int[][] a = nhap(m, n);
        int[][] b = new int[n][m];
        xuat(a, "A");
        b = chuyenVi(a,b);
        xuat(b, "chuyển vị B");

    }

    public static int[][] nhap(int m, int n) {
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Nhập a[%d][%d]: ", i, j);
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

    public static int[][] chuyenVi(int[][] a, int[][] b) {
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j <b[0].length ; j++) {
                b[i][j]=a[j][i];
            }
        }
        return b;
    }
}
