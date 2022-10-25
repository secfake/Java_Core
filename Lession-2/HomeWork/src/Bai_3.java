import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args) {
        float width, height;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài hình chữ nhật: ");
        width = sc.nextFloat();
        System.out.print("Nhập chiều dài hình chữ nhật: ");
        height = sc.nextFloat();
        System.out.printf("Chu vi hình chữ nhật có cạnh %.2f và %.2f là: %.2f\n",width,height,(width+height)*2);
        System.out.printf("Diện tích hình chữ nhật có cạnh %.2f và %.2f là: %.2f",width,height,(width*height));
    }
}
