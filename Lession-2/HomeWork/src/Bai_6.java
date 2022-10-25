import java.util.Scanner;

public class Bai_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập bán kính hình tròn:");
        float r = sc.nextFloat();
        System.out.printf("Chu vi hình tròn có bán kính %.2f là: %.2f\n",r,(2*r*Math.PI));
        System.out.printf("Diện tích hình tròn có bán kính %.2f là: %.2f",r,(r*r*Math.PI));
    }
}
