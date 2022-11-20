package tiktok;

import java.util.ArrayList;
import java.util.Scanner;

public class MainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tiktok tiktok = new Tiktok();
        tiktok.setIdols(tiktok.inputIdols(scanner));
        tiktok.setSongs(tiktok.inputSong(scanner));
        System.out.println("-----------------------");
        System.out.println(tiktok.toString());
    }
}
