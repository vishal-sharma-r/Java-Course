public class ConditionalStatement {
    /*
     * Practicising conditional Statement
     */
    public static void main(String[] args) {
        int a = 10, b = 11, c = 8;
        /* Max of three numbers */

        if (a > b && a > c)
            System.out.println("A is greater : " + a);
        else if (b > a && b > c)
            System.out.println("B is greater : " + b);
        else
            System.out.println("C is greater : " + c);
    }
}
