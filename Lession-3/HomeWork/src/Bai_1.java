import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        int a, b, c, d, max;
        System.out.print("Nhập số a: ");
        a = new Scanner(System.in).nextInt();
        System.out.print("Nhập số b: ");
        b = new Scanner(System.in).nextInt();
        System.out.print("Nhập số c: ");
        c = new Scanner(System.in).nextInt();
        System.out.print("Nhập số d: ");
        d = new Scanner(System.in).nextInt();
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (max < c)
            max = c;
        if (max < d)
            max = d;
        System.out.printf("\nSố lớn nhất trong 4 số %d, %d, %d, %d là %d", a, b, c, d, max);

    }
}
