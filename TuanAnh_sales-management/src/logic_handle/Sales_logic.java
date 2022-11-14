package logic_handle;

import entity.Item;
import entity.ItemManagenment;
import entity.Saler;
import entity.SalerManagement;
import main.MainRun;

import java.util.Scanner;

public class Sales_logic {

    public static void inputSalerManagement() {
        if (MainRun.COUNT_ITEM == 0 || MainRun.COUNT_SALER == 0) {
            System.out.println("Không có dữ liệu! Mời nhập danh sách nhân viên và mặt hàng!");
            return;
        }
        int salerNum = count_Sales();
        Saler saler;
        ItemManagenment[] itemManagenments;
        int count = 1;
        for (int i = 0; i < MainRun.salerManagements.length; i++) {
            if (count > salerNum) {
                break;
            }
            if (MainRun.salerManagements[i] != null) {
                continue;
            }
            System.out.println("Nhập nhiên viên bán hàng thứ " + (count));
            do {
                saler = findSaler();
                if (checkSaler(saler)) {
                    break;
                }
            } while (true);

            itemManagenments = addItemAray();
            SalerManagement salerManagement = new SalerManagement(saler, itemManagenments);
            MainRun.salerManagements[i] = salerManagement;
            count++;
        }
    }

    private static ItemManagenment[] addItemAray() {
        System.out.print("Nhập số mặt hàng: ");
        int itemNum;
        do {
            itemNum = new Scanner(System.in).nextInt();
            if (itemNum > 0 && itemNum <= 5) {
                if (itemNum <= MainRun.COUNT_ITEM) {
                    break;
                }
                System.out.println("Nhập số mặt không lớn hơn mặt hàng hiện có");
            } else {
                System.out.println("Số mặt hàng lớn hơn 0 và không lớn hơn 5 mặt hàng hiên có");
            }
        } while (true);

        ItemManagenment[] itemManagenments = new ItemManagenment[itemNum];

        for (int i = 0; i < itemManagenments.length; i++) {
            do {

                int temp = 0;
                Item item = findItem();
                System.out.print("Nhâp số lượng đã bán: ");
                int quantity = new Scanner(System.in).nextInt();
                ItemManagenment itemManagenment = new ItemManagenment(item, quantity);
                for (int j = 0; j <= i; j++) {
                    if (itemManagenments[j].getItem().getId() == itemManagenment.getItem().getId()) {
                        System.out.println("Mặt hàng đã được chọn, mời chọn mặt hàng khác");
                        break;
                    }
                    temp += 1;
                }
                if (temp > i) {
                    itemManagenments[i] = itemManagenment;
                    break;
                }
            } while (true);

        }

        return itemManagenments;
    }


    private static int inputIdItem() {
        System.out.print("Nhập mã mặt hàng: ");
        int id = 0;
        do {
            id = new Scanner(System.in).nextInt();
            if (id >= 1000 && id <= 9999) {
                break;
            }

            System.out.print("Mã mặt hàng có 4 chữ số, mời nhập lại:");
        } while (true);

        return id;
    }

    private static Item findItem() {

        Item item = null;
        do {
            int idItem = inputIdItem();
            for (int i = 0; i < MainRun.COUNT_ITEM; i++) {
                if (MainRun.items[i].getId() == idItem) {
                    item = MainRun.items[i];
                }
            }
            if (item != null) {
                break;
            }
            System.out.println("Không tìm thấy mặt hàng, mời nhập lại!");
        } while (true);
        return item;
    }

    public static int countSalerManagements() {
        int count = 0;
        for (int i = 0; i < MainRun.salerManagements.length; i++) {
            if (MainRun.salerManagements[i] == null) {
                break;
            }
            count += 1;
        }
        return count;
    }

    private static boolean checkSaler(Saler saler) {
        for (int i = 0; i < countSalerManagements(); i++) {
            if (MainRun.salerManagements[i].getSaler().getId() == saler.getId()) {
                System.out.println("Nhân viên đã được lập danh sách, mời nhập nhân viên khác!");
                return false;
            }
        }
        return true;
    }

    private static Saler findSaler() {
        Saler saler = null;
        do {
            int idSaler = inputIdSaler();
            for (int i = 0; i < MainRun.COUNT_SALER; i++) {
                if (MainRun.salers[i].getId() == idSaler) {
                    saler = MainRun.salers[i];
                }
            }
            if (saler != null) {
                break;
            }
            System.out.println("Không tìm thấy nhân viên, mời nhập lại!");
        } while (true);
        return saler;
    }

    private static int inputIdSaler() {
        System.out.print("Nhập mã nhân viên: ");
        int id = 0;
        do {
            id = new Scanner(System.in).nextInt();
            if (id >= 1000 && id <= 9999) {
                break;
            }
            System.out.print("Mã nhân viên có 4 chữ số, mời nhập lại:");

        } while (true);
        return id;
    }

    public static int count_Sales() {
        System.out.print("Tạo danh sách bán hàng cho số nhân viên: ");
        int salerNum;
        do {
            salerNum = new Scanner(System.in).nextInt();
            if (salerNum > 0 && salerNum <= MainRun.COUNT_SALER) {
                break;
            }
            System.out.print("Số nhân viên không lớn hơn tổng số nhân viên hiện có, nhập lại:");
        } while (true);
        return salerNum;
    }

    public static void showSalerManagement() {
        for (int i = 0; i < MainRun.salerManagements.length; i++) {
            if (MainRun.salerManagements[i] != null) {
                System.out.println(MainRun.salerManagements[i]);
            }

        }
    }

    public static void Salary() {
        for (int i = 0; i < countSalerManagements(); i++) {
            ItemManagenment[] itemManagenments = MainRun.salerManagements[i].getItemManagenments();
            float sum = 0;
            for (int j = 0; j < itemManagenments.length; j++) {
                sum += itemManagenments[i].getItem().getPrice() * itemManagenments[i].getQuantity();
            }
            System.out.println(MainRun.salerManagements[i].getSaler().getName() + " có doanh thu: " + sum);
        }
    }

    public static void sortName() {
        for (int i = 0; i < countSalerManagements(); i++) {
            Saler saler1 = MainRun.salerManagements[i].getSaler();
            for (int j = 0; j < countSalerManagements(); j++) {
                Saler saler2 = MainRun.salerManagements[j].getSaler();
                if (saler1.getName().compareTo(saler2.getName()) > 0) {
                    SalerManagement temp = MainRun.salerManagements[i];
                    MainRun.salerManagements[i] = MainRun.salerManagements[j];
                    MainRun.salerManagements[j] = temp;
                }
            }

        }

    }

    public static void sortTypeItem() {
        for (int i = 0; i < countSalerManagements(); i++) {
            ItemManagenment[] itemManagenments = MainRun.salerManagements[i].getItemManagenments();
            for (int j = 0; j < itemManagenments.length; j++) {
                Item item1 = itemManagenments[j].getItem();
                for (int k = 0; k < itemManagenments.length; k++) {
                    Item item2 = itemManagenments[k].getItem();
                    if (item1.getType().compareTo(item2.getType()) > 0) {
                        ItemManagenment temp = itemManagenments[j];
                        itemManagenments[j] = itemManagenments[k];
                        itemManagenments[k] = temp;
                    }
                }
                MainRun.salerManagements[i].setItemManagenments(itemManagenments);
            }

        }

    }
}
