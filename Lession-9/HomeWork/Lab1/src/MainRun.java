import java.util.ArrayList;
import java.util.Scanner;

public class MainRun {
    static ArrayList<Member> members = new ArrayList<>();

    public static void main(String[] args) {

        addMember();
        showMember();

    }

    private static void showMember() {
        System.out.println("Danh sách member:");
        for (Member member : members) {
            System.out.println(member);

        }
    }

    private static void addMember() {
        int num;
        System.out.print("Nhập số member cần thêm: ");
        do {
            num = new Scanner(System.in).nextInt();
            if (num >= 3) {
                break;
            }
            System.out.print("Nhập ít nhất 3 member: ");
        } while (true);

        for (int i = 0; i < num; i++) {
            System.out.println("Nhập Member thứ "+ (i+1));
            Member member = new Member();
            member.inputInfo();
            members.add(member);
        }
    }

}
