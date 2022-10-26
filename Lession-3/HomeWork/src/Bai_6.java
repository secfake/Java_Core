import java.util.Scanner;

public class Bai_6 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số: ");
        n = sc.nextInt();
        int sum =0;
        String s ="Số "+n+" có tổng các chữ số là: ";
        String s1 ="";
        while (n > 0){
            sum+=n%10;
            s1=n%10+s1;
            n-=n%10;
            n/=10;
            if (n>0){
                s1= " + " + s1;
            }
        }
        System.out.println(s+s1+" = "+sum);
    }
}
