class CoffeeMachine {
    private float coffeeQty;
    private float milkQty;
    private float sugar;
    static CoffeeMachine my = null;
    private static int cnt = 0;

    private CoffeeMachine() {
        coffeeQty = 1;
        milkQty = 1;
        sugar = 1;
    }

    static CoffeeMachine getInstance() {
        if (cnt == 2) {
            System.out.println("2 machines are created already");
            return null;
        }
        if (my == null) {
            my = new CoffeeMachine();
        }
        cnt++;
        return my;
    }

    void setCoffee(float x) {
        coffeeQty = x;
    }

    public float getCoffee() {
        return (coffeeQty / 100) + milkQty + sugar;
    }
}

public class Singleton {
    public static void main(String[] args) {
        CoffeeMachine c = CoffeeMachine.getInstance();
        CoffeeMachine c1 = CoffeeMachine.getInstance();
        CoffeeMachine c2 = CoffeeMachine.getInstance();
        if (c2 == null) {
            System.out.println("Cannot create a new Coffee Machine");
        }
        if (c == c1)
            System.out.println("Same machine");
        System.out.println(c.getCoffee());
    }
}
