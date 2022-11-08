package entity;

import constant.TypeOfSubject;

import java.util.Scanner;

public class Subject {
    private static int AUTO_ID = 100;
    private int id;
    private String name;
    private String credits;
    private String typeSubject;

    public Subject() {
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

    public String getCredits() {
        return credits;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }

    public String getTypeSubject() {
        return typeSubject;
    }

    public void setTypeSubject(String typeSubject) {
        this.typeSubject = typeSubject;
    }

    public void nhapThongTin() {
        System.out.print("Nhập tên môn học: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.print("Nhập số đơn vị học trình: ");
        this.credits = new Scanner(System.in).nextLine();
        System.out.println("Nhập loại môn: ");
        System.out.println("1. Đại cương");
        System.out.println("2. Cơ sở nghành");
        System.out.println("3. Chuyên ngành");
        System.out.print("Vui lòng chọn: ");
        int ch;
        do {
            ch = new Scanner(System.in).nextInt();
            if (ch >= 1 && ch <= 3) {
                break;
            }
            System.out.print("Chọn lại: ");
        } while (true);
        switch (ch) {
            case 1:
                this.typeSubject = TypeOfSubject.GENERAL_SUBJECT;
                break;
            case 2:
                this.typeSubject = TypeOfSubject.BASIC_SUBJECT;
                break;
            case 3:
                this.typeSubject = TypeOfSubject.SPECIALIZED_SUBJECT;
                break;
        }
    }


    public void inThongTin(){
        System.out.printf("%-8d\t%-24s\t%-20s\t%-20s\n",this.id,this.name,this.credits,this.typeSubject);
    }
}
