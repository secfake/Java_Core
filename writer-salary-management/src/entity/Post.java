package entity;

import java.util.Scanner;

public class Post implements Inputable {

    private static int AUTO_ID = 99;
    private int id;
    private String name;
    private double price;

    public static int getAutoId() {
        return AUTO_ID;
    }

    public static void setAutoId(int autoId) {
        AUTO_ID = autoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public void inputInfo() {
        AUTO_ID++;
        this.id = AUTO_ID;
        System.out.print("Nhập tên: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.print("Nhập đơn giá: ");
        this.price = new Scanner(System.in).nextDouble();
    }
}
