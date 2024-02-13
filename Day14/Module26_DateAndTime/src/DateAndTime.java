import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateAndTime {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();

        System.out.println(gc.isLeapYear(2020));
        System.out.println(Calendar.MONTH);
        System.out.println(Calendar.DAY_OF_YEAR);
        System.out.println(gc.getTimeZone());
        LocalDate ld  = LocalDate.now();
        System.out.println(ld);
        Calendar cd = Calendar.getInstance();
        System.out.println(cd.getTime());

    }
}
