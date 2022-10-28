import java.util.Arrays;
import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        n = sc.nextInt();
        int[] a = new int[n];
        for (int i =0; i < n; i++){
            System.out.printf("Nhập a[%d]: ",i);
            a[i]= sc.nextInt();
        }
        for (int i = 0; i < n-1; i++){
            for (int j =0; j < n-i-1; j++){
                if (a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Dãy số nguyên: "+Arrays.toString(a));
    }
}
