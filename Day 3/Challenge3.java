public class Challenge3 {
    public static void main(String[] args) {
        /* Removing the Special character using Regular expression */
        String str = "a!B@c#d$e%F^G&";
        str = str.replaceAll("[^a-zA-Z0-9]", " ");
        System.out.println(str);

        /* Removing the extra space b/w characters */
        String str2 = "   Hello    I   am    Jarvis   ";
        str2 = str2.replaceAll("\\s+", " ").trim();
        System.out.println(str2);

        /* Finding the number of the words in a String */

        String str3 = "Hello I am Learning Java";
        String str4[] = str3.split("\\s");
        System.out.println(str4.length);

    }
}
