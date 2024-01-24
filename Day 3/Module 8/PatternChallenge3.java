
public class PatternChallenge3 {
    public static void main(String[] args) {
        int n = 5;

        int i = 0;
        while (i <= n) {
            int j = 1;
            int space = 0;

            while (space < i) {
                System.out.print("  ");
                space++;
            }
            while (j <= n - i) {
                System.out.print(j +" ");
                j++;
            }
            System.out.println();
            i++;
        }

        System.out.println();

        /* Another pattern */

        i = 1;
        while (i <= n) {
            int space = 0;
            while (space < n - i) {
                System.out.print("  ");
                space++;
            }
           int j = 0;
           while(j < i)
           {
            System.out.print(j + " ");
            j++;
           }
           System.out.println();

            i++;
        }
    }
}
