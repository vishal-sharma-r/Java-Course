interface Super {
    void meth1();
    void meth2();
}

class sub implements Super {
    public void meth1() {
        System.out.println("meth1 of class sub");
    }

    public void meth2() {
        System.out.println("meth2 of class sub");
    }
}

public class Interface {
    public static void main(String[] args) {
        Super s = new sub();
        sub sb = new sub();
        sb.meth1();
        sb.meth2();
        s.meth1();
        s.meth2();
    }
}
