import java.util.*;
public class MyFirst {
    public static void main(String[] arg) {
        System.out.println("Hello World!");
        // System.out.println(arg[0]);
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter value of a: ");
        // int a = sc.nextInt();
        // System.out.print("Enter value of b: ");
        // int b = sc.nextInt();
        // System.out.println("Sum of a & b is: "+ (a+b));
        // System.out.println(Math.min(a,b));

        // String name = sc.nextLine();
        // System.out.print("Welcome " + name + " to " +" J&K ");
        // System.out.println("Greeted well");

        // float f = 1.2347645f;
        // System.out.printf("%.2f",f);

        // byte b1 = 10;
        // byte b2 = 0b1010;
        // byte b3 = 012;
        // byte b4 = 0XA;
        // System.out.println(b1);
        // System.out.println(b2);
        // System.out.println(b3);
        // System.out.println(b4);
        // long l = 112232232323l;
        // double d = 32233.2323;
        // float f = 2342f;
        // System.out.println(d);

        // int x = -5;
        // System.out.println(Integer.toBinaryString(x));

        // int y = -10;
        // System.out.println(Integer.toHexString(y).toUpperCase());
        // char s = 0x1C85;
        // System.out.print(s + " ");

        // int x = sc.nextInt();
        // int y = sc.nextInt();
        // float m = 12.7f;
        // float n = 3;
        // int x = 0b0100;
        // System.out.println(x >> 2);
        // System.out.println(x >>> 2);

        // System.out.println(m % n);
        // calculate area of the program

        // float x = sc.nextFloat();
        // float y = sc.nextFloat();
        // float z = sc.nextFloat();
        // float S = (x + y + z) / 2f;
        // double A = Math.sqrt(S * (S - x) * (S - y) * (S - z));
        // System.out.println("Area is " + A);

        // // System.out.println((x * y) / 2);
        // int a, b, c;
        // float s;
        // double area;// double is used for area because Math.sqrt gives answer only in
        // double
        // System.out.println("Enter 3 sides of treangle ");
        // a = sc.nextInt();
        // b = sc.nextInt();
        // c = sc.nextInt();
        // s = (a + b + c) / 2f;
        // area = Math.sqrt(s * (s - a) * (s - b) * (s - c));// Math.sqrt is class for
        // doing underoot
        // System.out.println("Area of a triangle is:" + area);
        /*
        int length, breadth, height;
        float area, volume;
        System.out.println("Enter length breadth and height");
        length = sc.nextInt();
        breadth = sc.nextInt();
        height = sc.nextInt();
        area = 2 * (length * breadth + breadth * height + height * length);
        volume = length * breadth * height;
        System.out.println("area is:" + area);
        System.out.println("volume is:" + volume);
        */
        int l = 10; 
        // returns the string representation of the unsigned int value 
        // represented by the argument in binary (base 2) 
        System.out.println("Binary is " + Integer.toBinaryString(l)); 
  
        l = 9; 
        System.out.println("Binary is " + Integer.toBinaryString(l)); 
        sc.close();
    }
}
