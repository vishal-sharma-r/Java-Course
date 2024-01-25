public class Challenge4 {
    public static void main(String args[]) {
        int a[][] = { { 0, 1, 2, 3 }, { 0, 1, 2, 3 }, { 1, 2, 3, 4 } };
        int b[][] = { { 1, 3, 3, 4 }, { 2, 2, 3, 2 }, { 3, 2, 3, 4 } };

        int C[][] = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                C[i][j] = a[i][j] + b[i][j];
            }
        }

        for(int x[]: C){
            for(int y:x){
                System.out.print(y + " " );
            }
            System.out.println();
        }
    }
}
