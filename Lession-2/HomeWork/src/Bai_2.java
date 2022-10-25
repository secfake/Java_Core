import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập hệ số a khác 0: ");
        a = sc.nextInt();
        System.out.print("Nhập hệ số b: ");
        b = sc.nextInt();
        System.out.print("Nhập hệ số c: ");
        c = sc.nextInt();
        float delta = b*b -4*a*c;
        System.out.println("\ndelta = "+delta);
        String ketqua = delta < 0 ? "vô nghiệm" : delta == 0 ? "có nghiệm kép "+(float)-b/(2*a) : "có 2 nghiệm phân biệt "
                +(float)(-b-Math.sqrt(delta))/(2*a)+" và "+(float)(-b+Math.sqrt(delta))/(2*a);
        System.out.println("Phương trình "+ketqua);
    }
}
