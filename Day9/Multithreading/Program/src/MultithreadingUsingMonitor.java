@SuppressWarnings("All")

class Mydata {
    public void display(String str) {
        synchronized (this) {
            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i));
                try {
                    Thread.sleep(100);
                }
                catch (InterruptedException e)
                {
                    System.out.println("Error "+e);
                }
            }
        }
    }


    synchronized void show(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
    }
}

class MyThread2 extends Thread {
    Mydata d;

    MyThread2(Mydata data) {
        d = data;
    }

    public void run() {
        d.display("Hello world ");
        d.show("Vishal ");
    }



}

class MyThread3 extends Thread {
    Mydata data;

    MyThread3(Mydata dt) {
        data = dt;
    }

    public void run() {
        data.display("Welcome ");
        data.show("Sharma ");
    }


}

public class MultithreadingUsingMonitor {
    public static void main(String[] args) {
        Mydata d = new Mydata();
        MyThread3 t1 = new MyThread3(d);
        MyThread2 t2 = new MyThread2(d);
        t1.start();
        t2.start();


    }
}
