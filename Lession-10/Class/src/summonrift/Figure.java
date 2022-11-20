package summonrift;

import java.util.Scanner;

public class Figure {
    private int id;
    private String name;
    private String position;

    public void inputInfo(Scanner scanner) {
        System.out.print("Id: ");
        this.id = Integer.parseInt(scanner.nextLine());
        System.out.print("Name: ");
        this.name = scanner.nextLine();
        System.out.print("Position: ");
        this.position = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Figure{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
