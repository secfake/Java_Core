import sun.applet.Main;

import java.util.Scanner;

public class LogicHandle {
    public static void showProduct() {
        if (MainRun.products.size() == 0) {
            System.out.println("Chưa có dữ liệu!");
            return;
        }
        for (Product temp : MainRun.products) {
            System.out.println(temp.toString());
        }
    }

    public static void findByName() {
        boolean count = true;
        System.out.print("Nhập tên sản phẩm muốn tìm: ");
        String name = new Scanner(System.in).nextLine();
        for (Product temp : MainRun.products) {
            if (temp.getName().equalsIgnoreCase(name)) {
                System.out.println(temp);
                count = false;
            }
        }
        if (count) {
            System.out.println("Không tìm thấy!");
        }
    }

    public static void deleteById() {
        System.out.print("Nhập Id sản phẩm muốn xóa: ");
        int id = new Scanner(System.in).nextInt();
        for (Product temp : MainRun.products) {
            if (temp.getId() == id) {
                MainRun.products.remove(temp);
                return;
            }
        }
        System.out.println("Không tìm thấy!");
    }

    public static void updateQuantityById() {
        System.out.print("Nhập Id sản phẩm cập nhật số lượng sản phẩm: ");
        int id = new Scanner(System.in).nextInt();
        for (int i = 0; i < MainRun.products.size(); i++) {
            if (MainRun.products.get(i).getId() == id) {
                System.out.print("Cập nhật số lượng: ");
                MainRun.products.get(i).setQuantity(new Scanner(System.in).nextInt());
                return;
            }
        }
        System.out.println("Không tìm thấy!");
    }

    public static void findByQuantityUnder5() {
        int count = 0;
        for (Product temp : MainRun.products) {
            if (temp.getQuantity() < 5) {
                System.out.println(temp);
                count += 1;
            }
        }
        if (count == 0) {
            System.out.println("Không tìm thấy!");
        }
    }

    public static void findByPrice(int ch) {
        int count = 0;
        for (Product temp : MainRun.products) {
            if (temp.getPrice() < 50000 & ch == 1) {
                System.out.println(temp);
                count++;
            }
            if (temp.getPrice() >= 50000 && temp.getPrice() <= 100000 & ch == 2) {
                System.out.println(temp);
                count++;
            }
            if (temp.getPrice() > 100000 & ch == 3) {
                System.out.println(temp);
                count++;
            }

        }
        if (count == 0) {
            System.out.println("Không tìm thấy!");
        }
    }

    public static void addProduct() {
        int num;
        System.out.print("Nhập số sản phẩm muốn thêm: ");
        do {
            num = new Scanner(System.in).nextInt();
            if (num > 0) {
                break;
            }
            System.out.print("Không hợp lệ, nhập lại: ");
        } while (true);
        for (int i = 0; i < num; i++) {
            System.out.println("Thông tin sản phảm thứ "+(i+1));
            Product product = new Product();
            product.inputInfo();
            MainRun.products.add(product);
        }
    }
}
