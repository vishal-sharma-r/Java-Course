package Module20_Java_lang;
@SuppressWarnings("All")
public class WrapperDemo {
    public static void main(String[] args) {
       Integer a = 10; // auto boxing
       Integer b = Integer.valueOf("123"); // boxing
//       System.out.println(b);
        int x =a; // auto unboxing
        int v = a.intValue(); // unboxing

        // Same with other datatypes
        Byte bb = 10;
        byte bs = 100;
        Byte bbb = Byte.valueOf(bs);

        /* Integer Wrapper*/

        int m1 =  15;
        Integer m2 = m1;
        //System.out.println(m2.equals(m1)); // true if values are equal
        //? Static methods
        Integer m3 = Integer.valueOf("123");
        Integer m4 =Integer.valueOf("101010",2);
        Integer m5 = Integer.valueOf("A7",16);

        System.out.println(m5 + " " + m4);

        /*bit count => returns number of 1 bits in 2s compliment in a binary format*/

         Integer m6 = Integer.decode("0xA98");
        System.out.println(m6);

        // String to Integer

        System.out.println(Integer.parseInt("131"));

        System.out.println(Integer.reverse(122));

        //*Float class **/
        float a1 = 12.4f;
        Float b1 = 12.4f /0;
        System.out.println(b1.isInfinite());
        System.out.println(b1 == Float.NEGATIVE_INFINITY);
        System.out.println(b1 == Float.POSITIVE_INFINITY);


    }
}
