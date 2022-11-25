package Handle;

import entity.Account;

import java.util.ArrayList;
import java.util.Scanner;

public class UserHanle {
    public void changeUsername(Scanner scanner, ArrayList<Account> accounts, Account account) {
        Register register = new Register();
        System.out.println("======= Thay đổi username ========");
        String newName = register.inputUsername(scanner, accounts);
        account.setUsername(newName);
    }

    public void changeEmail(Scanner scanner, ArrayList<Account> accounts, Account account) {
        Register register = new Register();
        System.out.println("======= Thay đổi email ========");
        String newMail = register.inputEmail(scanner, accounts);
        account.setEmail(newMail);
    }

    public void changePassword(Scanner scanner, Account account) {
        Register register = new Register();
        System.out.println("======= Thay đổi mật khẩu ========");
        System.out.print("Current Password: ");
        String currentPass = scanner.nextLine();
        if (!currentPass.equals(account.getPassword())){
            System.out.println("Sai mật khẩu!");
            return;
        }
        while (true) {
            System.out.print("New ");
            String newPass = register.inputPassword(scanner);
            if (!newPass.equals(account.getPassword())) {
                account.setPassword(newPass);
                break;
            }
            System.out.print("Giống mật khẩu cũ! Nhập lại: ");
        }

    }
}
