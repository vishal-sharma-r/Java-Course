import java.util.*;

class Student {

    private String rollNo;
    static private int cnt = 1;

    public String generateRollNo() {
        String rn = "";
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        rn = "Univ-" + year + "-" + cnt;
        cnt++;
        return rn;
    }
    public String getRollno(){
        return rollNo;

    }

    /* Constructor */
    public Student() {
        rollNo = generateRollNo();
    }

}

public class Challenge {
    public static void main(String[] args) {
        Student sc1 = new Student();
        System.out.println(sc1.getRollno());
        Student sc2 = new Student();
        System.out.println(sc2.getRollno());

    }
}