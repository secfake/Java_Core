package lmth;

public class Lucian implements CanSurf,CanShoot{
    private String hair;
    private String weapon;

    public Lucian(String hair) {
        this.hair = hair;
        this.weapon = "pistols";
    }

    @Override
    public void shoot() {
        System.out.println("head shoot");
    }

    @Override
    public void surf() {
        System.out.println("surf");
    }
}
