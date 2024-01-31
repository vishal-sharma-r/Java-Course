
interface Member {
    void callback();
}

class Store {
    Member mem[] = new Member[10];
    int count = 0;

    void register(Member m) {
        mem[count++] = m;
    }

    void inviteSale() {
        for (int i = 0; i < count; ++i) {
            mem[i].callback();
        }
    }
}

class Customer implements Member {
    String name;

    public Customer(String name) {
        this.name = name;
    }

    public void callback() {
        System.out.println("Ok I will visit " + name);
    }
}

public class ChallengeCallback {
 public static void main(String[] args) {
    Store s = new Store();
    Customer c1 = new Customer("Abhi");
    Customer c2 = new Customer("john");
    s.register(c1);
    s.register(c2);
    s.inviteSale();
 }
}
