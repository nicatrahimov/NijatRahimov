package az.coders.may13;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Exm2 {
    public static void main(String[] args) {
        LocalDate expireDate = LocalDate.now().plusMonths(1);
      LocalDate localDate =   expireDate.minusMonths(1).withDayOfMonth(15);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        String format = "02-02-2023";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        System.out.println(LocalDate.parse(format,dateTimeFormatter));
    }
}
