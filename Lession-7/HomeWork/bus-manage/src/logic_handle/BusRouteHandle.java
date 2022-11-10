package logic_handle;

import Main.MainRun;
import entity.BusDriver;
import entity.BusRoute;

import java.util.Scanner;

public class BusRouteHandle {
    public static void inputNewRoute() {
        System.out.print("Xin mời nhập số tuyến xe mới muốn thêm: ");
        int routeNum = new Scanner(System.in).nextInt();
        for (int i = 0; i < routeNum; i++) {
            System.out.println("Nhập thông tin tuyến xe thứ " + (i + 1));
            BusRoute busRoute = new BusRoute();
            busRoute.inputInfor();
            saveRouteInfo(busRoute);
        }
    }

    public static void saveRouteInfo(BusRoute busRoute) {
        for (int i = 0; i < MainRun.busRoutes.length; i++) {
            if (MainRun.busRoutes[i] == null) {
                MainRun.busRoutes[i] = busRoute;
                return;
            }
        }
    }

    public static void showRoute() {
        for (int i = 0; i < MainRun.busRoutes.length; i++) {
            if (MainRun.busRoutes[i] == null) {

                continue;
            }
            System.out.println(MainRun.busRoutes[i]);
        }
    }
    public static boolean isEmptyRoute() {
        for (int i = 0; i < MainRun.busRoutes.length; i++) {
            if (MainRun.busRoutes[i] != null) {
                return false;
            }
        }
        return true;
    }
}
