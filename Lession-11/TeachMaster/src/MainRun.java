import Hanlde.Logic;
import entity.Student;
import entity.TeachMaster;

import java.util.ArrayList;
import java.util.Scanner;

public class MainRun {
    public static void main(String[] args) {
        TeachMaster teachMaster = new TeachMaster();
        while (true) {
            menu(teachMaster);
        }


    }

    public static void menu(TeachMaster teachMaster) {
        Scanner scanner = new Scanner(System.in);
        if (teachMaster.getClassz()==null){
            System.out.println("No data! Please enter!");
            teachMaster.inputInfo(scanner);
            return;
        }
        System.out.println("=========== Techmaster ============");
        System.out.println("1. Show details of Teachmaster");
        System.out.println("2. Add students");
        System.out.println("3. Update rank by Id");
        System.out.println("4. Delete student");
        System.out.println("5. Exit");
        System.out.print("Please choose: ");
        int ch;
        while (true) {
            try {
                ch = Integer.parseInt(scanner.nextLine());
                if (ch < 1 || ch > 5) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.print("Please choose again: ");
            }
        }
        Logic logic = new Logic();
        switch (ch) {
            case 1:
                System.out.println(teachMaster);
                break;
            case 2:
                logic.addStudent(teachMaster.getClassz().getStudents(), scanner);
                break;
            case 3:
                logic.updateRank(teachMaster.getClassz().getStudents(), scanner);
                break;
            case 4:
                logic.deleteStudent(teachMaster.getClassz().getStudents(), scanner);
                break;
            case 5:
                System.exit(0);

        }
    }
}
