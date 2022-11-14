package logic;

import entity.Reporter;
import main.MainRun;

import java.util.Scanner;

public class ReporterHandle {
    public static void inputNewReporter() {
        System.out.print("Xin mời nhập số phóng viên muốn thêm mới: ");
        int num = new Scanner(System.in).nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Nhập thông tin phóng viên thứ " + (i + 1));
            Reporter reporter = new Reporter();
            reporter.inputInfo();
            saveReporter(reporter);
        }
    }

    public static void saveReporter(Reporter reporter) {
        for (int i = 0; i < MainRun.reporters.length; i++) {
            if (MainRun.reporters[i] == null) {
                MainRun.reporters[i] = reporter;
                return;
            }
        }
    }

    public static void showReporter() {
        for (int i = 0; i < MainRun.reporters.length; i++) {
            if (MainRun.reporters[i] == null) {

                continue;
            }
            System.out.println(MainRun.reporters[i]);
        }
    }

//    public static int isEmptyReport() {
//        int count = 0;
//        for (int i = 0; i < MainRun.reporters.length; i++) {
//            if (MainRun.reporters[i] == null) {
//                break;
//            }
//            count += 1;
//        }
//        return count;
//    }
}
