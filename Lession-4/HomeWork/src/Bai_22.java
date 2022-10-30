import java.util.Scanner;

public class Bai_22 {
    public static void main(String[] args) {
        int[][] a = nhap();
        xuat(a);
        System.out.println("Gía trị lớn nhất: " + max(a));
        System.out.println("Gía trị nhỏ nhất: " + min(a));
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
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("Nhập a[%d][%d]: ", i, j);
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

    public static int max(int[][] a) {
        int temp = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (temp < a[i][j]) {
                    temp = a[i][j];
                }
            }
        }
        return temp;
    }

    public static int min(int[][] a) {
        int temp = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (temp > a[i][j]) {
                    temp = a[i][j];
                }
            }
        }
        return temp;
    }
}
