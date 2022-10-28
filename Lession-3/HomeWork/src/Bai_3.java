import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args) {
        int ucln = 1, bcnt;
        System.out.print("Nhập số a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Nhập số b: ");
        int b = new Scanner(System.in).nextInt();
        while (true) {
            int r = a % b;
            if (r == 0) {
                ucln = b;
                break;
            } else {
                a = b;
                b = r;
            }
        }
        bcnt = a * b / ucln;
        System.out.println("Ước chung lớn nhất: " + ucln);
        System.out.println("Bội chung nhỏ nhất: " + bcnt);
    }
}

