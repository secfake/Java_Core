import java.util.Scanner;

public class Bai_7 {
    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        n = sc.nextInt();
        System.out.print("Nhập số m: ");
        m = sc.nextInt();
        for (int i=0; i < m; i++){
            for (int j=0; j < n; j++)
                System.out.print("*\t");
            System.out.println();
        }
    }
}
