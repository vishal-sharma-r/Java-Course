
public class StringMethods2 {
    public static void main(String[] args) {
        String str = "Java Program";
        /* Length of the string */
        System.out.println(str.length());
        /* toLowerCase() */
        System.out.println(str.toLowerCase());
        /* trim */
        String s2 = "    Java    ";
        System.out.println(s2.trim());

        /* Getting a substring */
        System.out.println(str.substring(2)); // start froom the second index
        System.out.println(str.substring(0, str.length() - 2));

        /* Replace A character int string */
        str = str.replace("a", "e"); // will not modify the same string gives a new string
        System.out.println(str);
        System.out.println(str.startsWith("J"));
        System.out.println(str.endsWith("m"));

        char c = str.charAt(2);
        System.out.println(c);

        int index = str.indexOf('e'); // we can also gives a string but it will look for only the starting indexOf
                                      // first character

        System.out.println(index);

        System.out.println(str.lastIndexOf("e"));

        String s3 = "Java";
        String s4 = "Java";
        System.out.println(s3.equals(s4));
        // s4 = s4.replace("ve", "rvis");
        System.out.println(s4);

        System.out.println(s3.equalsIgnoreCase(s4));

        /* compareTo */
        System.out.println(s3.compareTo(s4));

        /* Repeat method */
        s3 = s3.repeat(3);
        System.out.println(s3);
        System.out.println(s3.replaceAll("J", "h"));

        /* Contains method */
        System.out.println(s3.contains("J"));

        String s5  = String.valueOf(7);
        System.out.println(s5.getClass().getName());

    }
}
