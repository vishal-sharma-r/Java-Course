import java.util.Scanner;

public class FibonacciChallenge {
    public static void main(String[] args) {
        int t1 = 0, t2 = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(t1 + " " + t2);
        for(int  i = 2; i< n; i++)
        {
            int t3 = t1 + t2;
            System.out.print(" "+t3);
            t1 = t2;
            t2 = t3;
        }
        sc.close();
        // 0	1	1	2	3	5	8	13	21	34	55	89	144	233	377	610	987	1597	2584	4181


    }
}
