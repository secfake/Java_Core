import java.util.Scanner;

public class Bai_14 {
    public static void main(String[] args) {
        System.out.print("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("S = "+tinhTong(n));
    }

    public static float tinhTong(int n) {
        float sum = 0;
        for (int i = 1; i <= n; i++) {
            sum+=(float) 1/i;
        }
        return sum;
    }
}
