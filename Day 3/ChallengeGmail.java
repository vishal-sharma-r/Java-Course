public class ChallengeGmail {
    public static void main(String[] args) {
        String str = "example@gmail.com";

        String username = str.substring(0, str.indexOf("@"));
        String domain = str.substring(str.indexOf("@") + 1, str.length());
        System.out.println(username + " " + domain);
        // to check whether is valid gmail or not
        System.out.println(domain.startsWith("gmail.com"));
    }
}
