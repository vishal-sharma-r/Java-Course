import java.util.Scanner;

public class Challenge2_1 {
    static int reverse(int n) {
        String ans = "";
        while (n > 0) {
            int r = n % 10;
            n /= 10;
            ;
            ans = ans + r + "";
        }
        return Integer.parseInt(ans);
    }

    static void reverse(int a[]) {
        int i = 0, j = a.length - 1;
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        /* ans in integer so leading 0 are removed */
        System.out.println(reverse(n));
        System.out.println("Enter size of array: " );
        int size = sc.nextInt();
        int a[] = new int[size];
        for(int i = 0; i < size; i++){
            a[i] = sc.nextInt();
        }
        reverse(a);
        System.out.println("Reverse array is: ");
        for(int i = 0; i < size; i++){
            System.out.print(a[i] + " ");
        }
        sc.close();

    }
}
