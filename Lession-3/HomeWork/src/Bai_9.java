import java.util.Scanner;

public class Bai_9 {
    public static void main(String[] args) {
        System.out.print("Nhập số h: ");
        int h = new Scanner(System.in).nextInt();
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h; j++) {
                if (j <= i) {
                    System.out.print("*  ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}