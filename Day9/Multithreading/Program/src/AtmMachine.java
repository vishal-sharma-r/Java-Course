class ATM {
    synchronized void checkBalance(String name) {
        System.out.print(name + " Checking ");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Error " + e);
        }
        System.out.println(" Balance");

    }

    synchronized public void withdraw(String name, int amt) {
        System.out.print("Customer " + name + " Withdrawing ");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Error " + e);
        }
        System.out.println(amt);
    }
}

class Customer extends Thread {
    ATM atm;
    String name;
    int amount;

    Customer(String n, ATM a, int amt) {
        name = n;
        amount = amt;
        atm = a;
    }

    void useATM() {
        // check balance
        atm.checkBalance(name);

        //withdraw
        atm.withdraw(name, amount);
    }

    public void run() {
        useATM();
    }
}

public class AtmMachine {
    public static void main(String[] args) {
        ATM a = new ATM();
        Customer cs1 = new Customer("Vishal", a,1000);
        Customer cs2 = new Customer("Adi",a,2000);
        cs1.start();
        cs2.start();
    }
}
