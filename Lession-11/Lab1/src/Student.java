import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private String address;
    private int age;
    private static int AUTO_ID = 1;

    public Student() {
        this.id = AUTO_ID;
        AUTO_ID++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }

    public void inputInfo(Scanner scanner) {
        System.out.print("Name: ");
        this.name = scanner.nextLine();
        System.out.print("Address: ");
        this.address = scanner.nextLine();
        System.out.print("Age: ");
        this.age = Integer.parseInt(scanner.nextLine());
    }
}
