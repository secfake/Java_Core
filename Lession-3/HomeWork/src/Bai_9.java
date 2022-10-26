import java.util.Scanner;

public class Bai_9 {
    public static void main(String[] args) {
        int h;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số h: ");
        h = sc.nextInt();
        for (int i=1; i <= h; i++){
            for (int j=1; j <= h; j++)
                if (j<=i)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            System.out.println();
        }
    }
}