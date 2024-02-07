import java.io.*;

class Student implements Serializable {
    public static int Data = 10;
    public transient int t;
    private int rollNo;
    private String name;
    private float avg;
    private String dept;

    public Student() {
    }

    public Student(int r, String n, float a, String d) {
        rollNo = r;
        name = n;
        avg = a;
        dept = d;
        Data = 500;
        t = 500;
    }

    @Override
    public String toString() {
        return "\nStudent Details" +
                "\n Roll " + rollNo +
                "\n Name " + rollNo +
                "\n Average " + avg +
                "\n Dept " + dept +
                "\n Data " + Data +
                "\n Transient " + t + "\n";
    }
}

public class ObjectDemo {
    /*
    public static void main(String[] args) throws  Exception {
        FileOutputStream fos  = new FileOutputStream("Serialization.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Student s = new Student(1,"Vishal",93.8f,"CSE");

        oos.writeObject(s);

        oos.close();
        fos.close();
    }

     */
    public static void main(String[] args) throws  Exception {
        FileInputStream fis  = new FileInputStream("Serialization.txt");
        ObjectInputStream oos = new ObjectInputStream(fis);

        Student s;
        s = (Student)oos.readObject();
        System.out.println(s);
        oos.close();
        fis.close();
    }
}
