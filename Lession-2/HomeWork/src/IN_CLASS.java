import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;

import static java.time.LocalDate.ofEpochDay;
import static java.time.LocalDate.parse;

public class IN_CLASS {
    public static void main(String[] args) {
//        int a = 0, b=0;
//        String s = a!=0 ? ""+(float)-b/a: b!=0? "vô nghiệm" : "vô số nghiệm";
//        System.out.println("Nghiệm phương trình: "+s);
//
//        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
//        String s = "admin@gmail.com";
//        System.out.println(s.matches(regex));
        String s1 = "10/10/2022";
        String s2 = "23/09/2023";
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate day1 = LocalDate.parse(s1,format);
        LocalDate day2 = LocalDate.parse(s2,format);
        Period day = Period.between(day1,day2);
        System.out.println("Khoảng thời gian từ ngày "+s1+" và "+s2+" là: "+day.getDays());
    }
}
