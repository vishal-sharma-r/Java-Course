import java.util.Scanner;

public class DIsplayNumberChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int reverse = 0;
        int cnt = 0;
        while(n > 0)
        {
            int r = n % 10;
            n = n/10;
            reverse = (reverse * 10)+r;
            cnt++;
        }
        System.out.println("Reverse is " + reverse);
        System.out.println("No. of Digits are :"+cnt);
        sc.close();

    }
}
