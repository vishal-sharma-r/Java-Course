class MyThread1 extends Thread {
    public MyThread1(String name) {
        super(name);
//        setPriority(Thread.MIN_PRIORITY);
    }

    public void run() {
        int count = 1;
        while (count < 200) {
            System.out.println(count++);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Error " + e);
            }
        }
    }
}

@SuppressWarnings("All")
public class ThreadMethods {
    public static void main(String[] args) {
        MyThread1 t = new MyThread1("My thread 1");
        t.setDaemon(true);
        t.start();
        Thread mainThread =  Thread.currentThread();
        try{

            mainThread.join();
        }
        catch (InterruptedException e)
        {
            System.out.println("Error "+e);
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Error " + e);
        }
//        t.interrupt(); // create a interrupt
        /*Methods*/
        /*
        System.out.println("Id "+t.getId());
        System.out.println("Name "+t.getName());
        System.out.println("Priority "+t.getPriority());
        t.start();
        System.out.println("State "+t.getState());
        System.out.println("Alive "+t.isAlive());
         */

    }
}
