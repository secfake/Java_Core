package logic_handle;

import Main.MainRun;
import entity.AssignmentDriver;
import entity.AssignmentRoute;
import entity.BusDriver;
import entity.BusRoute;
import sun.applet.Main;

import java.util.Scanner;

public class AssignmentHandle {
    // phân công lái xe
    public static void inputAssignment() {
        System.out.print("Nhập số lái xe cần phân công: ");
        int driverNum = new Scanner(System.in).nextInt();
        BusDriver busDriver;
        AssignmentRoute[] assignmentRoutes;
        int count = 1;
        for (int j = 0; j < MainRun.assignmentDrivers.length; j++) {
            if (count > driverNum) {
                break;
            }
            if (MainRun.assignmentDrivers[j] != null) {
                continue;
            }
            System.out.println("Phân công lái xe thứ " + (count));
            busDriver = searchDriver();
            assignmentRoutes = addAssignmentRoutesArry();
            AssignmentDriver assignmentDriver = new AssignmentDriver(busDriver, assignmentRoutes);
            MainRun.assignmentDrivers[j] = assignmentDriver;
            count++;
        }

    }

    // tạo mảng tuyến đường
    public static AssignmentRoute[] addAssignmentRoutesArry() {
        System.out.print("Nhập số tuyến: ");
        int num;
        int totalTurn = 0;
        do {
            num = new Scanner(System.in).nextInt();
            if (num > 0) {
                break;
            }
            System.out.print("Số tuyến phải lớn hơn 0, nhập lại: ");
        } while (true);
        AssignmentRoute[] assignmentRoutes = new AssignmentRoute[num];
        for (int i = 0; i < num; i++) {
            AssignmentRoute assignmentRoute = addAssignmentRoute();
            totalTurn += assignmentRoute.getNumTurn();
            if (totalTurn > 15) {
                System.out.println("Tổng số lượt đã quá 15!");
                break;
            }
            assignmentRoutes[i] = assignmentRoute;
        }
        return assignmentRoutes;
    }

    public static AssignmentRoute addAssignmentRoute() {
        BusRoute busRoute = searchRoute();
        System.out.print("Nhâp số lượt lái: ");
        int num;
        do {
            num = new Scanner(System.in).nextInt();
            if (num > 0 && num <= 15) {
                break;
            }
            System.out.print("Số lượt không quá 15, nhập lại: ");
        } while (true);
        AssignmentRoute assignmentRoute = new AssignmentRoute(num, busRoute);
        return assignmentRoute;
    }

    /// tìm lái xe
    public static BusDriver searchDriver() {
        BusDriver busDriver = null;
        do {
            int idDriver = inputIdDriver();
            for (int i = 0; i < MainRun.busDrivers.length; i++) {
                if (MainRun.busDrivers[i] != null && MainRun.busDrivers[i].getId() == idDriver) {
                    busDriver = MainRun.busDrivers[i];
                }
            }
            if (busDriver != null) {
                break;
            }
            System.out.println("Không tìm thấy lái xe, mời nhập lại!");
        } while (true);
        return busDriver;
    }


    public static int inputIdDriver() {
        System.out.print("Nhập mã lái xe: ");
        int id = 0;
        do {
            id = new Scanner(System.in).nextInt();
            if (id >= 10000 && id <= 99999) {
                break;
            }
            System.out.println("Mã lái xe có 5 chữ số, mời nhập lại:");
        } while (true);
        return id;
    }

    //Tìm tuyến đường
    public static int inputIdRoute() {
        System.out.print("Nhập mã tuyển: ");
        int id = 0;
        do {
            id = new Scanner(System.in).nextInt();
            if (id >= 100 && id <= 999) {
                break;
            }
            System.out.println("Mã tuyến có 3 chữ số, mời nhập lại:");
        } while (true);
        return id;
    }

