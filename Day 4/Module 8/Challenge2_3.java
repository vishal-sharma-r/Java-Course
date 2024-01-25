import java.util.Scanner;

public class Challenge2_3 {
    public static void main(String[] args) {
        int A[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Index ");
        int index = sc.nextInt();
        if (index > A.length)
            System.out.println("Index Out of Bound");
        // go to that array index and delete
        else {
            for (int i = index; i < A.length - 1; i++) {
                A[i] = A[i + 1];
            }
            A[A.length - 1] = -1;
            for (int i : A) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
