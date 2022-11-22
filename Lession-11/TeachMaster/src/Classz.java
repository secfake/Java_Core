import java.util.ArrayList;
import java.util.Scanner;

public class Classz {
    private String subject;
    private ArrayList<Student> students;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public ArrayList<Student>  getStudents() {
        return this.students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Classz{" +
                "subject='" + subject + '\'' +
                ", students=" + students +
                '}';
    }
    public void inputInfo(Scanner scanner){
        System.out.print("Subject: ");
        this.subject = scanner.nextLine();
        this.students = inpuStudent(scanner);
    }
    public ArrayList<Student> inpuStudent(Scanner scanner){
        int num;
        System.out.print("Enter student number: ");
        do {
            num= Integer.parseInt(scanner.nextLine());
            if (num>0){
                break;
            }
            System.out.print("Invalid, re-enter: ");
        }while (true);
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            System.out.println("Student "+(i+1));
            Student student = new Student();
            student.inputInfo(scanner);
            students.add(student);
        }
        return students;
    }
}
