import java.util.*;

class Account {
    private String accno;
    static int cnt = 0;

    private String generateAccount() {
        String acc = "";
        Calendar cal = Calendar.getInstance();
        int time = cal.get(Calendar.YEAR);

        acc = "JK-" + time + "-" + cnt;
        cnt++;
        return acc;
    }

    public Account() {
        accno = generateAccount();
    }

    public String getAccountno() {
        return accno;
    }

}

public class Challenge1 {
    public static void main(String[] args) {
        Account ac = new Account();
        System.out.println(ac.getAccountno());
    }
}
