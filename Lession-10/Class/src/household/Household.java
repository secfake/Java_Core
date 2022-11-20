package household;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Household {
    private int id;
    private String apartmentNumber;
    private ArrayList<Member> members;

    public Household(int id) {
        this.id = id;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "Household{" +
                "id=" + id +
                ", apartmentNumber='" + apartmentNumber + '\'' +
                ", members=" + members +
                '}';
    }

    public void inputMembers(Scanner scanner) throws ParseException {
        int num;
        do {
            System.out.print("Nhập số người hộ dân: ");
            num = Integer.parseInt(scanner.nextLine());
            if (num > 0) {
                break;
            }
            System.out.print("Không hợp lệ, nhập lại: ");
        } while (true);

        for (int i = 0; i < num; i++) {
            Member member = new Member();
            System.out.println("Nhập thông tin thành viên số "+(i+1));
            member.inputMember(scanner);
            this.members.add(member);
        }
    }
}
