import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        /* Checking the Radix of a given String */

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        if (str.matches("[01]+"))
        System.out.println("Binary Radix");
        else if (str.matches("[0-7]+"))
        System.out.println("Octal Radix");
        else if (str.matches("[0-9]+"))
        System.out.println("Decimal Radix");
        else if (str.matches("[0-9A-Fa-f]+"))
        System.out.println("Hexadecimal Radix");
        else {
        System.out.println(str + " "+ "Not a number");

        }


        /*Leap year checking code */
        System.out.println("Enter a year ");
        long year = sc.nextLong();

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println(" Given year " + year + " is a leap year");
        } else {
            System.out.println("Not a leap year");
        }

        sc.close();

    }
}
