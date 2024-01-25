import java.util.*;

public class Challenge4_2 {
    public static void main(String[] args) {
        String str[] = { "Python", "Java", "JavaScript", "NodeJS", "MongoDb" };

        Arrays.sort(str);
        for (String s : str) {
        System.out.print(s +" ");
        }
        System.out.println();
        int[][] matrix = {
                { 5, 2, 8 },
                { 1, 6, 4 },
                { 3, 7, 9 }
        };

        // Sorting each row of the matrix
        for (int[] row : matrix) {
            Arrays.sort(row);
        }

        // Printing the sorted matrix
        System.out.println("Sorted Matrix (by row):");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        // Sorting each column of the matrix
        for (int col = 0; col < matrix[0].length; col++) {
            int[] columnData = new int[matrix.length];
            for (int row = 0; row < matrix.length; row++) {
                columnData[row] = matrix[row][col];
            }
            Arrays.sort(columnData);
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] = columnData[row];
            }
        }

        // Printing the sorted matrix
        System.out.println("\nSorted Matrix (by column):");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        float n = 4.12321f;
        System.out.printf("%.3f",n);
    }
}
