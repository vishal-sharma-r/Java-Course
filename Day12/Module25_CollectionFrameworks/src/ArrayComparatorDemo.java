import java.util.Arrays;
import java.util.Comparator;

class MyComp implements Comparator<Integer>
{
    public int compare(Integer a, Integer b)
    {
        if(a < b ) return 1;
        if(a > b) return -1;
        return 0;
    }
}
public class ArrayComparatorDemo {
    public static void main(String[] args) {
        int []a  = {1,3,4,5,2,4,6,7,6};
        Arrays.sort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(Arrays.binarySearch(a,8));
        Integer []b  = {1,3,4,5,2,4,6,7,6};
        Arrays.sort(b,new MyComp());
        for (Integer i : b) {
            System.out.print(i + " ");
        }



    }
}
