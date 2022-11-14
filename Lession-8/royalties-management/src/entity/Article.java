package entity;

import java.util.Scanner;

public class Article implements InputInfo {
    private static int AUTO_ID = 100;
    private int id;
    private String name;
    private float price;

    public Article() {
        this.id = AUTO_ID;
        AUTO_ID++;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public void inputInfo() {
        System.out.print("Nhập tên bài: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.print("Nhập đơn giá: ");
        this.price = new Scanner(System.in).nextFloat();

    }
}
