import java.util.Scanner;

public class Challenge10 {
    public static void main(String arg[]) {
        System.out.println(" Menu\n===\nADD\nSUB\nMUL\nDIV\n");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter 2 numbers");
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.nextLine();// FOR ACCESIG THE NEXT LINE
        System.out.println("Enter options in words");
        String str = sc.nextLine();
        str = str.toUpperCase();
        sc.close();

        switch (str) {
        case "ADD": {
            int A = x + y;
            System.out.println(" Addotion is:" + A);
            break;
        }
        case "SUB": {
            System.out.println(" SUb is" + (x - y));
            break;
        }
        case "MUL": {
            System.out.println(" MUl is " + (x * y));
            break;
        }
        case "DIV":
        {
            System.out.println(" div is"+(x/y));
            break;
        }

        }

    }

}
