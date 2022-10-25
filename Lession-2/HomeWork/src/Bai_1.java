import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        a = sc.nextInt();
        System.out.print("Nhập hệ số b: ");
        b = sc.nextInt();
        String ketqua = a != 0 ? ("có nghiệm x ="+(float)(-b)/a) : (b !=0 ?"vô nghiệm" : "có vô số nghiệm");
        System.out.printf("Phương trình %dx + %d = 0 %s",a,b,ketqua);
    }
}
