import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Member {
    private String id;
    private String name;
    private LocalDate dob;
    private String job;

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

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", job='" + job + '\'' +
                '}';
    }

    public void inputInfo() {
        System.out.print("ID: ");
        this.id = new Scanner(System.in).nextLine();
        System.out.print("Name: ");
        this.name = new Scanner(System.in).nextLine();
        inputDateOfBirth();
        System.out.print("Job: ");
        this.job = new Scanner(System.in).nextLine();

    }

    private void inputDateOfBirth() {
        String date;
        LocalDate currentDay = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String regex = "\\d{2}[-|/]\\d{2}[-|/]\\d{4}";
        System.out.print("Date of birth (dd/MM/yyyy): ");
        do {
            do {
                date = new Scanner(System.in).nextLine();
                if (date.matches(regex)){
                    break;
                }
                System.out.print("Không hợp lệ, nhập lại: ");
            }while (true);
            this.dob = LocalDate.parse(date,format);
            Period age = Period.between(dob,currentDay);
            if (dob.isAfter(currentDay)){
                System.out.print("Chưa sinh ra à? Nhập lại:");
                continue;
            }
            if (age.getYears()<=18){
                System.out.print("Chưa đủ 18+, nhập lại đi: ");
                continue;
            }
            break;
        }while (true);

    }
}
