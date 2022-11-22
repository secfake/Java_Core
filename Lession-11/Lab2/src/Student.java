import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private double scoreMath;
    private double scorePhysic;
    private double scoreChemistry;
    private double avg;
    private String rank;
    private static int AUTO_ID = 1;

    public Student() {
        this.id = AUTO_ID;
        AUTO_ID++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScoreMath() {
        return scoreMath;
    }

    public void setScoreMath(double scoreMath) {
        this.scoreMath = scoreMath;
    }

    public double getScorePhysic() {
        return scorePhysic;
    }

    public void setScorePhysic(double scorePhysic) {
        this.scorePhysic = scorePhysic;
    }

    public double getScoreChemistry() {
        return scoreChemistry;
    }

    public void setScoreChemistry(double scoreChemistry) {
        this.scoreChemistry = scoreChemistry;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", scoreMath=" + scoreMath +
                ", scorePhysic=" + scorePhysic +
                ", scoreChemistry=" + scoreChemistry +
                '}';
    }

    public void inputInfo(Scanner scanner) {
        System.out.print("Name: ");
        this.name = scanner.nextLine();
        while (true) {
            try {
                System.out.print("Score Math: ");
                this.scoreMath = Double.parseDouble(scanner.nextLine());
                if (this.scoreMath < 0 || this.scoreMath > 10) {
                    throw new Exception("Điểm không hợp lệ!");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Không hợp lệ!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.print("Score Physic: ");
                this.scorePhysic = Double.parseDouble(scanner.nextLine());
                if (this.scorePhysic < 0 || this.scorePhysic > 10) {
                    throw new Exception("Điểm không hợp lệ!");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Không hợp lệ!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.print("Score Chemistry: ");
                this.scoreChemistry = Double.parseDouble(scanner.nextLine());
                if (this.scoreChemistry < 0 || this.scoreChemistry > 10) {
                    throw new Exception("Điểm không hợp lệ!");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Không hợp lệ!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }


        this.avg = (this.scoreChemistry + this.scoreMath + this.scorePhysic) / 3;
        if (this.avg >= 8) {
            this.rank = "A";
        } else if (this.avg >= 6.5) {
            this.rank = "B";
        } else {
            this.rank = "C";
        }
    }

    public void showRank() {
        System.out.printf("%s - AVG: %.2f - Xếp loại: %s\n", this.name, this.avg, this.rank);
    }
}
