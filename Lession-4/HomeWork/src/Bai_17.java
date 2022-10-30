import java.util.Scanner;

public class Bai_17 {
    public static void main(String[] args) {
        System.out.print("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.print("Nhập m: ");
        int m = new Scanner(System.in).nextInt();
        if (check(n, m)) {
            System.out.printf("%d và %d số nguyên tố cùng nhau!", n, m);
        } else {
            System.out.printf("%d và %d không nguyên tố cùng nhau!", n, m);
        }
    }

    public static boolean check(int n, int m) {
        int ucln;
        if (n == 0 || m == 0) {
            return false;
        }
        while (true) {
            int r = n % m;
            if (r == 0) {
                ucln = m;
                break;
            } else {
                n = m;
                m = r;
            }
        }
        if (ucln == 1) {
            return true;
        }
        return false;
    }
}
