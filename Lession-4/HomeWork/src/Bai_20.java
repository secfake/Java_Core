import java.util.Arrays;
import java.util.Scanner;

public class Bai_20 {
    public static void main(String[] args) {
        int[] a = nhap();
        System.out.println("Mảng ban đầu: " + Arrays.toString(a));
        sapXepTang(a);
        chenMang(a);
    }

    public static int[] nhap() {
        System.out.print("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        while (n <= 0) {
            System.out.print("Nhập lại n >0: ");
            n = new Scanner(System.in).nextInt();
        }
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập a[%d]: ", i);
            a[i] = new Scanner(System.in).nextInt();
        }
        return a;
    }

    public static void sapXepTang(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("Mảng sắp xếp: " + Arrays.toString(a));
    }

    public static void chenMang(int[] a) {
        System.out.print("Nhập x: ");
        int x = new Scanner(System.in).nextInt();
        int n = a.length;
        int[] b = new int[n+1];
        int vitri =n;
        for (int i = 0; i < n; i++) {
            if (x<=a[i]){
                vitri =i;
                break;
            }
        }
        for (int i = 0; i < vitri; i++) {
            b[i]=a[i];
        }
        b[vitri]=x;
        for (int i = vitri; i <n ; i++) {
            b[i+1]=a[i];
        }
        System.out.println("Mảng chèn x: " + Arrays.toString(b));
    }
}
