package tiktok;

import java.util.ArrayList;
import java.util.Scanner;

public class Idol {
    private String name;
    private int id;
    private String email;
    private ArrayList<Follower> followers;
    private String group;

    public void inputInfo(Scanner scanner) {
        System.out.print("ID: ");
        this.id = Integer.parseInt(scanner.nextLine());
        System.out.print("Họ tên: ");
        this.name = scanner.nextLine();
        System.out.print("Email: ");
        this.email = scanner.nextLine();
        System.out.print("Nhập số người follow: ");
        int num ;
        do {
            num = Integer.parseInt(scanner.nextLine());
            if (num>=0){
                break;
            }
            System.out.print("Không hợp lệ, nhập lại: ");
        }while (true);

        ArrayList<Follower> tempFollowers = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            System.out.println("Nhập thông tin followers thứ " + (i + 1));
            Follower follower = new Follower();
            follower.inputInfo(scanner);
            tempFollowers.add(follower);
        }
        this.followers = tempFollowers;
        System.out.print("Group: ");
        this.group = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Idol{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", followers=" + followers +
                ", group='" + group + '\'' +
                '}';
    }
}
