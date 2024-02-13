import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

public class DatagramProject {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket(2001);
        String msg = "Vishal Sharma";
        /* Creating a datagram packet */
        DatagramPacket dp = new DatagramPacket(msg.getBytes(),msg.length(), InetAddress.getByName("localhost"),2000);
        ds.send(dp);

        /* Receiving the result from the server*/

        byte []b = new   byte[1024];
        dp = new DatagramPacket(b,1024);
        ds.receive(dp);
        msg = new String(dp.getData()).trim();
        System.out.println("From Server " + msg);
        ds.close();
    }
}

class DatagramServer{
    public static void main(String[] args) throws  Exception{
        DatagramSocket ds = new DatagramSocket(2000);
        byte []b = new byte[1024];
        DatagramPacket dp = new DatagramPacket(b,1024);
        ds.receive(dp);
        String msg = new String(dp.getData());
        System.out.println("From client "+msg);
        StringBuffer s = new StringBuffer(msg);
        s.reverse();
        msg = s.toString();
        dp = new DatagramPacket(msg.getBytes(),msg.length(), InetAddress.getByName("localhost"),2001);
        ds.send(dp);
        ds.close();
    }
}
