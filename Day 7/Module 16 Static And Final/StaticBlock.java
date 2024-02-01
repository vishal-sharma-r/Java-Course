
class StaticBlock1 {
    static int x;
    int y; /* Cannot do the initialization in the static block */
    static {
        System.out.println("1");
        x = 10;

    }
    static {
        System.out.println("2");
        x = 20;
    }

}

public class StaticBlock {
    static {
        System.out.println("Block1 in main");
    }

    public static void main(String[] args) {
        // StaticBlock1 sb = new StaticBlock1();
        System.out.println(StaticBlock1.x);
        System.out.println("Main");
    }

    static {
        System.out.println("Block2 in main");
    }
}
