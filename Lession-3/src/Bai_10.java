import java.util.Scanner;

public class Bai_10 {
    public static void main(String[] args) {
        int h;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số h: ");
        h = sc.nextInt();
        for (int i=1; i <= h; i++){
            for (int j=1; j <= (2*h-1); j++)
                if (j>(h-i)&&j<(h+i))
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            System.out.println();
        }
    }
}
