import java.util.*;
public class StringTokenizerDemo {
    public static void main(String[] args) throws Exception {
        String data = "name=Vijay address=delhi country=india dept=cse";
        StringTokenizer stk = new StringTokenizer(data," ");
        String s;
        while (stk.hasMoreTokens()) {
            s = stk.nextToken();
            System.out.println(s);
        }
    }
}
