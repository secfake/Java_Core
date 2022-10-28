import java.util.Scanner;

public class Bai_7 {
    public static void main(String[] args) {
        System.out.print("Nhập số n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.print("Nhập số m: ");
        int m = new Scanner(System.in).nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
