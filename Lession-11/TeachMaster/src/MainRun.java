import java.util.ArrayList;
import java.util.Scanner;

public class MainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TeachMaster teachMaster = new TeachMaster();
        teachMaster.inputInfo(scanner);
        System.out.println(teachMaster);
        //////////

        System.out.println("Add students: ");
        ArrayList<Student> temp = teachMaster.getClassz().inpuStudent(scanner);
        teachMaster.getClassz().getStudents().addAll(temp);
        System.out.println(teachMaster);


        ////////
        System.out.println("Update rank of student: ");
        System.out.print("Enter Id: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean check = true;
        for (int i = 0; i < teachMaster.getClassz().getStudents().size(); i++) {
            if (id == teachMaster.getClassz().getStudents().get(i).getId()) {
                System.out.print("Update rank: ");
                teachMaster.getClassz().getStudents().get(i).setRank(scanner.nextLine());
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("Không tìm thấy!");
        }
        System.out.println(teachMaster);

        /////
        System.out.println("Delete student: ");
        System.out.print("Enter Id: ");
        id = Integer.parseInt(scanner.nextLine());
        check = true;
        for (int i = 0; i < teachMaster.getClassz().getStudents().size(); i++) {
            if (id == teachMaster.getClassz().getStudents().get(i).getId()) {
                teachMaster.getClassz().getStudents().remove(i);
                System.out.println("Complete!");
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("Không tìm thấy!");
        }

        System.out.println(teachMaster);
    }
}
