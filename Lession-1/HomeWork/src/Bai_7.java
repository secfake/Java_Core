public class Bai_7 {
    public static void main(String[] args) {
        int a=4, b=-2, c = -6;
        float delta = b*b -4*a*c;
        System.out.println(delta);
        double x1 = (-b-Math.sqrt(delta))/(2*a);
        double x2 = (-b+Math.sqrt(delta))/(2*a);
        System.out.println("Nghiệm của phương trình là: "+x1+" và "+x2);
    }
}
