import java.util.Scanner;

public class PatternChallenge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println();
        int cnt = 1;
        for(int i = 1; i<= n; i++){
            for(int j = 1 ; j <= n; j++){
                if(j <= i){
                    System.out.print(cnt+" ");
                    cnt++;
                }
            }
            System.out.println();
        }


        sc.close();
    }
}
