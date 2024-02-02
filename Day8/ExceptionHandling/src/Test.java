import java.lang.reflect.Array;

public class Test {
    public static void main(String[] args) {
        int a, b, c;
        try {
            a = 5;
            b = 0;
            c = a / b;
            System.out.println("Result of c is : " + c);
            System.out.println("End of the program");

        } catch (ArithmeticException e) {
            System.out.println("Division by zero exception " + e);

        }

        /* Multiple catch block*/

        try {
            int[] A = {1, 23, 4, 4, 5};
            int r = A[0] / A[1];
            System.out.println(r);
            System.out.println(A[10]);
        } catch (ArithmeticException e) {
            System.out.println("Error" + e);
        } catch (ArrayIndexOutOfBoundsException et) {
            System.out.println("Error " + et);
        }
        /* Nested try and catch block*/

        try {
            int[] A = {1, 3, 55, 3, 42, 234, 2, 2};

            try {
                int r = A[0] / A[1];
                System.out.println(r);
            } catch (ArithmeticException e) {
                System.out.println("Error " + e);
            }
            System.out.println(A[10]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error " + e);

        }

        /*
         * try catch and finally*/
        try {
            int z = 10;
        } catch (Exception e) {
            System.out.println("Error " + e);

        } finally {
            /*Used for clean-up*/
            System.out.println("Hello");
        }
    }
}
