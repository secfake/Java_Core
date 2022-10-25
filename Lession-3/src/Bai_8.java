import java.util.Scanner;

public class Bai_8 {
    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        n = sc.nextInt();
        System.out.print("Nhập số m: ");
        m = sc.nextInt();
        for (int i=1; i <= m; i++){
            for (int j=1; j <= n; j++)
                if (i==1||j==1||i==m||j==n)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            System.out.println();
        }
    }
}
