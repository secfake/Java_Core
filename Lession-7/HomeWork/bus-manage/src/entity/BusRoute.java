package entity;

import java.util.Scanner;

public class BusRoute implements InputTable {
    private static int AUTO_ID = 100;
    private int id;
    private float distance;
    private int numStop;

    public BusRoute() {
        this.id = AUTO_ID;
        AUTO_ID++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public int getNumStop() {
        return numStop;
    }

    public void setNumStop(int numStop) {
        this.numStop = numStop;
    }

    @Override
    public String toString() {
        return "BusRoute{" +
                "id=" + id +
                ", distance=" + distance +
                ", numStop=" + numStop +
                '}';
    }

    @Override
    public void inputInfor() {
        inputDistance();
        inputNumStop();

    }

    public void inputDistance() {
        float ch = -1;
        System.out.print("Nhập khoảng cách: ");
        do {
            ch = new Scanner(System.in).nextFloat();
            if (ch > 0) {
                break;
            }
            System.out.print("Khoảng cách phải lớn hơn 0, mời nhập lại: ");
        } while (true);
        this.distance = ch;
    }

    public void inputNumStop() {
        int ch = -1;
        System.out.print("Nhập số điểm dừng: ");
        do {
            ch = new Scanner(System.in).nextInt();
            if (ch > 0) {
                break;
            }
            System.out.print("Số điểm dừng phải lớn hơn 0, mời nhập lại: ");
        } while (true);
        this.numStop = ch;
    }
}
