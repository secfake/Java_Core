package entity;


import java.util.Scanner;

public class Saler extends Person {
    private static int AUTO_ID = 1000;
    private int id;
    private String date;

    public Saler() {
        this.id = AUTO_ID;
        AUTO_ID++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        System.out.println("Nhập ngày ký hợp đồng: ");
        this.date = new Scanner(System.in).nextLine();
    }

    @Override
    public String toString() {
        return "Saler{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", id=" + id +
                ", date='" + date + '\'' +
                '}';
    }
}
