package main;

import entity.Item;
import entity.Saler;
import entity.SalerManagement;
import logic_handle.ItemLogic;
import logic_handle.SalerLogic;
import logic_handle.Sales_logic;

import java.util.Scanner;

public class MainRun {
    public static Saler[] salers = new Saler[1000];
    public static Item[] items = new Item[1000];
    public static SalerManagement[] salerManagements = new SalerManagement[1000];
    public static int COUNT_SALER = 0;
    public static int COUNT_ITEM = 0;

    public static void main(String[] args) {
        menu();

    }

    private static void showMenu() {
        System.out.println("------- Phần mềm quản lý phân công lái xe buýt -------");
        System.out.println("1. Nhập danh sách mặt hàng mới.");
        System.out.println("2. In ra danh sách mặt hàng.");
        System.out.println("3. Nhập danh sách nhân viên mới.");
        System.out.println("4. In ra danh sách nhân viên.");
        System.out.println("5. Nhập danh sách bán hàng cho nhân viên");
        System.out.println("6. In danh sách bán hàng.");
        System.out.println("7. Sắp xếp danh sách bán hàng.");
        System.out.println("8. Lập bảng kê doanh thu cho nhân viên.");
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
                    ItemLogic.inputNewItem();
                    break;
                case 2:
                    ItemLogic.showItem();
                    break;
                case 3:
                    SalerLogic.inputNewSaler();
                    break;
                case 4:
                    SalerLogic.showSaler();
                    break;
                case 5:
                    Sales_logic.inputSalerManagement();
                    break;
                case 6:
                    Sales_logic.showSalerManagement();
                    break;
                case 7:
                    sortMenu();
                    break;
                case 8:
                    Sales_logic.Salary();
                    break;
                case 9:
                    isExit = true;
            }
        } while (!isExit);
    }

    public static void sortMenu() {
        System.out.println("-----Sắp xếp danh sách phân công-----");
        System.out.println("1. Sếp xếp theo họ tên");
        System.out.println("2. Sắp xếp theo nhóm hàng");
        System.out.println("3. Thoát");
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
                Sales_logic.sortName();
                break;
            case 2:
                Sales_logic.sortTypeItem();
                break;
            case 3:
                return;
        }
    }
}
