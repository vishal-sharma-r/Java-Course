package Module20_Java_lang;

public class StringBuildervsStringBuffer {
    public static void main(String[] args) {
        String s1 =new String("hello");
        StringBuffer s2 = new StringBuffer("hello");
        StringBuilder s3 = new StringBuilder("hello");

        s1  = s1.concat(" world");
        s2.append(" world@");
        s3.append(" world!");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
