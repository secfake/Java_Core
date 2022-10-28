import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        int k = 0;
        System.out.print("Nhập số tự nhiên n: ");
        int n = new Scanner(System.in).nextInt();
        String s1 = "";
        String s2 = "";
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                int j = n / i;
                k += 1;
                s1 += i + " ";
                if (i != j) {
                    s2 = +j + " " + s2;
                    k += 1;
                }
            }
        }
        System.out.printf("Số %d có %d ước số", n, k);
        System.out.printf("\nƯớc số của %d là: %s", n, s1 + s2);
    }
}
