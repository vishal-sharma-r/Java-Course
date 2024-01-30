
abstract class Super {
    public Super() {
        System.out.println("Super Constructor");
    }

    public void meth1() {
        System.out.println("Super meth1");
    }

    abstract public void meth2();
}

class sub extends Super {
    public void meth2() {
        System.out.println("Sub meth2");
    }
}

public class Abstract1 {
    public static void main(String[] args) {
        Super s1 = new sub();
        s1.meth1();
        s1.meth2();
    }
}
