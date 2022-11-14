package logic_handle;

import entity.Saler;
import main.MainRun;

import java.util.Scanner;

public class SalerLogic {
    public static void inputNewSaler() {
        System.out.print("Nhập số nhân viên muốn thêm mới: ");
        int salerNum = new Scanner(System.in).nextInt();
        for (int i = 0; i < salerNum; i++) {
            System.out.println("Nhập thông tin nhân viên thứ " + (i + 1));
            Saler Saler = new Saler();
            Saler.inputInfo();
            saveSaler(Saler);
        }
        MainRun.COUNT_SALER += salerNum;
    }

    public static void saveSaler(Saler Saler) {
        for (int i = 0; i < MainRun.salers.length; i++) {
            if (MainRun.salers[i] == null) {
                MainRun.salers[i] = Saler;
                return;
            }
        }
    }

    public static void showSaler() {
        if (MainRun.COUNT_SALER==0){
            System.out.println("Không có dữ liệu, mời thêm dữ liêu!");
            return;
        }
        for (int i = 0; i < MainRun.COUNT_SALER; i++) {

            System.out.println(MainRun.salers[i]);
        }
    }

}
