package run;

import entity.Post;
import entity.PostManagement;
import entity.Writer;
import logic_handle.PostLogic;
import logic_handle.PostManagementLogic;
import logic_handle.WriterLogic;

import java.util.Scanner;

public class MainRun {

    public static Writer[] writers = new Writer[100];
    public static Post[] posts = new Post[100];
    public static PostManagement[] postManagements = new PostManagement[100];
    public static int countPost = 0;

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        while (true) {
            showMenu();
            int functionChoice = chooseFunction();
            switch (functionChoice) {
                case 1:
                    WriterLogic.addNewWriter();
                    break;
                case 2:
                    WriterLogic.showWriter();
                    break;
                case 3:
                    PostLogic.addNewPost();
                    break;
                case 4:
                    PostLogic.showPost();
                    break;
                case 5:
                    PostManagementLogic.addNewPostManagement();
                    PostManagementLogic.showPostManagement();
                    break;
                case 6:
                    showSortMenu();
                    break;
                case 7:
                    PostManagementLogic.calculateSalary();
                    break;
                case 8:
                    return;
            }
        }
    }

    private static void showSortMenu() {
        System.out.println("Chọn tiêu chí sắp xếp: ");
        System.out.println("1. Theo họ tên phóng viên");
        System.out.println("2. Theo số lượng bài viết giảm dần");
        System.out.println("3. Thoát ra ngoài menu chính");
        System.out.print("Chọn: ");
        int choose = 0;
        do {
            choose = new Scanner(System.in).nextInt();
            if (choose >= 1 && choose <= 3) {
                break;
            }
            System.out.print("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
        } while (true);
        switch (choose) {
            case 1:
                PostManagementLogic.sortByWriterName();
                break;
            case 2:
                PostManagementLogic.sortByPostNumber();
                break;
            case 3:
                return;
        }
    }

    private static int chooseFunction() {
        System.out.print("Xin mời chọn chức năng: ");
        int choice = 0;
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice >= 1 && choice <= 8) {
                break;
            }
            System.out.print("Chức năng vừa chọn không hợp lệ, vui lòng chọn lại: ");
        } while (true);
        return choice;
    }

    private static void showMenu() {
        System.out.println("----PHẦN MỀM QUẢN LÝ TRẢ NHUẬN BÚT CHO PHÓNG VIÊN-----");
        System.out.println("1. Nhập danh sách phóng viên mới.");
        System.out.println("2. Hiển thị danh sách phóng viên.");
        System.out.println("3. Nhập danh sách bài viết mới.");
        System.out.println("4. Hiển thị danh sách bài viết.");
        System.out.println("5. Lập bảng tính công.");
        System.out.println("6. Sắp xếp bảng tính công.");
        System.out.println("7. Tính lương.");
        System.out.println("8. Thoát.");
    }

}
