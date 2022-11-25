package Handle;

import entity.Account;

import java.util.ArrayList;
import java.util.Scanner;

public class Register {
    public void registerAcc(Scanner scanner, ArrayList<Account> accounts) {
        Account account = new Account();
        System.out.println("================ Đăng ký tài khoản ===============");
        account.setUsername(inputUsername(scanner, accounts));
        account.setEmail(inputEmail(scanner, accounts));
        account.setPassword(inputPassword(scanner));
        accounts.add(account);
    }

    public String inputPassword(Scanner scanner) {
        String regex = "^(?=.*[A-Z])(?=.*[\\.;\\,_-])\\S{7,15}$";
        String newPass;
        while (true) {
            System.out.print("Password: ");
            newPass = scanner.nextLine();
            if (!newPass.matches(regex)) {
                System.out.println("Mật khẩu dài 7-15 ký tự, chứa ít nhất 1 ký tự in hoa, 1 ký tự đặc biệt (. , - _ ;)! ");
                continue;
            }
            break;
        }
        return newPass;
    }

    public String inputEmail(Scanner scanner, ArrayList<Account> accounts) {
        String regex = "^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$";
        String newMail;
        while (true) {
            System.out.print("Email: ");
            newMail = scanner.nextLine();
            if (!newMail.matches(regex)) {
                System.out.print("Không đúng định dạng! Nhập lại ");
                continue;
            }
            boolean check = true;
            for (Account temp : accounts) {
                if (temp.getEmail().equals(newMail)) {
                    check = false;
                    System.out.print("Email đã tồn tại! Nhập lại ");
                    break;
                }
            }
            if (check)
                break;
        }
        return newMail;
    }

    public String inputUsername(Scanner scanner, ArrayList<Account> accounts) {
        String newName;
        while (true) {
            System.out.print("Username: ");
            newName = scanner.nextLine();
            boolean check = true;
            for (Account temp : accounts) {
                if (temp.getUsername().equals(newName)) {
                    check = false;
                    System.out.print("Username đã tồn tại! Nhập lại ");
                    break;
                }
            }
            if (check)
                break;
        }
        return newName;
    }


}
