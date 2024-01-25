public class MethodOverloading {

    static int Max(int a, int b, int c) {
        return (a > b && a > c) ? a : ((b > a && b > c) ? b : c);
    }

    public static void main(String[] args) {
        System.out.println(Max(1, 3, 4));
    }
}
