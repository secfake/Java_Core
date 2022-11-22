import java.util.ArrayList;
import java.util.Scanner;

public class MainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentAction studentAction = new StudentAction();
        ArrayList<Student> students = studentAction.inputStudent(scanner);
        studentAction.showStudent(students);
        studentAction.countRank(students);

    }
}
