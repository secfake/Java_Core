import java.util.ArrayList;
import java.util.Scanner;

public class MainRun {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        int i = 1;
        while (true) {
            try {
                System.out.println("Enter student " + i);
                Student student = new Student();
                student.inputInfo(scanner);
                students.add(student);
                String ch;
                System.out.print("Keep adding? (Y or N): ");
                while (true) {
                    ch = scanner.nextLine();
                    if (ch.equalsIgnoreCase("N") || ch.equalsIgnoreCase("y")) {
                        break;
                    }
                    System.out.print("Keep adding? (Y or N): ");
                }
                if (ch.equalsIgnoreCase("N")) {
                    break;
                }
                i++;
            } catch (Exception e) {
                System.out.println("Lỗi input, nhập lại!");
            }

        }
        System.out.println(students.toString());
    }
}
