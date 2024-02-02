class MyThread extends Thread {
    public void run() {
        int i = 0;
        while (i < 200) {
            System.out.println(i + " Hello");
            i++;
        }

        System.out.println("Done executing thread");

    }
}

public class Main extends Thread {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        Main t1 = new Main();
        t1.start();
        int i = 0;
        while (i < 200) {
            System.out.println(i + " World !");
            i++;
        }
        System.out.println("Done executing Main method");


    }

    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println(i++ + " main thread");
        }
    }
}