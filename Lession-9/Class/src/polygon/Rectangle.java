package polygon;

public class Rectangle implements Polygon{
private  double width;
private  double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public void display() {
        System.out.println("Dài: "+this.length);
        System.out.println("Rộng: "+this.width);
    }

    @Override
    public void calArea() {
        System.out.println("Diện tích: "+this.length*this.width);
    }
}
