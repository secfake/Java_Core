import java.util.Arrays;
import java.util.Scanner;

public class Bai_28 {
    public static void main(String[] args) {
        int[][] a = nhap();
        xuat(a);
        System.out.println("Tổng đường chéo chính: "+tinhTong(a));
    }

    public static int[][] nhap() {
        System.out.print("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        while (n <= 0) {
            System.out.print("Nhập lại n >0: ");
            n = new Scanner(System.in).nextInt();
        }
        int[][] a = new int[n][n];
        System.out.println("Nhập ma trận:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("  Nhập a[%d][%d]: ", i, j);
                a[i][j] = new Scanner(System.in).nextInt();
            }
        }
        return a;
    }

    public static void xuat(int[][] a) {
        System.out.println("Ma trận: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print("\t" + a[i][j]);
            }
            System.out.println();
        }
    }

    public static int tinhTong(int[][] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i][i];
        }
        return sum;
    }
}
