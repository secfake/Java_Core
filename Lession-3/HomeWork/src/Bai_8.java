import java.util.Scanner;

public class Bai_8 {
    public static void main(String[] args) {
        System.out.print("Nhập số n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.print("Nhập số m: ");
        int m = new Scanner(System.in).nextInt();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == m || j == n) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}