
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try{
            try (FileOutputStream fos = new FileOutputStream("Test.txt")) {
                String str = "Learn Java Programming ";
                fos.write(str.getBytes());
                fos.write(str.getBytes(), 6, str.length() - 6);

                String str2 = "Hello World";
                byte[] b = str2.getBytes();

                for (byte x : b)
                    fos.write(x);
                fos.close();
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error: "+e);
        }
        catch (IOException e)
        {
            System.out.println("Error "+e);
        }
    }
}