import java.io.RandomAccessFile;

public class RandomAccessDemo {
    public static void main(String[] args) throws Exception {
        RandomAccessFile ra = new RandomAccessFile("data.txt", "rw");

        System.out.println((char) ra.read());
        System.out.println((char) ra.read());
        System.out.println((char) ra.read());
        ra.write('d'); // during reading file pointer also moves
        System.out.println((char) ra.read());
        // Skipping few bytes
        ra.skipBytes(3);
        System.out.println((char) ra.read());
        ra.seek(3);
        System.out.println((char) ra.read());
        System.out.println(ra.getFilePointer() );

        ra.close();
    }
}

