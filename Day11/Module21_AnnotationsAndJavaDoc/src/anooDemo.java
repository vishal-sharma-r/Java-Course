@SuppressWarnings("All")
class Parent{
    public void display(){};
}
@SuppressWarnings("all")
class Child extends Parent{
    @Override
    public void display(){}
}
@SuppressWarnings("all")
class OldClass{

    public void display(){
        System.out.println("Hello");
    }

    /**
     * @Depricated to show this method is of no use
     */
    @Deprecated
    public void show(){
        System.out.println("Hii!");
    }
}
@SuppressWarnings("All")
/**
 * @FunctionalInterface we can't write more
 * than one method inside the interface
 */
@FunctionalInterface
interface My{
    public void show();
//    public void display(); //can't write inside the Functiona;Interface
}

public class anooDemo {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
    OldClass od = new OldClass();
        od.show();
    }

}
