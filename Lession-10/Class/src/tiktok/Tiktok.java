package tiktok;

import java.util.ArrayList;
import java.util.Scanner;

public class Tiktok {
    private ArrayList<Idol> idols;
    private ArrayList<Song> songs;


    public void setIdols(ArrayList<Idol> idols) {
        this.idols = idols;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "Tiktok{" +
                "idols=" + idols +
                ", songs=" + songs +
                '}';
    }

    public ArrayList<Idol> inputIdols(Scanner scanner) {
        System.out.print("Nhập số idol: ");
        int numIdol;
        do {
            numIdol = Integer.parseInt(scanner.nextLine());
            if (numIdol > 0) {
                break;
            }
            System.out.print("Không hợp lệ, nhập lại: ");
        } while (true);
        ArrayList<Idol> Idols = new ArrayList<>();
        for (int i = 0; i < numIdol; i++) {
            System.out.println("Nhập idol thứ " + (i + 1));
            Idol idol = new Idol();
            idol.inputInfo(scanner);
            Idols.add(idol);
        }
        return Idols;
    }

    public ArrayList<Song> inputSong(Scanner scanner) {
        System.out.print("Nhập số bài hát: ");
        int numSong;
        do {
            numSong = Integer.parseInt(scanner.nextLine());
            if (numSong > 0) {
                break;
            }
            System.out.print("Không hợp lệ, nhập lại: ");
        } while (true);
        ArrayList<Song> songs = new ArrayList<>();
        for (int i = 0; i < numSong; i++) {
            System.out.println("Nhập bài hát thứ " + (i + 1));
            Song song = new Song();
            song.inputInfo(scanner);
            songs.add(song);
        }
        return songs;
    }
}
