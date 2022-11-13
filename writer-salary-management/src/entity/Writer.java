package entity;

import constant.WriterType;

import java.util.Scanner;

public class Writer extends Person {

    private static int AUTO_ID = 9999;
    private int id;
    private WriterType type;

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

    public WriterType getType() {
        return type;
    }

    public void setType(WriterType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Writer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", id=" + id +
                ", type=" + type +
                '}';
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        AUTO_ID++;
        this.id = AUTO_ID;
        System.out.println("Nhập loại phóng viên: ");
        System.out.println("1. Chuyên nghiệp");
        System.out.println("2. Nghiệp dư");
        System.out.println("3. Cộng tác viên");
        System.out.print("Lựa chọn: ");
        int typeTemp = 0;
        do {
            typeTemp = new Scanner(System.in).nextInt();
            if (typeTemp >= 1 && typeTemp <= 3) {
                break;
            }
            System.out.print("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
        } while (true);
        switch (typeTemp) {
            case 1:
                this.type = WriterType.CHUYEN_NGHIEP;
                break;
            case 2:
                this.type = WriterType.NGHIEP_DU;
                break;
            case 3:
                this.type = WriterType.CTV;
                break;
        }
    }
}
