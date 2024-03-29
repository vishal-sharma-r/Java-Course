package Module20_Java_lang;
class MyObject{

    /*These are the overided method so these can be overided*/
    public  String toString(){
        return "MyObject";
    }
    public int hashCode()
    {
        return  100;
    }
    public  boolean equals(Object o)
    {
        return this.hashCode() == o.hashCode();
    }
}
class  MyObject2 extends MyObject{


}

public class ObjectClass {
    public static void main(String[] args) {
        Object o1 = new Object();
        System.out.println(o1);
        Object o2 = new Object();
        System.out.println(o1.equals(o2));
        System.out.println(o1.hashCode() + " "+o2.hashCode());
        System.out.println();

        /*
        * See  the method of the class : MyObject inherits from Object class
        * always
        * */
        MyObject o3 = new MyObject();
        System.out.println(o3.getClass());

    }
}
