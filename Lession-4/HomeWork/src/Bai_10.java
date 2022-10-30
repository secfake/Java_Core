import java.util.Arrays;
import java.util.Scanner;

public class Bai_10 {
    public static void main(String[] args) {
        int[] a = nhap();
        System.out.println("Dãy số: "+Arrays.toString(a));
    }

    public static int[] nhap() {
        System.out.print("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập a[%d]: ", i);
            a[i] = new Scanner(System.in).nextInt();
            while (checkLapLai(a,i,a[i])){
                System.out.printf("===Nhập lại a[%d]: ", i);
                a[i] = new Scanner(System.in).nextInt();
            }
        }
        return a;
    }

    public static boolean checkLapLai(int[] a, int j, int k ) {
        for (int i = 0; i < j; i++) {
           if (a[i]==k){
               return true;
           }
        }
        return false;
    }
}
