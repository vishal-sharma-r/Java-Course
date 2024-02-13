import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MultithreadedReverseEcho implements Runnable {

    Socket client;

    public MultithreadedReverseEcho(Socket stk) {
        client = stk;
    }

    public static void main(String[] args) throws Exception {

        ServerSocket ss = new ServerSocket(2000);
        Socket stk;
        do {
            stk = ss.accept();
            System.out.println("Client Connected");
            MultithreadedReverseEcho mt = new MultithreadedReverseEcho(stk);
            Thread t = new Thread(mt);
            t.start();
        } while (true);

    }

    public void run() {
        try {

            StringBuffer buff;
            BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintStream ps = new PrintStream(client.getOutputStream());
            String str;
            do {
                str = br.readLine();
                buff = new StringBuffer(str);
                ps.println(buff.reverse());
            } while (!str.equals("bye"));

        } catch (Exception e) {
        }
    }
}

class MultiClient{
    public static void main(String[] args) throws  Exception {
        Socket stk = new Socket("localhost",2000);
        BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());
        String msg;

        do{
            System.out.print("Enter msg to reverse: ");
            msg = keyb.readLine();
            ps.println(msg);
            msg = br.readLine();
            System.out.print("Message reversed is: ");
            System.out.println(msg);
        } while(!msg.equals("dne"));

        stk.close();
    }
}
