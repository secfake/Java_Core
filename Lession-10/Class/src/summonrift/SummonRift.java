package summonrift;

import java.util.ArrayList;
import java.util.Scanner;

public class SummonRift {
    private ArrayList<Team> teams;

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    public ArrayList<Team> inputInfo(Scanner scanner) {
        ArrayList<Team> teams = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            System.out.println("Nhập thông tin team " + (1 + i));
            Team team = new Team();
            team.inputInfo(scanner);
            teams.add(team);
        }
        return teams;
    }

    @Override
    public String toString() {
        return "SummonRift{" +
                "teams=" + teams +
                '}';
    }
}
