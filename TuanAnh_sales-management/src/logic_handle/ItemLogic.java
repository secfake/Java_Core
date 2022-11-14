package logic_handle;

import entity.Item;
import main.MainRun;

import java.util.Scanner;

public class ItemLogic {
    public static void inputNewItem() {
        System.out.print("Nhập số mặt hàng thêm mới: ");
        int itemNum = new Scanner(System.in).nextInt();
        for (int i = 0; i < itemNum; i++) {
            System.out.println("Nhập thông tin mặt hàng thứ " + (i + 1));
            Item item = new Item();
            item.inputInfo();
            saveItem(item);
        }
        MainRun.COUNT_ITEM += itemNum;
    }

    public static void saveItem(Item item) {
        for (int i = 0; i < MainRun.items.length; i++) {
            if (MainRun.items[i] == null) {
                MainRun.items[i] = item;
                return;
            }
        }
    }

    public static void showItem() {
        if (MainRun.COUNT_ITEM==0){
            System.out.println("Không có dữ liệu, mời thêm dữ liêu!");
            return;
        }
        for (int i = 0; i < MainRun.COUNT_ITEM; i++) {
            System.out.println(MainRun.items[i]);
        }
    }

}
