import Handle.Login;
import entity.Account;
import view.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class MainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(new Account("admin", "Admin_1", "admin@gmail.com"));
        System.out.println(accounts.toString());
        Menu menu = new Menu();
        while (true) {
            menu.mainMenu(scanner, accounts);
        }

    }
}
