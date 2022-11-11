package logic_handle;

import Main.MainRun;
import entity.BusDriver;

import java.util.Scanner;

public class BusDriverLHandle {
    public static void inputNewDriver() {
        System.out.print("Xin mời nhập số lái xe mới muốn thêm: ");
        int driverNum = new Scanner(System.in).nextInt();
        for (int i = 0; i < driverNum; i++) {
            System.out.println("Nhập thông tin lái xe thứ " + (i + 1));
            BusDriver busDriver = new BusDriver();
            busDriver.inputInfor();
            saveDriverInfo(busDriver);
        }
    }

    public static void saveDriverInfo(BusDriver busDriver) {
        for (int i = 0; i < MainRun.busDrivers.length; i++) {
            if (MainRun.busDrivers[i] == null) {
                MainRun.busDrivers[i] = busDriver;
                return;
            }
        }
    }

    public static void showDriver() {
        for (int i = 0; i < MainRun.busDrivers.length; i++) {
            if (MainRun.busDrivers[i] == null) {

                continue;
            }
            System.out.println(MainRun.busDrivers[i]);
        }
    }

    public static int isEmptyDriver() {
        int count = 0;
        for (int i = 0; i < MainRun.busDrivers.length; i++) {
            if (MainRun.busDrivers[i] == null) {
                break;
            }
            count += 1;
        }
        return count;
    }
}
