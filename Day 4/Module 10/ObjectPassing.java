import java.util.Scanner;

public class ObjectPassing {
    static int[] increment(int a[]) {
        a[0] = 23;
        int b[] = { 1, 2, 3 };
        return b;

    }

    static String userName(String email) {
        int index = email.indexOf("@");
        String user = email.substring(0, index);
        return user;
    }

    static void changeString(String str) {
        str = "Abc";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array and no. of elements");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i : a)
            System.out.print(i + " ");
        System.out.println();
        int b[] = increment(a);
        for (int i : b)
            System.out.print(i + " ");

        System.out.println(a[0]);

        String str = "example@gmail.com";
        String user = userName(str);
        System.out.println(user);
        /* Strings are immutable in Java for sequirity reasons */
        String s = "xyz";
        changeString(s);
        System.out.println(s);
        sc.close();
    }
}
