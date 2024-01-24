import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        /* Finding a Odd or even Number */

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("Number is even " + a);
        } else {
            System.out.println("Numeber is odd " + a);
        }
        sc.close();
    }
}