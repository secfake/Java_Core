import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Bai_5 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số: ");
        n = sc.nextInt();
        int check = n;
        int m =0;
        while (check > 0){
            m+=check%10;
            check-=check%10;
            check/=10;
            m*=10;
        }
        m/=10;
        if (m==n){
            System.out.printf("%d là số thuận nghịch!",n);
        }else {
            System.out.printf("%d không phải số thuận nghịch!",n);
        }
    }
}
