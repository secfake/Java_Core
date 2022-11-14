package main;

import entity.Article;
import entity.Reporter;

import java.util.Scanner;

import static logic.ArticleHandle.inputNewArticle;
import static logic.ArticleHandle.showArticle;
import static logic.ReporterHandle.inputNewReporter;
import static logic.ReporterHandle.showReporter;

public class MainRun {
    public static Reporter[] reporters = new Reporter[1000];
    public static Article[] articles = new Article[1000];

    public static void main(String[] args) {
        menu();

    }

    private static void showMenu() {
        System.out.println("------- Phần mềm quản lý nhuận bút cho phóng viên -------");
        System.out.println("1. Nhập danh sách phóng viên mới.");
        System.out.println("2. In ra danh sách phóng viên");
        System.out.println("3. Nhập danh sách kiểu bài viết mới.");
        System.out.println("4. In ra danh sách kiểu bài biết.");
        System.out.println("5. Lập bảng tính công");
        System.out.println("6. In bảng tính công.");
        System.out.println("7. Sắp xếp danh sách bảng tính công.");
        System.out.println("8. Lập bảng kê thu nhập.");
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
                    inputNewReporter();
                    break;
                case 2:
                    showReporter();
                    break;
                case 3:
                    inputNewArticle();
                    break;
                case 4:
                    showArticle();
                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:
                    isExit = true;
            }
        } while (!isExit);
    }


}
