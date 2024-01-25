
public class TwoDArray {
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        /* Displaying an array */
        System.out.println("Printing using for each loop");
        for (int[] i : a) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        // System.out.println(a[2][2]);

        /* counter loop method to print 2D array */
        System.out.println("Printing using counter loop");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Printing zig-zag array");

        /* Creating a zig-zag array */

        int A[][];
        A = new int[3][];
        A[0] = new int[4];
        A[1] = new int[2];
        A[2] = new int[3];

        for (int x[] : A) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }

    
}
