package household;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Member {
    private String name;
    private Date dob;
    private String job;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
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
                "name='" + name + '\'' +
                ", Dob=" + dob +
                ", job='" + job + '\'' +
                '}';
    }


    public void inputMember(Scanner scanner) throws ParseException {
        System.out.print("Họ tên: ");
        this.name = scanner.nextLine();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Ngày sinh: ");
        this.dob = simpleDateFormat.parse(scanner.nextLine());
        System.out.print("Nghề nghiệp: ");
        this.job = scanner.nextLine();
    }
}
