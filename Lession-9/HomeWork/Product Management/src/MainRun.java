import java.util.ArrayList;
import java.util.Scanner;

public class MainRun {
    public static ArrayList<Product> products = new ArrayList<>();

    public static void main(String[] args) {
        menuMain();
    }

    public static void showMenu() {
        System.out.println("------- Quản lý sản phẩm -------");
        System.out.println("0. Nhập danh sách sản phẩm");
        System.out.println("1. Xem danh sách sản phẩm");
        System.out.println("2. Tìm sản phẩm theo tên");
        System.out.println("3. Tìm sản phẩm theo id");
        System.out.println("4. Tìm sản phẩm theo số lượng < 5");
        System.out.println("5. Tìm sản phẩm theo mức giá");
        System.out.println("6. Thoát chương trình");
        System.out.print("Mời chọn: ");
    }

    public static int selectFunsion(int min, int max) {
        int ch;
        do {
            ch = new Scanner(System.in).nextInt();
            if (ch >= min && ch <= max) {
                break;
            }
            System.out.print("Không hợp lệ, chọn lại: ");
        } while (true);
        return ch;
    }

    public static void menuMain() {
        while (true) {
            showMenu();
            int ch = selectFunsion(0, 6);
            switch (ch) {
                case 0:
                    LogicHandle.addProduct();
                    break;
                case 1:
                    LogicHandle.showProduct();
                    break;
                case 2:
                    LogicHandle.findByName();
                    break;
                case 3:
                    menuFunsion3();
                    break;
                case 4:
                    LogicHandle.findByQuantityUnder5();
                    break;
                case 5:
                    menuFunsion5();
                    break;
                case 6:
                    return;
            }
        }
    }

    private static void menuFunsion5() {
        while (true){
            System.out.println("Tìm sản phẩm theo giá:");
            System.out.println("1. Dưới 50.000");
            System.out.println("2. Từ 50.000 đến dưới 100.000");
            System.out.println("3. Từ 100.000 trở lên");
            System.out.println("4. Thoát");
            System.out.print("Mời chọn: ");
            int ch = selectFunsion(1, 4);
            if (ch == 4) {
                return;
            }
            LogicHandle.findByPrice(ch);
        }
    }

    private static void menuFunsion3() {
        while (true){
            System.out.println("Tìm sản phẩm theo id:");
            System.out.println("1. Xóa sản phẩm");
            System.out.println("2. Cập nhập số lượng sản phẩm");
            System.out.println("3. Thoát");
            System.out.print("Mời chọn: ");
            int ch = selectFunsion(1, 3);
            switch (ch) {
                case 1:
                    LogicHandle.deleteById();
                    break;
                case 2:
                    LogicHandle.updateQuantityById();
                    break;
                case 3:
                    return;
            }
        }
    }
}
