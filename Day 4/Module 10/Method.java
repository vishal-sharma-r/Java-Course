
public class Method {
    int max(int a, int b) {

        if (a > b)
            return a;
        else
            return b;
    }

    static int min(int a, int b) {
        if (a < b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        int a = 18, b = 10, c;
        Method mp = new Method();
        c = mp.max(a, b);
        System.out.println("Maximum is " + c);
        c = min(a, b);
        System.out.println("minimum " + c);

    }
}
