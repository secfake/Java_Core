import java.util.Scanner;

public class Bai_16 {
    public static void main(String[] args) {
        System.out.print("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Số chắn nhỏ hơn n: " + soChan(n));
        System.out.println("Số lẻ nhỏ hơn n: " + soLe(n));
    }

    public static String soChan(int n) {
        String s = "";
        if (n < 1) {
            return "Không có số nhỏ hơn!";
        }
        for (int i = 0; i < n; i += 2) {
            s += i + " ";
        }
        return s;
    }

    public static String soLe(int n) {
        String s = "";
        if (n < 2) {
            return "Không có số nhỏ hơn!";
        }
        for (int i = 1; i < n; i += 2) {
            s += i + " ";
        }
        return s;
    }
}
