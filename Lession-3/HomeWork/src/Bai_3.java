import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args) {
        int a, b;
        int uc =1, bc;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        a = sc.nextInt();
        System.out.print("Nhập số b: ");
        b = sc.nextInt();
        for (int i = 1; i<=a && i <=b; i++) {
            if (a%i==0 && b%i==0){
                uc = i;
            }
        }
        bc = a*b/uc;
        System.out.println("Ước chung lớn nhất: "+uc);
        System.out.println("Bội chung nhỏ nhất: "+bc);
    }
}
