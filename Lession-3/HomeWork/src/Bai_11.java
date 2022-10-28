import java.util.Scanner;

public class Bai_11 {
    public static void main(String[] args) {
        System.out.print("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        int s, s1, s2;
        s = s1 = s2 =0;
        for (int i = 1; i <= n ; i++) {
            s+=i;
        }
        for (int i = 1; i <= n ; i+=2) {
            s1+=i;
        }
        for (int i = 0; i <= n ; i+=2) {
            s2+=i;
        }
        System.out.println("Tổng các số tự nhiên không lớn hơn "+n+": "+s);
        System.out.println("Tổng các số tự nhiên lẻ không lớn hơn "+n+": "+s1);
        System.out.println("Tổng các số tự nhiên chẵn không lớn hơn "+n+": "+s2);
    }
}
