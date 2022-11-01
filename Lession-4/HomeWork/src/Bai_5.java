import java.util.Arrays;
import java.util.Scanner;

public class Bai_5 {
    public static void main(String[] args) {
        int[] a = nhap();
        soLonThu2(a);
    }

    public static int[] nhap() {
        System.out.print("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        while (n <= 0) {
            System.out.print("Nhập lại n > 0: ");
            n = new Scanner(System.in).nextInt();
        }
        int[] a = new int[n];
        System.out.println("Nhập mảng:");
        for (int i = 0; i < n; i++) {
            System.out.printf("\tNhập a[%d]: ", i);
            a[i] = new Scanner(System.in).nextInt();
        }
        return a;
    }

    public static void soLonThu2(int[] a) {
        int n = a.length;
        int max_1 = a[0];
        int max_2 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max_1 = Math.max(a[i], max_1);
        }
        for (int i = 0; i < n; i++) {
            if (a[i] != max_1) {
                max_2 = Math.max(max_2, a[i]);
            }
        }
        System.out.println("Dãy số nguyên: " + Arrays.toString(a));
        if (max_1 != max_2 && max_2 != Integer.MIN_VALUE) {
            System.out.println("Số lớn thứ 2: " + max_2);
            System.out.print("Vị trí: ");
            for (int i = 0; i < n; i++) {
                if (a[i] == max_2) {
                    System.out.print((i + 1) + " ");
                }
            }
        } else {
            System.out.println("Không có số lớn thứ 2!");
        }

    }
}
