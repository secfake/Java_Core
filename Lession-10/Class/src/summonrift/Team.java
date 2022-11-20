package summonrift;

import java.util.ArrayList;
import java.util.Scanner;

public class Team {
    private int id;
    private ArrayList<Figure> figures;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Figure> getFigures() {
        return figures;
    }

    public void setFigures(ArrayList<Figure> figures) {
        this.figures = figures;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", figures=" + figures +
                '}';
    }

    public void inputInfo(Scanner scanner) {
        System.out.print("Id: ");
        this.id = Integer.parseInt(scanner.nextLine());
        this.figures = inputFigure(scanner);
    }

    public ArrayList<Figure> inputFigure(Scanner scanner) {
        ArrayList<Figure> figures = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Figure figure = new Figure();
            System.out.println("Nhập thông tin Figure " + (i + 1));
            figure.inputInfo(scanner);
            figures.add(figure);
        }
        return figures;
    }
}
