
class Circle1 {
    public double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

}

class Cylinder1 extends Circle1 {
    public double height;

    public double volume() {
        return area() * height;
    }
}

public class Inheritance1 {
    public static void main(String[] args) {
        Cylinder1 c1 = new Cylinder1();
        c1.radius = 2;
        c1.height = 20;
        System.out.println("Area: " + c1.area());
        System.out.println("Volume: " + c1.volume());
    }
}
