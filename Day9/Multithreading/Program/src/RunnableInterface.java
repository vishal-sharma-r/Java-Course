class RunnableInterface1 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println(i++ + " Hello");
        }
    }
}

public class RunnableInterface implements  Runnable{
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println(i++ + " hello main");
        }
    }
    public static void main(String[] args) {
        RunnableInterface1 ri = new RunnableInterface1();
//        Creating thread of that class
        Thread t = new Thread(ri);
        t.start();

        RunnableInterface ri2 = new RunnableInterface();
        Thread t2 = new Thread(ri2);
        t2.start();

        int j = 0;
        while(j < 100)
        {
            System.out.println(j++ + " world!");
        }

    }
}
