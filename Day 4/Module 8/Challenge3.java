
public class Challenge3 {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6 };
        int b[] = new int[2 * a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        a = b;
        b = null;
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(a.length);
    }
}
