package entity;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private int age;
    private String rank;
    private static int autoId = 1;

    public Student() {
        this.id = autoId++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", rank='" + rank + '\'' +
                '}';
    }

    public void inputInfo(Scanner scanner) {
        System.out.print("Name: ");
        this.name = scanner.nextLine();
        System.out.print("Age: ");
        while (true) {
            try {
                this.age = Integer.parseInt(scanner.nextLine());
                if (this.age < 10 || this.age > 50) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.print("Invalid, re-enter: ");
            }
        }

        System.out.print("Rank: ");
        this.rank = scanner.nextLine();
    }
}
