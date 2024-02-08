import java.util.ArrayList;
import java.util.List;
class MyArray<T>
{
//    T []A = (T []) new Object[10];
    List<T> data = new ArrayList<>(10);
    int length = 0;
    public void append(T x)
    {
//        A[length++] = x;
        data.add(x);
        length++;
    }
    public void display(){
        for(int i = 0 ; i< length ;i++)
        {
            System.out.print(data.get(i) + " ");
        }
    }
}
public class GenericDemo<T> {
    T data[] = (T[]) new  Object[3];
    public static void main(String[] args) {
        /*
        GenericDemo<String> gd = new GenericDemo<>();
        gd.data[0] = "hii";
        gd.data[1] = "hello";
        gd.data[2]  = "bye";

        String str = gd.data[0];
        System.out.println(str);

         */

        MyArray<Integer> ma = new MyArray<>();
        ma.append(10);
        ma.append(20);
        ma.append(30);
        ma.display();

    }
}
