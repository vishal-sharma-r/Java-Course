public class RegularExpression {
    public static void main(String[] args) {
        String str = "a";
        System.out.println(str.matches("a|b"));

        String s2 = "5";
        System.out.println(s2.matches("\\w"));
        System.out.println(s2.matches("\\D"));

        String s3 = "abcdef";
        System.out.println(s3.matches("[a-z]*"));

        // Checking whether gmail is valid or not

        String gmail = "vishal12@gmail.com";
        System.out.println(gmail.matches("\\w*@gmail.*"));
    }
}
