package entity;

import java.util.Scanner;

public class Student extends Person{
    private static int AUTO_ID=10000;
    private int id;
    private String lop;

    public Student() {
        this.id = AUTO_ID;
        AUTO_ID++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }


    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.print("Nhập lớp: ");
        this.lop = new Scanner(System.in).nextLine();
    }
    public void inThongTin(){
        System.out.printf("%-8d\t%-24s\t%-8s\t%-24s\t%-10s\n",this.id,this.name,this.lop,this.address,this.phone);
    }
}
