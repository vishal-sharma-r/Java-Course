import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class QuickSort {
    public static  int partion(ArrayList<Integer>arr, int low , int high)
    {
        int pivot = arr.get(low);
        int i = low;
        int j = high;
        while(i < j)
        {
            while(arr.get(i) <= pivot && i <= high-1)
            {
                i++;
            }
            while(arr.get(j) > pivot && j >= low +1)
            {
                j--;
            }
            if (i < j) {
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        int temp = arr.get(low);
        arr.set(low, arr.get(j));
        arr.set(j, temp);
        return j;
    }
    public static void qs(ArrayList<Integer> arr,int low ,int high)
    {
        if(low < high)
        {
            int p = partion(arr,low,high);
            qs(arr,low, p-1);
            qs(arr,p+1,high);
        }
    }
    static ArrayList<Integer> quicksort(ArrayList<Integer>arr)
    {
        qs(arr, 0, arr.size() - 1);
        return arr;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(3,2,4,5,1,6,8,9,7));
        arr.forEach(x-> System.out.print(x +" "));
        System.out.println();
        System.out.println("After sorting");

        quicksort(arr);

        arr.forEach(x-> System.out.print(x +" "));

        Calendar c = Calendar.getInstance();
        System.out.println(c);
    }
}
