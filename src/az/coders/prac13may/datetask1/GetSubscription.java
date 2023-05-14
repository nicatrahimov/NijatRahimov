package az.coders.prac13may.datetask1;
import java.time.LocalDate;

public class GetSubscription {
    public static LocalDate getSubscription(int amountMoney) {
        LocalDate localDate = LocalDate.now();
           if (amountMoney == 5) {
               return localDate.plusDays(7);
           } else if (amountMoney == 15) {
               return localDate.plusMonths(1);
           } else if (amountMoney == 25) {
               return localDate.plusMonths(2);
           } else if (amountMoney%60==0) {
               return localDate.plusYears(amountMoney/60);
           }else{
               System.out.println("Insert fixed amount please!");
               System.out.println("Current time:");
               return localDate;
           }
       }
    }