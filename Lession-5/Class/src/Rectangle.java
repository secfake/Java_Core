public class Rectangle {

    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double rectanglePerimeter() {
        return (height + width) * 2;
    }

    public double rectangularArea() {
        return height * width;
    }

}
