package Main;

import entity.AssignmentDriver;
import entity.BusDriver;
import entity.BusRoute;

import java.util.Scanner;

import static logic_handle.AssignmentHandle.*;
import static logic_handle.BusDriverLHandle.inputNewDriver;
import static logic_handle.BusDriverLHandle.showDriver;
import static logic_handle.BusRouteHandle.inputNewRoute;
import static logic_handle.BusRouteHandle.showRoute;

public class MainRun {
    public static BusDriver[] busDrivers = new BusDriver[1000];
    public static BusRoute[] busRoutes = new BusRoute[1000];
    public static AssignmentDriver[] assignmentDrivers = new AssignmentDriver[1000];

    public static void main(String[] args) {
        menu();

    }

    private static void showMenu() {
        System.out.println("------- Phần mềm quản lý phân công lái xe buýt -------");
        System.out.println("1. Nhập danh sách lái xe mới.");
        System.out.println("2. In ra danh sách ái xe.");
        System.out.println("3. Nhập danh sách Tuyến mới.");
        System.out.println("4. In ra danh sách các tuyến.");
        System.out.println("5. Nhập danh sách phân công cho mỗi lái xe");
        System.out.println("6. In danh sách phân công.");
        System.out.println("7. Sắp xếp danh sách phân công.");
        System.out.println("8. Lập bảng kê tổng khoảng cách chạy xe trong ngày của mỗi lái xe.");
        System.out.println("9. Thoát chương trình.");
    }

    private static int functionChoice() {
        showMenu();
        System.out.print("Xin mời chọn chức năng: ");
        int choice = 0;
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice >= 1 && choice <= 9) {
                break;
            }
            System.out.print("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
        } while (true);
        return choice;
    }

    private static void menu() {
        boolean isExit = false;
        do {
            int functionChoice = functionChoice();
            switch (functionChoice) {
                case 1:
                    inputNewDriver();
                    break;
                case 2:
                    showDriver();
                    break;
                case 3:
                    inputNewRoute();
                    break;
                case 4:
                    showRoute();
                    break;
                case 5:
                    inputAssignment();
                    break;
                case 6:
                    showAssignment();
                    break;
                case 7:
                    sort();
                    break;
                case 8:
                    distance();
                    break;
                case 9:
                    isExit = true;
            }
        } while (!isExit);
    }


}
