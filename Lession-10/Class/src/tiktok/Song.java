package tiktok;

import java.util.Scanner;

public class Song {
    private int id;
    private String name;
    private String singer;

    public void inputInfo(Scanner scanner) {
        System.out.print("ID: ");
        this.id = Integer.parseInt(scanner.nextLine());
        System.out.print("Tên bài hát: ");
        this.name = scanner.nextLine();
        System.out.print("Ca sĩ: ");
        this.singer = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", singer='" + singer + '\'' +
                '}';
    }
}
