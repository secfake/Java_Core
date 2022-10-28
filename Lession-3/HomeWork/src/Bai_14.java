import java.util.Scanner;

public class Bai_14 {
    public static void main(String[] args) {
        System.out.print("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        String s1 = "Các số lẻ nhỏ hơn: ";
        String s2 = "Các số chắn nhỏ hơn: ";
        if (n == 0) {
            System.out.println("Không có số nào nhỏ hơn!");
            return;
        }
        if (n == 1) {
            System.out.println("Không có số lẻ nào nhỏ hơn!");
            System.out.println("Các số chẵn nhỏ hơn: 0");
            return;
        }
        for (int i = 1; i < n; i += 2) {
            s1 += i + " ";
        }
        for (int i = 0; i < n; i += 2) {
            s2 += i + " ";
        }
        System.out.println(s1);
        System.out.println(s2);
    }
}
