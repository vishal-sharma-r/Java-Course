import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args){
        /*Printing a table upto 10 */
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(n  + " x " + i+ " = " + (n*i));
        }

        /*Sum upto n  number */
        int sum = 0;
        for(int i =1; i<= n ; i++){
            sum += i;
        }
        System.out.println("Sum is " + sum);

        
        sc.close();
    }
}
