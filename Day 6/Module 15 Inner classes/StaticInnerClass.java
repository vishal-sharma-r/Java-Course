class Outer1 {
    static int x = 10;

    void display() {
        class Inner1 {
            static int y = 20;

            public void display() {
                System.out.println("Inner " + y);
                System.out.println("Inner " + x);
            }
        }
        Inner1 i = new Inner1();
        i.display();
    }
}

class Outer2{
    int x  =10;
    static int  y = 100;
    static class My{
        public void show(){
            System.out.println( y);
        }
    }
}
public class StaticInnerClass {
    public static void main(String[] args) {
        Outer1 si = new Outer1();
        si.display();

        Outer2.My om = new Outer2.My();
        om.show();
    }
}
