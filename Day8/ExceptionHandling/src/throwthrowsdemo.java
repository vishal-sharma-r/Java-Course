class NegativeDimensionException extends Exception {
    public String toString() {
        return "Dimensions of rectangle can't be negative";
    }
}

@SuppressWarnings("ALL")
public class throwthrowsdemo {
    static int area(int l, int b) throws NegativeDimensionException {
        if (l < 0 || b < 0) throw new NegativeDimensionException();
        return l * b;
    }

    static void methd1() throws NegativeDimensionException {
        System.out.println("Area is " + area(-10, 5));
    }

    public static void main(String[] args) {
        try {
            methd1();
        } catch (NegativeDimensionException e) {
            System.out.println(e);
        }

    }
}
