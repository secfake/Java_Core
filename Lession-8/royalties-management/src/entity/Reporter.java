package entity;

import constant.TypeReporter;

import java.util.Scanner;

public class Reporter extends Persion {
    private static int AUTO_ID = 10000;
    private int id;
    private String typeReporter;

    public Reporter() {
        this.id = AUTO_ID;
        AUTO_ID++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeReporter() {
        return typeReporter;
    }

    public void setTypeReporter(String typeReporter) {
        this.typeReporter = typeReporter;
    }

    @Override
    public String toString() {
        return "Reporter{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", id=" + id +
                ", typeReporter='" + typeReporter + '\'' +
                '}';
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        System.out.println("Nhập loại phóng viên: ");
        System.out.println("1. Chuyên nghiệp");
        System.out.println("2. Nghiệp dư");
        System.out.println("3. Cộng tác viên");
        System.out.print("Mời chọn:");
        int ch;
        do {
            ch = new Scanner(System.in).nextInt();
            if (ch > 0 && ch < 4) {
                break;
            }
            System.out.print("Tùy chọn không hợp lệ, mời nhập lại:");
        } while (true);

        switch (ch) {
            case 1:
                this.typeReporter = TypeReporter.CN.value;
                break;
            case 2:
                this.typeReporter = TypeReporter.ND.value;
                break;
            case 3:
                this.typeReporter = TypeReporter.CTV.value;
                break;
        }
    }
}
