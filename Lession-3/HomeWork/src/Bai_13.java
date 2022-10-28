import java.util.Scanner;

public class Bai_13 {
    public static void main(String[] args) {
        System.out.print("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        int sum = 0;
        for (int i = 7; i <= n; i+=7) {
            sum+=i;
        }
        System.out.printf("Tổng các số không lớn hơn %d và chia hết cho 7: %d", n ,sum);
    }
}
