package Bai_3;

import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        nhap(rectangle);
        in(rectangle);
    }

    public static void nhap(Rectangle rectangle) {
        System.out.println("Tạo hình chữ nhật: ");
        System.out.print("  Chiều dài: ");
        rectangle.setWidth(new Scanner(System.in).nextDouble());
        System.out.print("  Chiều rộng: ");
        rectangle.setHeight(new Scanner(System.in).nextDouble());
        System.out.print("  Màu sắc: ");
        rectangle.setColor(new Scanner(System.in).nextLine());
    }

    public static void in(Rectangle rectangle) {
        System.out.println("======================================");
        System.out.println("Hình chữ nhật: ");
        System.out.println("  Chiều dài: " + rectangle.getWidth());
        System.out.println("  Chiều rộng: " + rectangle.getHeight());
        System.out.println("  Màu sắc: " + rectangle.getColor());
        System.out.println("  Chu vi: " + rectangle.findPerimeter());
        System.out.println("  Diện tích: " + rectangle.findArea());
    }
}
