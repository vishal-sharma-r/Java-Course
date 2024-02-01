 class Super {
    final int X = 10;

    final void display() {
        System.out.println(X);
    }

}
class sub extends Super {
    // X = 01; // Not allowed
    // void display(){} // Cannot do : override final method is not allowed
}

public class FinalKeyword {
    final int X;
    {
        X = 10;
    }
    static final int Y;
    static {
        Y = 100;
    }
    final int Z;

    public FinalKeyword() {
        Z = 10000;
    }

    public static void main(String[] args) {
        final float PI;
        PI = 3.334f;
        System.out.println(PI);
        FinalKeyword fk = new FinalKeyword();
        System.out.println(fk.X + " " + Y + " " + fk.Z);
    }
}
