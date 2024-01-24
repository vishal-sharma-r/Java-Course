
public class PatternChallenge4 {
    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        while (i <= n) {
            int space = 0;
            while (space < n - i) {
                System.out.print("  ");
                space++;
            }
            int j = 0;
            while (j < i) {
                System.out.print(j + " ");
                j++;
            }
            j = i - 1;

            while (j >= 1) {
                System.out.print(j + " ");
                j--;
            }
            System.out.println();
            i++;
        }

        // lower triangle
        int k = 1;
        while (k <= n - 1) {
            int space = 0;
            while (space < k) {
                System.out.print("  ");
                space++;
            }
            int t = 1;
            while (t <= n - k) {
                System.out.print(t + " ");
                t++;
            }
            t = n - k - 1;
            while (t >= 1) {
                System.out.print(t + " ");
                t--;
            }
            System.out.println();
            k++;
        }

    }
}
