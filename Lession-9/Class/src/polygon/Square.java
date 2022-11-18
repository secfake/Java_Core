package polygon;

public class Square implements Polygon{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void display() {
        System.out.println("Cạnh: "+this.side);
    }

    @Override
    public void calArea() {
        System.out.println("Diện tích: "+this.side*this.side);
    }
}
