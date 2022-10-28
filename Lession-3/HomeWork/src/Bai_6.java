import java.util.Scanner;

public class Bai_6 {
    public static void main(String[] args) {
        System.out.print("Nhập số: ");
        int n = new Scanner(System.in).nextInt();
        int sum = 0;
        String s = "Số " + n + " có tổng các chữ số là: ";
        String s1 = "";
        while (n > 0) {
            int m = n % 10;
            sum += m;
            s1 = m + s1;
            n -= m % 10;
            n /= 10;
            if (n > 0) {
                s1 = " + " + s1;
            }
        }
        System.out.println(s + s1 + " = " + sum);
    }
}
