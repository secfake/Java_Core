import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        System.out.print("Nhập chiều dài:");
        double width = new Scanner(System.in).nextDouble();
        System.out.print("Nhập chiều rộng");
        double height = new Scanner(System.in).nextDouble();
        Rectangle rect = new Rectangle(width,height);
        System.out.println("chu vi: "+ rect.rectanglePerimeter());
        System.out.println("chu vi: "+ rect.rectangularArea());

    }
}

