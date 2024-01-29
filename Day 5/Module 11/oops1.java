
class Circle {
    public double radius;

    public double area() {
        return Math.PI * (radius * radius);
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

public class oops1 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 7;
        System.out.println("area: " + c1.area());
    }

}
