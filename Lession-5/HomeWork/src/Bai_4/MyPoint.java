package Bai_4;

public class MyPoint {
    double x;
    double y;

    public MyPoint() {

    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint(MyPoint myPoint) {
        this.x = myPoint.getX();
        this.y = myPoint.getY();
    }

    public double distance(MyPoint secondPoint) {
        double a = this.x - secondPoint.getX();
        double b = this.y - secondPoint.getY();
        return Math.sqrt(a * a + b * b);
    }

    public double distance(MyPoint p1, MyPoint p2) {
        double a = p1.getX() - p2.getX();
        double b = p1.getY() - p2.getY();
        return Math.sqrt(a * a + b * b);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
