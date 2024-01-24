import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print(" Enter the values of a and b: ");
        a = sc.nextInt();
        b = sc.nextInt();

        /* Xor operation to swap */
        /*
         * 4 = 100
         * 5 = 101
         * a = 001
         * b = 100
         * a = 101
         */
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(a + " " + b);

        sc.close();
    }
}
