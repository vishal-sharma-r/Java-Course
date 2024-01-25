import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        // Rotation of an array
        int a[] = { 1, 2, 3, 4, 5, 6 };
        int i = 0, j = a.length - 1;
        while (i <= j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }

        // self rotation k times
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rotations: ");
        int k = sc.nextInt();
        i = 0;
        j = k-1;
        while (i <= j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        
        i = k;
        j = a.length - 1;
        
        while (i <= j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }

        for (int it : a) {
            System.out.print(it + " ");
        }
        sc.close();
        

    }
}
