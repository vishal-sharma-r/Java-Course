public class GenericMethod {
    public static <T extends Comparable<T>> T maximum(T[] arr)
    {
        T max = arr[0];
        for(int i = 1;i< arr.length; i++)
        {
            if(arr[i].compareTo(max) > 0)
            {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Integer []arr = {1,2,3,1,3,5,3,5,6,7};
        System.out.println(maximum(arr));

    }
}
