import java.util.Scanner;

public class Bai_21 {
    public static void main(String[] args) {
        int[][] a = nhap();
        xuat(a);
        System.out.println("Tổng các phần tử: " + tinhTong(a));
        float tb = (float) tinhTong(a) / (a.length * a[0].length);
        System.out.println("Trung bình cộng các phần tử: " + tb);
    }

    public static int[][] nhap() {
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
        int[][] a = new int[n][m];
        System.out.println("Nhâp ma trận:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("  Nhập a[%d][%d]: ", i, j);
                a[i][j] = new Scanner(System.in).nextInt();
            }
        }
        return a;
    }

    public static void xuat(int[][] a) {
        System.out.println("Ma trận ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print("\t" + a[i][j]);
            }
            System.out.println();
        }
    }

    public static int tinhTong(int[][] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                sum += a[i][j];
            }
        }
        return sum;
    }
}
