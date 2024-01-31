class Outer {
    static int x = 10;

    Inner i = new Inner();

    class Inner {
        int y = 20;

        public void display() {
            System.out.println(x);
            System.out.println(y);
        }
    }

    public void display() {
        System.out.println(x + " " + i.y);

    }
}

public class InnerClass {
    public static void main(String[] args) {
        // Outer ou = new Outer();
        // ou.display();

        Outer.Inner oi = new Outer().new Inner();
        oi.display();
    }
}
