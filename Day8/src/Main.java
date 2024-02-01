import myPack1.demo1;
import myPack1.demo2;
import myPack1.demo3;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        pack1 p = new pack1();
        p.display();

        demo1 d = new demo1();
        d.display();
        demo2 d2 = new  demo2();
        d2.show();
        demo3 d3 = new demo3();
        d3.show();
    }
}