package Bai_4;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class Bai_4 {
    public static void main(String[] args) {
        MyPoint[] myPoint = nhap();
        tim2Diem(myPoint);

    }

    public static MyPoint[] nhap() {
        System.out.print("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        MyPoint[] myPoint = new MyPoint[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập tọa độ điểm thứ " + (i + 1));
            System.out.print("  Tọa độ x: ");
            double x = new Scanner(System.in).nextDouble();
            System.out.print("  Tọa độ y: ");
            double y = new Scanner(System.in).nextDouble();
            myPoint[i] = new MyPoint(x, y);
        }
        return myPoint;
    }

    public static String in(MyPoint myPoint) {
        return "[" + myPoint.getX() + ", " + myPoint.getY() + "]";
    }

    public static void tim2Diem(MyPoint[] myPoint) {
        double max = 0;
        for (int i = 0; i < myPoint.length; i++) {
            for (int j = i+1; j < myPoint.length; j++) {
                if (max < myPoint[i].distance(myPoint[j])) {
                    max = myPoint[i].distance(myPoint[j]);
                }
            }
        }
        System.out.println("==========================================================================");
        System.out.print("Hai điểm có khoảng cách lớn nhất: ");
        for (int i = 0; i < myPoint.length; i++) {
            for (int j = i+1; j < myPoint.length; j++) {
                if (max == myPoint[i].distance(myPoint[j])) {
                    System.out.printf("%s và %s \t", in(myPoint[i]), in(myPoint[j]));
                }
            }
        }
        System.out.println("\nKhoảng cách giữa hai điểm: " + max);

    }
}
