package Handle;

import entity.Account;
import view.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    public void login(Scanner scanner, ArrayList<Account> accounts) {
        System.out.println("============ Đăng nhập ===============");
        Menu menu = new Menu();
        while (true) {
            System.out.print("Username: ");
            String name = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();
            boolean check = false;
            for (Account account : accounts) {
                if (account.getUsername().equals(name)) {
                    // nhập đúng username
                    check = true;
                    if (account.getPassword().equals(password)) {
                        //nhập đúng cả password
                        menu.viewFunction(scanner, accounts, account);
                    } else {
                        //sai pass
                        menu.viewLogin(scanner, accounts, account);
                    }
                }
            }
            if (check) {
                break;
            }
            System.out.println("Kiểm tra lại username!");
        }
    }

    public void resetPassword(Scanner scanner, ArrayList<Account> accounts, Account account) {
        Register register = new Register();
        System.out.println("============ Quên mật khẩu ================");
        System.out.print("Email: ");
        String email = scanner.nextLine();
        if (account.getEmail().equals(email)) {
            String password = register.inputPassword(scanner);
            account.setPassword(password);
            Menu menu = new Menu();
            menu.viewFunction(scanner, accounts, account);
        }
        System.out.println("Tài khoản chưa tồn tại!");
    }

}
