public class Challenge2 {
    public static void main(String[] args) {
        int b = 101010;
        String str  = b + "";
        String s = String.valueOf(b);
        System.out.println(str);
        System.out.println(s.matches("[01]+"));

        /*Checking the date format */
        String str2= "12/10/2002";
        System.out.println(str2.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
    }
}