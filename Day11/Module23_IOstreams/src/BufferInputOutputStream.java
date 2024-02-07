import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class BufferInputOutputStream {
    public static void main(String[] args) throws  Exception {

        /*
        FileInputStream fis = new FileInputStream("Test1.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());

        bis.mark(10);
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        bis.reset();
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());

        System.out.println();




//        int x;
//        while((x = bis.read()) != -1)
//        {
//            System.out.print((char)x);
//        }

        */

        // Buffer Reader
        FileReader fis = new FileReader("Test1.txt");
        BufferedReader bis = new BufferedReader(fis);
        System.out.println(bis.readLine()); // read line by lne
    }
}
