import java.io.*;

public class ByteArray {
    public static void main(String[] args) throws Exception {
        /*
        byte []b = {'a','b','c','d','e'};
        ByteArrayInputStream bis = new ByteArrayInputStream(b);
        String str = new String(bis.readAllBytes());
        System.out.println(str);
//        int x;
//        while((x = bis.read())!= -1)
//        {
//            System.out.print((char) x);
//        }

         */

        /*
        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');
        bos.write('e');
        bos.write('f');

        byte []b = bos.toByteArray();
        for(byte x: b)
            System.out.print((char) x);
        bos.writeTo(new FileOutputStream("source4.txt"));

         */
        /*
        char []c = {'a','b','c','d','e'};
        CharArrayReader cc = new CharArrayReader(c);
        int x;
        while((x = cc.read()) != -1)
        {
            System.out.print((char) x);
        }
        cc.close();

         */

        CharArrayWriter cw = new CharArrayWriter(20);
        cw.write('a');
        cw.write('b');
        cw.write('c');
        cw.write('d');
        cw.write('e');
        cw.write('f');
        char[] b = cw.toCharArray();

        try (FileWriter fw = new FileWriter("source5.txt")) {
            fw.write(b);
        }





    }
}
