package lmth;

public class Yasuo implements CanSurf {
    private String hair;
    private String weapon;

    public Yasuo(String hair) {
        this.hair = hair;
        this.weapon = "sword";
    }

    @Override
    public void surf() {
        System.out.println("surf surf");
    }
}
