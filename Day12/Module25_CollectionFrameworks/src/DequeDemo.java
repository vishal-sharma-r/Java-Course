import java.util.ArrayDeque;

public class DequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.addLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);
        dq.offerLast(50);
        dq.offerFirst(0);
        dq.offerFirst(1);
        dq.forEach(x -> System.out.print(x + " "));
        System.out.println();
        System.out.println(dq.peek());
        System.out.println(dq.peekLast());
        dq.pollLast(); //last element is removed
        System.out.println(dq);



    }
}
