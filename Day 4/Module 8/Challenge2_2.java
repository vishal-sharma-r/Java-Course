
public class Challenge2_2 {
    public static void main(String[] args) {
        /* insertion at particular index */
        int A[] = new int[10];
        int n = 6;
        A[0] = 1;
        A[1] = 2;
        A[2] = 3;
        A[3] = 4;
        A[4] = 5;
        A[5] = 6;
        for (int i = 0; i < n; i++)
            System.out.print(A[i] + " ");
        System.out.println("");
        int x = 20;// element insert at index
        int index = 2;
        for (int i = n; i < index; i--) {
            A[i] = A[i + 1];
        }
        A[index] = x;
        for (int i = 0; i < n; i++)
            System.out.print(A[i] + " ");
    }
}
