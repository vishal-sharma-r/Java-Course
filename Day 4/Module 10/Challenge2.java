import java.util.Scanner;

public class Challenge2 {
    static float area(float length, float breadth) {
        /* area of reactangle */
        return length * breadth;
    }

    static double area(double radius) {
        return (double) (Math.PI * (radius * radius));
    }

    static double area(double a, double b, double c) {
        return ((a + b) * c) / 2;
    }

    public static void main(String[] args) {
        /* calculate area of different shapes */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and breadth ");
        float l = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println("Area of rectangle is " + area(l, b));
        System.out.print("Enter the radius of circle ");
        double r = sc.nextDouble();
        double ar = area(r);
        System.out.printf("Area of circle is %.2f\n", ar);

        System.out.print("Enter the sides of trapezium ");
        double a = sc.nextDouble();
        double ba = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println("Area of the trapezium " + area(a, ba, c));

        sc.close();
    }
}
