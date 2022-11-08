import entity.Student;
import entity.Subject;

import java.util.Scanner;

public class MainRun {
    public static Student[] students = null;
    public static Subject[] subjects = null;

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int functionChoice = chooseFunction();
            logicHandle(functionChoice);
        }
    }

    private static void logicHandle(int functionChoice) {
        switch (functionChoice) {
            case 1:
                addNewStudent();
                break;
            case 2:
                showAllStudent();
                break;
            case 3:
                addNewSubject();
                break;
            case 4:
                showAllSubject();
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                System.exit(0);

        }
    }

    private static int chooseFunction() {
        System.out.print("Xin mời chọn chức năng: ");
        int functionChoice;
        do {
            functionChoice = new Scanner(System.in).nextInt();
            if (functionChoice >= 1 && functionChoice <= 8) {
                break;
            }
            System.out.print("Chức năng không hợp lệ, vui lòng nhập lại: ");
        } while (true);
        return functionChoice;
    }

    private static void showMenu() {
        System.out.println("-------PHẦN MỀM QUẢN LÝ ĐIỂM SINH VIÊN------");
        System.out.println("1. Thêm sinh viên mới.");
        System.out.println("2. In ra danh sách sinh viên.");
        System.out.println("3. Thêm môn học mới.");
        System.out.println("4. In ra danh sách môn học.");
        System.out.println("5. Nhập điểm cho sinh viên.");
        System.out.println("6. In ra danh sách bảng điểm.");
        System.out.println("7. Sắp xếp danh sách bảng điểm.");
        System.out.println("8. Thoát chương trình.");
    }

    public static void addNewStudent() {
        System.out.print("Nhập số lượng sinh viên muốn thêm mới: ");
        int studentNum = new Scanner(System.in).nextInt();
        Student[] temp = new Student[studentNum];
        for (int i = 0; i < studentNum; i++) {
            temp[i] = new Student();
            temp[i].nhapThongTin();
        }
        saveStudent(temp);
    }

    private static void saveStudent(Student[] student) {
        if (students == null) {
            students = student;
        } else {
            int studentNum = students.length + student.length;
            Student[] temp = new Student[studentNum];
            for (int i = 0; i < students.length; i++) {
                temp[i] = students[i];
            }
            for (int i = 0; i < student.length; i++) {
                temp[i + students.length] = student[i];
            }
            students = temp;
        }
    }

    private static void showAllStudent() {
        System.out.println("---------------------------------------------------------------------");
        if (students == null) {
            System.out.println("Chưa nhập danh sách sinh viên!");
        } else {
            System.out.printf("%-8s\t%-24s\t%-8s\t%-24s\t%-10s\n","Mã SV","Họ và tên", "Lớp","Địa chỉ","SĐT");
            for (int i = 0; i < students.length; i++) {
                students[i].inThongTin();
            }
        }
    }

    public static void addNewSubject() {
        System.out.print("Nhập số lượng môn học muốn thêm mới: ");
        int subjectNum = new Scanner(System.in).nextInt();
        Subject[] temp = new Subject[subjectNum];
        for (int i = 0; i < subjectNum; i++) {
            temp[i] = new Subject();
            temp[i].nhapThongTin();
        }
        saveSubject(temp);
    }

    private static void saveSubject(Subject[] subject) {
        if (subjects == null) {
            subjects = subject;
        } else {
            int subjectNum = subjects.length + subject.length;
            Subject[] temp = new Subject[subjectNum];
            for (int i = 0; i < subjects.length; i++) {
                temp[i] = subjects[i];
            }
            for (int i = 0; i < subject.length; i++) {
                temp[i + subjects.length] = subject[i];
            }
            subjects = temp;
        }
    }

    private static void showAllSubject() {
        System.out.println("---------------------------------------------------------------------");
        if (subjects == null) {
            System.out.println("Chưa nhập danh sách môn học!");
        } else {
            System.out.printf("%-8s\t%-24s\t%-20s\t%-20s\n", "Mã môn", "Tên môn", "Đơn vị học trình", "Loại môn");
            for (int i = 0; i < subjects.length; i++) {
                subjects[i].inThongTin();
            }
        }
    }
}
