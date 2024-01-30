abstract class Shape {
    abstract public void perimeter();

    abstract public void area();
}

class Circle extends Shape {
    public double radius;

    public void perimeter() {
        System.out.printf("Perimeter is %.3f \n", 2 * Math.PI * radius);
    }

    public void area() {
        System.out.printf("Area is %.3f \n", Math.PI * radius * radius);
    }
}

class Rectangle extends Shape {
    public double length;
    public double breadth;

    public void perimeter() {
        System.out.printf("Perimeter is %.3f \n", 2 * (length + breadth));
    }

    public void area() {
        System.out.printf("Area is %.3f \n", length * breadth);
    }
    public void depth(){
        System.out.println("Depth");
    }
}

public class Challenge1 {
    public static void main(String[] args) {

        Circle c = new Circle();
        c.radius = 4;
        c.area();
        Shape s = c;
        s.area();
        s.perimeter();

        Rectangle r = new Rectangle();
        r.length = 2;
        r.breadth = 3;
        r.area();

        Shape s1 = r;
        s1.area();

    }
}
