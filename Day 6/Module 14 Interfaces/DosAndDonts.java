interface Test {
    int X = 10;

    void meth1();

    void meth2();
    private void meth4(){
        System.out.println("meth 4 ");
    };
    default void meth5(){
        meth4();
        System.out.println("meth 5");
    }
}

interface test2 extends Test {
    void meth3();

}

class test3 implements test2 {
    public void meth1() {
    };

    public void meth2() {
    };

    public void meth3() {
    }; 
}

public class DosAndDonts {
    public static void main(String[] args) {
        System.out.println(Test.X);
        test3 t = new test3();
        t.meth5();

    }
}
