
public class Challenge4_1 {
    public static void main(String[] args) {
        int a[][] = { { 0, 1, 2, 3 }, { 0, 1, 2, 3 }, { 1, 2, 3, 4 } };
        int b[][] = { { 1, 3, 3 }, { 2, 2, 3}, { 3, 2, 3 },{2,2,3} };
        int row1 = a.length;
        int row2 = b.length;
        int col2 = b[0].length;
        int c[][] = new int[a.length][b[0].length];
        for(int i = 0; i < row1; i++){
            for(int j =0; j < col2; j++){
                for(int k =0;k < row2; k++){
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        for(int x[]: c){
            for(int y:x){
                System.out.print(y + " " );
            }
            System.out.println();
        }
    }
}
