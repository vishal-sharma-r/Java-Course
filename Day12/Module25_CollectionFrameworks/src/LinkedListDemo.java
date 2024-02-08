import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll1 = new LinkedList<>();
        LinkedList<Integer> ll2 = new LinkedList<>(List.of(50, 60, 70, 80));
        ll1.add(10);
        ll1.add(20);
        ll1.add(30);
        ll1.add(40);
        ll1.addAll(ll2);
        ll1.addFirst(100);
        ll1.add(1, 200);
        ll1.remove(ll1.size() - 1); // last element removed
        for (var x : ll1) {
            System.out.print(x + " ");
        }
        System.out.println();
        ll1.forEach(x-> System.out.print(x+ " "));
        System.out.println(ll1.peek());
        System.out.println(ll1.peekLast());
    }
}
