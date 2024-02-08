import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class TreeMapAndHashMap {
    public static void main(String[] args) {
        TreeMap<Integer, String>tm = new TreeMap<>(Map.of(1,"A",2,"B",3,"C",4,"D"));
        tm.put(5,"E");
        System.out.println(tm);
        System.out.println(tm.get(3));
        System.out.println(tm.lastKey());
        System.out.println(tm.lastEntry().getKey());
        Map.Entry<Integer,String> e = tm.firstEntry();
        System.out.println(e);

        System.out.println("HashMap");
        //Similarly  with hashmap
        HashMap<Integer, String> hm = new HashMap<>(Map.of(1,"A",2,"B",3,"C",4,"D"));
        hm.put(5,"E");
        Iterator<Map.Entry<Integer,String>> it = hm.entrySet().iterator();

        while(it.hasNext())
        {
            Map.Entry<Integer, String> entry = it.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("Print using forEach loop");
        hm.forEach((x,y)-> System.out.println(x + " "+ y));


    }
}
