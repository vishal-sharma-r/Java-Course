public class Challenge1 {
    static boolean isPrime(int n) {
        if (n == 2)
            return true;
        int i = 2;
        while (i < Math.sqrt(n)) {
            if (n % i == 0)
                return false;
            i++;
        }
        return true;
    }

    static int GCD(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else if (b > a) {
                b = b - a;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        /* Prime checker */
        System.out.println(isPrime(23));

        System.out.println(GCD(7,11));

    }
}
