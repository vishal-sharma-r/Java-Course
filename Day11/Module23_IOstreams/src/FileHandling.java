import java.io.File;
import java.io.FileOutputStream;

public class FileHandling {
    public static void main(String[] args) throws Exception{
        File f = new File("C:\\Users\\dell\\Desktop\\LearnJava\\Day11\\Module23_IOstreams\\temp\\data.txt");
//        System.out.println(f.isFile());
//        System.out.println(f.isDirectory());
//        f.setReadOnly();
//        FileOutputStream fos = new FileOutputStream(" C:\\Users\\dell\\Desktop\\LearnJava\\Day11\\Module23_IOstreams\\temp");

//        f.setWritable(true);
//        FileOutputStream fos = new FileOutputStream("C:\\Users\\dell\\Desktop\\LearnJava\\Day11\\Module23_IOstreams\\temp\\data.txt");
//        f.setLastModified(12345678);
        System.out.println(f.lastModified());


    }
}
