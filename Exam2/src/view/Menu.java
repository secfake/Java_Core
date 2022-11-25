package view;

import Handle.Login;
import Handle.Register;
import Handle.UserHanle;
import entity.Account;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public void mainMenu(Scanner scanner, ArrayList<Account> accounts) {
        System.out.println("================ Xin chào bạn =================");
        System.out.println("1. Đăng nhập");
        System.out.println("2. Đăng ký");
        System.out.print("Mời chọn: ");
        int ch;
        while (true) {
            try {
                ch = Integer.parseInt(scanner.nextLine());
                if (ch < 1 || ch > 2) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.print("Lỗi! Mời chọn lại: ");
            }
        }
        switch (ch) {
            case 1:
                Login login = new Login();
                login.login(scanner, accounts);
                break;
            case 2:
                Register register = new Register();
                register.registerAcc(scanner,accounts);
                break;
        }
    }

    public void viewLogin(Scanner scanner, ArrayList<Account> accounts, Account account) {
        System.out.println("============== Đăng nhập ================");
        System.out.println("1. Đăng nhập lại");
        System.out.println("2. Quên mật khẩu");
        System.out.print("Mời chọn: ");
        int ch;
        while (true) {
            try {
                ch = Integer.parseInt(scanner.nextLine());
                if (ch < 1 || ch > 2) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.print("Lỗi! Mời chọn lại: ");
            }
        }
        Login login = new Login();
        switch (ch) {
            case 1:
                login.login(scanner, accounts);
                break;
            case 2:
                login.resetPassword(scanner, accounts, account);
                break;
        }
    }

    public void viewFunction(Scanner scanner, ArrayList<Account> accounts, Account account) {
       while (true) {
            System.out.println("===================== Chức năng người dùng =============================");
            System.out.println("Chào mừng " + account.getUsername() + ", bạn có thể thực hiện các công việc sau:");
            System.out.println("1. Thay đổi username");
            System.out.println("2. Thay đổi email");
            System.out.println("3. Thay đổi mật khẩu");
            System.out.println("4. Đăng xuất");
            System.out.println("0. Thoát chương trình");
            System.out.print("Mời chọn: ");
            UserHanle userHanle = new UserHanle();
            int ch;
            while (true) {
                try {
                    ch = Integer.parseInt(scanner.nextLine());
                    if (ch < 0 || ch > 4) {
                        throw new Exception();
                    }
                    break;
                } catch (Exception e) {
                    System.out.print("Lỗi! Mời chọn lại: ");
                }
            }
            switch (ch) {
                case 1:
                    userHanle.changeUsername(scanner, accounts, account);
                    break;
                case 2:
                    userHanle.changeEmail(scanner,accounts, account);
                    break;
                case 3:
                    userHanle.changePassword(scanner, account);
                    break;
                case 4:
                    return;
                case 0:
                    System.exit(0);

            }
        }
    }
}
