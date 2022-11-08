package entity;

import java.util.Scanner;
import constant.ReaderTypeConstant;

public class Reader extends Person {

    private static int AUTO_ID = 10000;
    private int id;
    private String type;

    public Reader() {
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
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.println("Nhập loại bạn đọc: ");
        System.out.println("Vui lòng chọn 1 trong các loại dưới đây: ");
        System.out.println("1. Sinh viên.");
        System.out.println("2. Học viên cao học.");
        System.out.println("3. Giảng viên.");
        int readerTypeTemp;
        do {
            readerTypeTemp = new Scanner(System.in).nextInt();
            if (readerTypeTemp >= 1 && readerTypeTemp <= 8) {
                break;
            }
            System.out.print("Loại bạn đọc không hợp lệ, vui lòng nhập lại: ");
        } while (true);
        switch (readerTypeTemp) {
            case 1:
                this.type = ReaderTypeConstant.STUDENT;
                break;
            case 2:
                this.type = ReaderTypeConstant.POST_UNIVERSITY;
                break;
            case 3:
                this.type = ReaderTypeConstant.TEACHER;
                break;
        }
    }
    public void inThongTin(){
        System.out.printf("%-10d\t\t%-20s\t%-20s\t%-24s\t%-10s\n",this.id,this.name,this.type,this.address,this.phone);
    }
}
