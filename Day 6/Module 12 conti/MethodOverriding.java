class Super{
    public void display(){
        System.out.println("Hello from super class");
    }
}
class Sub extends Super{
    public void display(){
        System.out.println("Hello welcome from the sub class");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Sub sb = new Sub();
        sb.display();
        /*Dynamic method  dispatch */

        //when a super class is referenced to the object of the sub class then method method overrided called of the sub class

        Super sp = new Sub();
        sp.display();
    }
}
