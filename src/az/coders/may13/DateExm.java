package az.coders.may13;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateExm {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(LocalDate.of(2023,5,16), LocalTime.of(10,20,56));
        String format = localDateTime.format(DateTimeFormatter.ofPattern("dd.MMM.yy 'at' hh:mm:ss"));
        if (LocalDateTime.now().isBefore(localDateTime)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }


    }
}
