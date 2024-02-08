import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(20,0.75f);
        hs.add(10);
        hs.add(20);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        for(var s: hs){
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(hs.contains(10));
        System.out.println(hs.remove(10));
        System.out.println(hs);
    }
}
