import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws Exception {

        Properties p = new Properties();
        /*
        p.setProperty("Brand", "Dell");
        p.setProperty("Processor", "i3");
        p.setProperty("OS", "Window");
        p.setProperty("Model", "2021");

        FileOutputStream fos = new FileOutputStream("Data.xml");
//        p.store(fos,"Properties File");
        p.storeToXML(fos, "Xml file");

          */

//        Reading  XML file after modifying
        FileInputStream fis = new FileInputStream("Data.xml");

        p.loadFromXML(fis);
        System.out.println(p);
        System.out.println(p.getProperty("Name"));

        p.load(new FileInputStream("Data.txt"));
        System.out.println(p);
    }
}

