package az.coders.prac13may.datetask2;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Age {
    public static int getAge(String birthDate) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate localDate = LocalDate.parse(birthDate, dateTimeFormatter);
        LocalDate dateForNow = LocalDate.now();
int age;
        if (localDate.getMonth().ordinal() > dateForNow.getMonth().ordinal()) {
            age = dateForNow.minusYears(1).minusYears(localDate.getYear()).getYear();

        } else if (localDate.getMonth().ordinal() < dateForNow.getMonth().ordinal()) {
            age = dateForNow.minusYears(localDate.getYear()).getYear();

        } else {
            if (dateForNow.getDayOfMonth() < localDate.getDayOfMonth()) {
                age = dateForNow.minusYears(1).minusYears(localDate.getYear()).getYear();

            }else if(dateForNow.getDayOfMonth() > localDate.getDayOfMonth()){
               age = dateForNow.minusYears(localDate.getYear()).getYear();

            }else{
                age=dateForNow.minusYears(localDate.getYear()).getYear();
                System.out.println("Happy birthday!!!");
            }
        }
        return age;

    }
}
