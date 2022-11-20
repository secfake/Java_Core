package tiktok;

import java.util.Scanner;

public class Follower {
    private String name;
    private int id;
    private String email;
    private int numberOfLike;

    public void inputInfo(Scanner scanner) {
        System.out.print("ID: ");
        this.id = Integer.parseInt(scanner.nextLine());
        System.out.print("Họ tên: ");
        this.name = scanner.nextLine();
        System.out.print("Email: ");
        this.email = scanner.nextLine();
        System.out.print("Số lượt like: ");
        this.numberOfLike = Integer.parseInt(scanner.nextLine());
    }

    @Override
    public String toString() {
        return "Follower{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", numberOfLike=" + numberOfLike +
                '}';
    }
}
