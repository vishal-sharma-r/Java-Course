import java.util.Scanner;

public class APChallenge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // an = a+(n-1)d;
        System.out.print(" Enter a , d, n: ");
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        System.out.print(a+" ");
        for(int i = 2; i <= n; i++){
            System.out.print(a+(i-1)*d + " ");
        }
        sc.close();
    }
}
