import java.io.*;

public class Challenge1 {
    public static void main(String[] args) {
        try{
//            FileInputStream fis = new FileInputStream("source1.txt");
//            FileOutputStream fos = new FileOutputStream("source2.txt");
//            FileInputStream fis2= new FileInputStream("source2.txt");
//            FileOutputStream fos2 = new FileOutputStream("Destination.txt");
//            SequenceInputStream sis = new SequenceInputStream(fis,fis2);

//            byte [] b  = new byte[fis.available()];
//            fis.read(b);
//            fos.write(b);

//            int x;
//            while((x = fis.read()) != -1)
//            {
//                char c = (char)x;
//                c = Character.toLowerCase(c);
//                fos.write(c);
//                fos2.write(c);
//            }
//            int b;
//            while((b = sis.read()) != -1)
//            {
//                fos2.write(b);
//            }
//
//
//            fis.close();
//            fos.close();
//            sis.close();
//            fis2.close();
//            fos2.close();
            FileInputStream fis1=new FileInputStream("source1.txt");
            FileInputStream fis2=new FileInputStream("source2.txt");

            FileOutputStream fos=new FileOutputStream("Destination.txt");

            SequenceInputStream sis=new SequenceInputStream(fis1,fis2);


            int b;
            while((b=sis.read())!=-1)
            {

                fos.write(b);
            }

            sis.close();
            fis1.close();
            fis2.close();
            fos.close();



        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
