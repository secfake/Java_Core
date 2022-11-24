import Hanle.Logic;
import entity.Pet;

import java.util.ArrayList;
import java.util.Scanner;

public class MainRun {
    public static void main(String[] args) {
        Logic logic = new Logic();
        ArrayList<Pet> pets = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        logic.creatArayy(pets);
        logic.match(pets,scanner);
    }
}
