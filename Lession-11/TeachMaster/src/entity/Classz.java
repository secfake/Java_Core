package entity;

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

    public ArrayList<Student> getStudents() {
        return this.students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Class{" +
                "subject='" + subject + '\'' +
                ", students=" + students +
                '}';
    }

    public void inputInfo(Scanner scanner) {
        System.out.print("Subject: ");
        this.subject = scanner.nextLine();
        this.students = inpuStudent(scanner);
    }

    public ArrayList<Student> inpuStudent(Scanner scanner) {
        int num;
        System.out.print("Enter student number: ");
        while (true) {
            try {
                num = Integer.parseInt(scanner.nextLine());
                if (num <= 0) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.print("Invalid, re-enter: ");
            }
        }

        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            System.out.println("Student " + (i + 1));
            Student student = new Student();
            student.inputInfo(scanner);
            students.add(student);
        }
        return students;
    }
}
