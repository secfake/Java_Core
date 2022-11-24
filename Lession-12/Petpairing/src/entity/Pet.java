package entity;

import constant.Sex;
import constant.Type;

import java.util.Scanner;

public class Pet {
    private static int autoId = 1;
    private int id;
    private String name;
    private String species;
    private int age;
    private String sex;
    private String description;
    private String type;
    private String images;

    public Pet() {
        this.id = autoId++;
    }

    public Pet(String name, String species, int age, String sex, String description, String type, String images) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.sex = sex;
        this.description = description;
        this.type = type;
        this.images = images;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", images='" + images + '\'' +
                '}';
    }

    public void inputInfo(Scanner scanner) {
        System.out.print("Name: ");
        this.name = scanner.nextLine();
        System.out.print("Species: ");
        this.species = scanner.nextLine();
        System.out.print("Age: ");
        while (true) {
            try {
                this.age = Integer.parseInt(scanner.nextLine());
                if (age <= 0 || age > 18) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.print("Error input! Re-enter: ");
            }
        }
        System.out.println("Sex: ");
        System.out.println("\t1.Male");
        System.out.println("\t2.Female");
        System.out.print("Please choose: ");
        while (true) {
            try {
                int ch = Integer.parseInt(scanner.nextLine());
                if (ch < 1 || ch > 2) {
                    throw new Exception();
                }
                if (ch == 1) {
                    this.sex = Sex.M.value;
                } else {
                    this.sex = Sex.M.value;
                }
                break;
            } catch (Exception e) {
                System.out.print("Error input! Choose again: ");
            }
        }

        System.out.print("Description: ");
        this.description = scanner.nextLine();

        System.out.println("Type: ");
        System.out.println("\t1.Dog");
        System.out.println("\t2.Cat");
        System.out.print("Please choose: ");
        while (true) {
            try {
                int ch = Integer.parseInt(scanner.nextLine());
                if (ch < 1 || ch > 2) {
                    throw new Exception();
                }
                if (ch == 1) {
                    this.type = Type.D.value;
                } else {
                    this.type = Type.C.value;
                }
                break;
            } catch (Exception e) {
                System.out.print("Error input! Choose again: ");
            }
        }

        System.out.print("Images: ");
        this.images = scanner.nextLine();

    }
}
