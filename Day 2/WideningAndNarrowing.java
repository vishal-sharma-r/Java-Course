public class WideningAndNarrowing {
    public static void main(String[] args) {
        byte a = 10;
        short s = a;
        int i = s;
        float f = i;
        int x = (int) f; // explicit conversion
        System.out.println(x);

    }
}
