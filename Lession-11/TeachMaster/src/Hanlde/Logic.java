package Hanlde;

import entity.Classz;
import entity.Student;
import entity.TeachMaster;

import java.util.ArrayList;
import java.util.Scanner;

public class Logic {
        public void addStudent(ArrayList<Student> students, Scanner scanner) {
        Classz classz = new Classz();
        System.out.println("========= Add students ==========");
        ArrayList<Student> temp = classz.inpuStudent(scanner);
        students.addAll(temp);

    }

    public void updateRank(ArrayList<Student> students, Scanner scanner) {
        System.out.println("======== Update rank of student ========");
        int id = inputId(scanner);
        boolean check = true;
        for (int i = 0; i < students.size(); i++) {
            if (id == students.get(i).getId()) {
                System.out.print("Update rank: ");
                students.get(i).setRank(scanner.nextLine());
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("Không tìm thấy!");
        }
    }

    public void deleteStudent(ArrayList<Student> students, Scanner scanner) {
        System.out.println("======== Delete student ========");
        int id = inputId(scanner);
        boolean check = true;
        for (int i = 0; i < students.size(); i++) {
            if (id == students.get(i).getId()) {
                students.remove(i);
                System.out.println("Complete!");
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("Không tìm thấy!");
        }
    }

    public int inputId(Scanner scanner) {
        int id;
        while (true) {
            try {
                System.out.print("Enter Id: ");
                id = Integer.parseInt(scanner.nextLine());
                if (id < 1) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.print("Invalid, re-enter: ");
            }
        }
        return id;
    }
}
