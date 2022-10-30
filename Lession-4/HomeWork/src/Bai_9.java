import java.util.Arrays;
import java.util.Scanner;

public class Bai_9 {
    public static void main(String[] args) {
        System.out.print("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập a[%d]: ", i);
            a[i] = new Scanner(System.in).nextInt();
        }
        soLanXuatHien(a, b);
        xuatPhanTu(a, b);
    }

    public static int[] soLanXuatHien(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            b[i] = 0;
            for (int j = i; j < a.length; j++) {
                if (a[i] == a[j]) {
                    b[i] += 1;
                }
            }
        }
        return b;
    }

    public static void xuatPhanTu(int[] a, int[] b) {
        String ketqua="";
        System.out.println("Mảng a: " + Arrays.toString(a));
        for (int i = 0; i < b.length; i++) {
            if (b[i] == 1) {
                ketqua+=a[i]+" ";
            }
        }
        System.out.println("Các số khác nhau trong dãy: "+ketqua);
    }
}
