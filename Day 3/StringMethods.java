

public class StringMethods {
    public static void main(String[] args){
        String str = "Java Program"; // Created in String pool
        System.out.println(str);

        String str2 = new String("JAVA"); // created in the heap
        System.out.println(str2);

        char s[] = {'J', 'A', 'V', 'A'};
        System.out.println(s);
     
        // Creating using byte array
        byte b[] = {65,66,67,68};

        String str3 = new String(b,2,1); // start from 2  and take 2 letters
        System.out.println(str3);

        /*String pool */
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);


    }
}
