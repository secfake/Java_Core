import java.util.Scanner;

public class Bai_15 {
    public static void main(String[] args) {
        System.out.print("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.printf("Tổng các số không lớn hơn %d và chia hết cho 7: %d",n,tinhTongChia7(n));
    }
    public static int tinhTongChia7(int n){
        int sum =0;
        for (int i = 0; i <=n; i+=7) {
            sum+=i;
        }
        return sum;
    }
}
