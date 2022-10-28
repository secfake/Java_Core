import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Bai_15 {
    public static void main(String[] args) {
        int ucln;
        System.out.print("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.print("Nhập m: ");
        int m = new Scanner(System.in).nextInt();
        if (n == 0 || m == 0) {
            System.out.println("Hai số không phải nguyên tố cùng nhau!");
            return;
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
            System.out.println("Hai số nguyên tố cùng nhau!");
        } else {
            System.out.println("Hai số không phải nguyên tố cùng nhau!");
        }
    }
}
