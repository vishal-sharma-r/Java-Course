import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

class MyCom implements Comparator<Integer>
{
    public int compare(Integer o1,Integer o2)
    {
        if(o1<o2) return 1;
        if(o1>o2) return -1;
        return 0;
    }
}
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new MyCom());
        pq.add(10);
        pq.add(30);
        pq.add(20);
        pq.add(50);
        pq.add(40);
        System.out.println(pq);
        System.out.println(pq.peek());
        pq.poll();
        pq.forEach(x-> System.out.print(x + " "));
    }
}
