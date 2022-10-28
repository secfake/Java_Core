import java.util.Scanner;

public class In_class {
    //ctrl alt L
    public static void main(String[] args) {
        System.out.print("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        float sum =0;
        for (int i = 1; i <=n; i++) {
            sum+=(float)1/i;
        }
        System.out.println("Tổng S = "+sum);
    }
}
