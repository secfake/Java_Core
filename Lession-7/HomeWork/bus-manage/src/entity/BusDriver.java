package entity;

import constant.TypeBus;

import java.util.Scanner;

public class BusDriver extends Persion {
    private static int AUTO_ID = 10000;
    private int id;
    private String type;

    public BusDriver() {
        this.id = AUTO_ID;
        AUTO_ID++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "BusDriver{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public void inputInfor() {
        super.inputInfor();
        this.inputTypeBus();
    }

    public void inputTypeBus() {
        System.out.println("Nhập trình độ:");
        System.out.println("1. A");
        System.out.println("2. B");
        System.out.println("3. C");
        System.out.println("4. D");
        System.out.println("5. F");
        System.out.print("Chọn: ");
        int ch = 0;
        do {
            ch = new Scanner(System.in).nextInt();
            if (ch > 0 && ch < 6) {
                break;
            }
            System.out.print("Mời chọn lại: ");
        } while (true);

        switch (ch) {
            case 1:
                this.type = TypeBus.A.value;
                break;
            case 2:
                this.type = TypeBus.B.value;
                break;
            case 3:
                this.type = TypeBus.C.value;
                break;
            case 4:
                this.type = TypeBus.D.value;
                break;
            case 5:
                this.type = TypeBus.F.value;
                break;

        }


    }
}
