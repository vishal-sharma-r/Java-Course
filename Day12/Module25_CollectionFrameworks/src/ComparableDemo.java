
import java.util.*;
class Point implements  Comparable{
    int x; int y;
    public Point(int a, int b)
    {
        x = a;
        y = b;
    }
    public String toString(){
        return "x: "+x + " & y: "+y;
    }
    public int compareTo(Object o){
        Point p = (Point) o;
        if(this.x > p.x) return 1;
        else if (this.x < p.x) return -1;
        else{
            if(this.y > p.y) return 1;
            else if(this.y <  p.y) return -1;
            else  return 0;
        }

    }
}
public class ComparableDemo {
    public static void main(String[] args) {
        TreeSet<Point>ts = new TreeSet<>();
        ts.add(new Point(1,2));
        ts.add(new Point(2,3));
        ts.add(new Point(2,1));
        ts.add(new Point(1,1));
        System.out.println(ts);
    }
}
