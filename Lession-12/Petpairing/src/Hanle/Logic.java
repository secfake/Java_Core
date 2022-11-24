package Hanle;

import entity.Pet;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Logic {
    public void creatArayy(ArrayList<Pet> pets) {
        Pet pet1 = new Pet("A", "Bun", 2, "Male", "aaaaa", "DOG", "aaaa");
        Pet pet2 = new Pet("B", "Bun", 2, "Female", "aaaaa", "DOG", "aaaa");
        Pet pet3 = new Pet("A", "Tamthe", 2, "Male", "aaaaa", "CAT", "aaaa");
        Pet pet4 = new Pet("B", "Tamthe", 2, "Female", "aaaaa", "CAT", "aaaa");
        pets.add(pet1);
        pets.add(pet2);
        pets.add(pet3);
        pets.add(pet4);
    }

    public void match(ArrayList<Pet> pets, Scanner scanner) {
        Pet pet = new Pet();
        System.out.println("Please input info your pet: ");
        pet.inputInfo(scanner);
        Random random = new Random();
        while (true) {
            int i = random.nextInt(pets.size());
            if (pets.get(i).getType().equalsIgnoreCase(pet.getType()) && !pets.get(i).getSex().equalsIgnoreCase(pet.getSex())) {
                System.out.println(pets.get(i).toString());
                System.out.printf("Do you want to find another pet?(Y/N): ");
                String ch;
                while (true) {
                    ch = scanner.nextLine();
                    if (ch.equalsIgnoreCase("y") || ch.equalsIgnoreCase("N")) {
                        break;
                    }
                    System.out.print("Please choose again: ");
                }
                if (ch.equalsIgnoreCase("N")) {
                    return;
                }
            }

        }
    }
}
