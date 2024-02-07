import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStream {
    public static void main(String[] args) {
        try {
            try (FileInputStream fis = new FileInputStream("Test.txt")) {
//                byte[] b = new byte[fis.available()];
//                fis.read(b);
//                String str = new String(b);
//                System.out.println(str);

//                 Another method to read line by line

                int x;
                while((x = fis.read()) != -1)
                {
                    System.out.print((char)x);
                }
                fis.close();
            }
        }  catch (FileNotFoundException e)
        {
            System.out.println("Error: "+e);
        }
        catch (IOException e)
        {
            System.out.println("Error "+e);
        }
    }
}
