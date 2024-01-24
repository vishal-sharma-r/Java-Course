
public class PatternChallenge2 {
    public static void main(String[] args) {
        int n = 5;
        int i = 0;
        while(i < n){
            int  j = 1;
            while(j <= n-i)
            {
                System.out.print(j+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