    public static BusRoute searchRoute() {
        BusRoute busRoute = null;
        do {
            int idRoute = inputIdRoute();
            for (int i = 0; i < MainRun.busRoutes.length; i++) {
                if (MainRun.busRoutes[i] != null && MainRun.busRoutes[i].getId() == idRoute) {
                    busRoute = MainRun.busRoutes[i];
                }
            }
            if (busRoute != null) {
                break;
            }
            System.out.println("Không tìm thấy tuyến xe, mời nhập lại!");
        } while (true);
        return busRoute;
    }

    // in danh sách phân công
    public static void showAssignment() {
        for (int i = 0; i < MainRun.assignmentDrivers.length; i++) {
            if (MainRun.assignmentDrivers[i] == null) {

                continue;
            }
            System.out.println(MainRun.assignmentDrivers[i]);
        }
    }

    // sắp xếp
    public static void sort() {
        int count = 0;
        for (int i = 0; i < MainRun.assignmentDrivers.length; i++) {
            if (MainRun.assignmentDrivers[i] == null) {
                break;
            }
            count += 1;
        }
        System.out.println("-----Sắp xếp danh sách phân công-----");
        System.out.println("1. Sếp xếp theo tên");
        System.out.println("2. Sắp xếp số tuyến");
        System.out.print("Chọn: ");
        int ch;
        do {
            ch = new Scanner(System.in).nextInt();
            if (ch > 0 && ch < 3) {
                break;
            }
            System.out.print("Tùy chọn không hợp lệ, chọn lại: ");
        } while (true);
        switch (ch) {
            case 1:
                sortName(count);
                break;
            case 2:
                sortNumRoute(count);
                break;
        }
    }

    private static void sortNumRoute(int count) {
        for (int i = 0; i < count; i++) {
            int sum = 0;
            AssignmentRoute[] assignmentRoutes = MainRun.assignmentDrivers[i].getAssignmentRoutes();
            for (int j = 0; j < assignmentRoutes.length; j++) {
                if (assignmentRoutes[j] != null) {
                    sum += 1;
                }
                MainRun.assignmentDrivers[i].setTotalRoute(sum);
            }
        }

        AssignmentDriver temp;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (MainRun.assignmentDrivers[i].getTotalRoute() > MainRun.assignmentDrivers[j].getTotalRoute()) {
                    temp = MainRun.assignmentDrivers[j];
                    MainRun.assignmentDrivers[j] = MainRun.assignmentDrivers[i];
                    MainRun.assignmentDrivers[i] = temp;
                }
            }

        }

    }

    public static void sortName(int count) {
        AssignmentDriver temp;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (i == j) {
                    continue;
                }

                if (compareName(MainRun.assignmentDrivers[i].getBusDriver(), MainRun.assignmentDrivers[j].getBusDriver())) {
                    temp = MainRun.assignmentDrivers[j];
                    MainRun.assignmentDrivers[j] = MainRun.assignmentDrivers[i];
                    MainRun.assignmentDrivers[i] = temp;
                }
            }

        }
    }

    public static boolean compareName(BusDriver driver1, BusDriver driver2) {
        String[] a = driver1.getName().split(" ");
        String[] b = driver2.getName().split(" ");
        int n = Math.min(a.length, b.length);
        int i = 1;
        while (i <= n) {
            int temp = a[a.length - i].compareToIgnoreCase(b[b.length - i]);
            if (temp < 0) {
                return true;
            }
            if (temp > 0) {
                break;
            }
            i += 1;
        }
        return false;
    }

// tính tổng khoảng chạy xe chạy
    public static  void distance(){
        for (int i = 0; i < MainRun.assignmentDrivers.length; i++) {
            if (MainRun.assignmentDrivers[i]==null){
                break;
            }
            float sum = 0;
            AssignmentRoute[] assignmentRoutes = MainRun.assignmentDrivers[i].getAssignmentRoutes();
            for (int j = 0; j < assignmentRoutes.length; j++) {
                if (assignmentRoutes[j] != null) {
                    sum += assignmentRoutes[j].getBusRoute().getDistance();
                }
            }
            System.out.println(MainRun.assignmentDrivers[i].getBusDriver()+ "\tKhoảng cách chạy: "+sum);
        }
    }
}
