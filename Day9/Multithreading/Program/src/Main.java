@SuppressWarnings("All")
class MyThread extends Thread {
    public void run() {
        int i = 0;
        while (i < 10) {
//            System.out.println(i + " Hello");
            i++;
            My m = new My();
            m.show();
            Main main = new Main();
            main.start();

        }
        System.out.println("Done executing thread");


    }

    class My {
        private int i = 10;

        public void show() {
            System.out.println(i + "My class inside thread");
        }
    }
}

@SuppressWarnings("All")
public class Main extends Thread {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
/*

       Main t1 = new Main();
        t1.start();
        int i = 0;
        while (i < 200) {
            System.out.println(i + " World !");
            i++;
        }
        System.out.println("Done executing Main method");
*/


    }

    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println(i++ + " main thread");
        }
    }
}