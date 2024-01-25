
public class Array1 {
    public static void main(String[] args) {
        int a[] = new int[5];
        int [] b = {1, 2, 3, 4, 5};
        System.out.println(a.length);
        for (int i = 0; i < 5; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        /**FOr Each Loop */
        for(int i : b){
            System.out.print(i + " ");
        }
        System.out.println();
        /* Reverse an array */
        for(int i = b.length-1; i >= 0; i--){
            System.out.print(b[i] + " ");
        }
    }
}
