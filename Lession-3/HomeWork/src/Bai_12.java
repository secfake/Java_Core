import java.util.Scanner;

public class Bai_12 {
    public static void main(String[] args) {
        int m = 0;
        int n = 0;
        int k = 0;
        String ketqua = "";
        do {
            System.out.print("Nhập n: ");
            n = new Scanner(System.in).nextInt();
            System.out.print("Nhập m: ");
            m = new Scanner(System.in).nextInt();
            if (m >= n) {
                System.out.println("Vui lòng nhập lại m < n!");
            }
        } while (m >= n);
        for (int i = m; i <= n; i++) {
            if (Math.floor(Math.sqrt(i)) == Math.sqrt(i)) {
                ++k;
                ketqua += i + "  ";
            }
        }
        System.out.printf("Có %d số chính phương trong khoảng [%d,%d]: %s", k, m, n, ketqua);
    }
}
