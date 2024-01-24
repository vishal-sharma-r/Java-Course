import java.util.Scanner;

public class CuboidProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length, breadth, height;
        float area, volume;
        System.out.println("Enter length breadth and height");
        length = sc.nextInt();
        breadth = sc.nextInt();
        height = sc.nextInt();
        area = 2 * (length * breadth + breadth * height + height * length);
        volume = length * breadth * height;
        System.out.println("area is: " + area);
        System.out.println("volume is: " + volume);
        sc.close();
    }
}
