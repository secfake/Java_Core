import java.util.Scanner;

public class Worker {
    //    id, name, age, salary, workPlace
    private String id;
    private String name;
    private int age;
    private double salary;
    private String workPlace;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", workPlace='" + workPlace + '\'' +
                '}';
    }

    public void inputInfo(Scanner scanner) {
        System.out.println("====== Add Work =====");
        System.out.print("Enter Code: ");
        this.id = scanner.nextLine();
        System.out.print("Enter Name: ");
        this.name = scanner.nextLine();
        while (true) {
            try {
                System.out.print("Enter Age: ");
                this.age = Integer.parseInt(scanner.nextLine());
                if (age < 0 || age > 120) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Error input!");
            }
        }
        while (true) {
            try {
                System.out.print("Enter Salary: ");
                this.salary = Double.parseDouble(scanner.nextLine());
                if (salary < 0) {
                    throw  new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Error input!");
            }
        }
        System.out.print("Enter Work Location: ");
        this.workPlace = scanner.nextLine();
    }
}
