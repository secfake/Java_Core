import java.util.Arrays;
import java.util.Scanner;

public class Bai_19 {
    public static void main(String[] args) {
        int[] a = nhap();
        System.out.println("Mảng : "+ Arrays.toString(a));
        System.out.println("Số lớn nhất: "+max(a));
        System.out.println("Số nhỏ nhất: "+min(a));
    }

    public static int[] nhap() {
        System.out.print("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        while (n <= 0) {
            System.out.print("Nhập lại n >0: ");
            n = new Scanner(System.in).nextInt();
        }
        int[] a = new int[n];
        System.out.println("Nhập mảng:");
        for (int i = 0; i < n; i++) {
            System.out.printf("  Nhập a[%d]: ", i);
            a[i] = new Scanner(System.in).nextInt();
        }
        return a;
    }

    public static int max(int[] a){
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]){
                max = a[i];
            }
        }
        return max;
    }
    public static int min(int[] a){
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min > a[i]){
                min = a[i];
            }
        }
        return min;
    }
}
