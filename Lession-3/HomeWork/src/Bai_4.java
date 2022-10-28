import java.util.Scanner;

public class Bai_4 {
    public static void main(String[] args) {
        int m = 2;
        String ketqua = "";
        System.out.print("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.printf("Dãy %d số nguyên tố đầu tiền là: ", n);
        while (n > 0) {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(m); i++) {
                if (m % i == 0)
                    check = false;
            }
            if (check) {
                n -= 1;
                ketqua += m + " ";
            }
            m += 1;
        }
        System.out.println(ketqua);
    }
}
