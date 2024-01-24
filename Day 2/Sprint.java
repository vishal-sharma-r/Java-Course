
public class Sprint {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        /* Different type of print statements */
        System.out.println("sum " + x + y);
        System.out.println("Sum is " + (x + y));
        System.out.print(x + y + " ");
        System.out.print(x - y + "\n");
        System.out.printf("Hello\n");

        float z = 12.456f;
        char a = 'A';
        System.out.printf("Hello %d %f  %c \n", x, z, a);
        /* Number representation using format specifiers */
        System.out.printf("%o \n", x);

        System.out.printf("%05d \n", 10);

        int q = 12;
        System.out.printf("%+5d \n", q);

        String str = "JavaProgram";
        System.out.printf("%33s",str);
    }
}
