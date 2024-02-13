import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
public class ReverseEchoProject {
    public static void main(String[] args) throws  Exception {
        ServerSocket ss = new ServerSocket(2000);
        /* Accepting the connection from client */
        Socket stk = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());
        String msg;
        do{
            msg = br.readLine();
            System.out.println("Message from client: "+msg);
            StringBuilder s= new StringBuilder(msg);
            s.reverse();
            msg = s.toString();
            System.out.println("Result from server: "+msg);
            ps.println(msg);
        } while(!msg.equals("dne"));
        ss.close();
    }
}

class Client{
    public static void main(String[] args) throws Exception {
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
            System.out.println("Message reversed is: ");
            System.out.println(msg);
        } while(!msg.equals("dne"));

        stk.close();
    }
}


