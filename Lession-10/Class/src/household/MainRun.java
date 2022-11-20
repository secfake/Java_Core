package household;

import java.text.ParseException;
import java.util.Scanner;

public class MainRun {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        Household household = new Household(1);
        household.setApartmentNumber("ma ma");
        household.inputMembers(scanner);
    }
}
