import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTimeZone {
    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);
        OffsetDateTime zd1 = OffsetDateTime.now();
        System.out.println(zd1);

        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        System.out.println(df.format(dt));
    }
}
