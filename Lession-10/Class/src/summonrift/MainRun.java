package summonrift;

import java.util.Scanner;

public class MainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SummonRift summonRift = new SummonRift();
        summonRift.setTeams(summonRift.inputInfo(scanner));
        System.out.println("-------------");
        System.out.println(summonRift);
    }
}
