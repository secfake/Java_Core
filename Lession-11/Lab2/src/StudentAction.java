import java.util.ArrayList;
import java.util.Scanner;

public class StudentAction {
    public ArrayList<Student> inputStudent(Scanner scanner) {
        ArrayList<Student> students = new ArrayList<>();
        while (true) {
            try {
                System.out.print("Nhập số sinh viên: ");
                int num = Integer.parseInt(scanner.nextLine());
                if (num < 1) {
                    throw new Exception();
                }
                for (int i = 0; i < num; i++) {
                    System.out.println("Sinh viên " + (i + 1));
                    Student student = new Student();
                    student.inputInfo(scanner);
                    students.add(student);
                }
                break;
            } catch (Exception e) {
                System.out.println("Vui lòng nhập lại!");
            }

        }
        return students;
    }

    public void showStudent(ArrayList<Student> students) {
        for (Student student : students) {
            student.showRank();
        }
    }

    public void countRank(ArrayList<Student> students) {
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int num = students.size();
        if (num == 0) {
            System.out.println("Không có dữ liệu!");
            return;
        }
        for (Student student : students) {
            if (student.getRank().equalsIgnoreCase("A")) {
                countA++;
            }
            if (student.getRank().equalsIgnoreCase("B")) {
                countB++;
            }
            if (student.getRank().equalsIgnoreCase("C")) {
                countC++;
            }
        }
        System.out.printf("Xếp loai A: %.2f \n", (double) countA * 100 / num);
        System.out.printf("Xếp loai B: %.2f \n", (double) countB * 100 / num);
        System.out.printf("Xếp loai C: %.2f \n", (double) countC * 100 / num);
    }
}
