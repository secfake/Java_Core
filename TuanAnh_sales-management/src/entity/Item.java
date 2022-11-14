package entity;

import constant.TypeItem;

import java.util.Scanner;

public class Item implements inputTable {
    private int id;
    private String name;
    private String type;
    private float price;
    private int quantity;
    private static int AUTO_ID = 1000;

    public Item() {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public void inputInfo() {
        System.out.print("Nhập tên hàng: ");
        this.name = new Scanner(System.in).nextLine();
        inputTypeItem();
        System.out.print("Nhập giá bán: ");
        this.price = new Scanner(System.in).nextFloat();
        System.out.print("Nhập số lương: ");
        this.quantity = new Scanner(System.in).nextInt();
    }

    public void inputTypeItem() {
        System.out.println("Nhập nhóm hàng:");
        System.out.println("1. Điện tử");
        System.out.println("2. Điện lạnh");
        System.out.println("3. Máy tính");
        System.out.println("4. Thiết bị văn phòng");
        System.out.print("==> Chọn: ");
        int ch = 0;
        do {
            ch = new Scanner(System.in).nextInt();
            if (ch > 0 && ch < 5) {
                break;
            }
            System.out.print("Tùy chọn không hơp lệ, mời chọn lại: ");
        } while (true);

        switch (ch) {
            case 1:
                this.type = TypeItem.DT.value;
                break;
            case 2:
                this.type = TypeItem.DL.value;
                break;
            case 3:
                this.type = TypeItem.PC.value;
                break;
            case 4:
                this.type = TypeItem.VP.value;
                break;
        }


    }
}
