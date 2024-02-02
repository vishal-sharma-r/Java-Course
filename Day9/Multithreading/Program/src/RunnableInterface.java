class RunnableInterface1 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println(i++ + " Hello");
        }
    }
}

public class RunnableInterface {
    public static void main(String[] args) {
        RunnableInterface1 ri = new RunnableInterface1();
//        Creating thread of that class
        Thread t = new Thread(ri);
        t.start();

        int j = 0;
        while(j < 100)
        {
            System.out.println(j++ + " world!");
        }

    }
}
