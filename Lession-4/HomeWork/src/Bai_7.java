import java.util.Arrays;
import java.util.Scanner;

public class Bai_7 {
    public static void main(String[] args) {
        System.out.print("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập a[%d]: ", i);
            a[i] = new Scanner(System.in).nextInt();
        }
        System.out.println("Mảng a: "+ Arrays.toString(a));
        if (checkDoiXung(a,n)){
            System.out.println("a là mảng đối xứng!");
        }else {
            System.out.println("a không phải mảng đối xứng!");
        }
    }
    public static boolean checkDoiXung (int []a, int n){
        for (int i = 0; i < n/2; i++) {
            if (a[i]!=a[n-i-1]){
                return false;
            }
        }
        return true;
    }
}
