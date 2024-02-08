import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer>al2= new ArrayList<>(List.of(50,60,70,80,90));
        al1.add(10);
        al1.add(20);
        al1.add(30);
//        for(Integer x: al1)
//        {
//            System.out.print(x + " ");
//        }
        System.out.println(al1);
        System.out.println();
        al1.addAll(al2);

//        for(Integer x: al1)
//        {
//            System.out.print(x + " ");
//        }

//        ArrayList<Integer>al3 =(ArrayList<Integer>) al1.clone();
//        System.out.println(al3);

        System.out.println( al1.get(2));
        al1.set(0,2000000);
        System.out.println(al1.get(0));

        Iterator<Integer>it = al1.iterator();
        while(it.hasNext())
            System.out.print(it.next() + " ");
        System.out.println( );

        al1.forEach(n-> System.out.print(n +" "));




    }
}
