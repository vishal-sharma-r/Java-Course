import java.util.List;
import java.util.TreeSet;

public class TreeDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(List.of(1,2,3,4,5,6,7,8,9));
        ts.add(10);
        System.out.println(ts);
        ts.remove(10);
        System.out.println(ts);
        System.out.println(ts.contains(8));

        System.out.println(ts.ceiling(1));
        System.out.println(ts.floor(10));


    }
}

