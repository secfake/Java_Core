import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Bai_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ngày sinh của bạn (dd/MM/yyyy): ");
        String day = sc.nextLine();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDay = LocalDate.parse(day,format);
        LocalDate currentDay = LocalDate.now();
        Period age = Period.between(birthDay,currentDay);
        String ketqua = birthDay.isAfter(currentDay)? "Bạn chưa sinh ra" : "Tuổi của bạn hiện tại: "+age.getYears();
        System.out.printf(ketqua);
    }
}
