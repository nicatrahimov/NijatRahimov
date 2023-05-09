package az.coders.prac;

import java.util.Scanner;

public class clock {
    public static void clockDegree() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Saati daxil edin");
   double saat = sc.nextDouble();
        System.out.println("Deqiqeni daxil edin");
   double deqiqe = sc.nextDouble();

        double deqDerece = deqiqe*6;
        double saatDerece = 30*(deqDerece/360)+(saat-12)*30;
        double derece = (saatDerece>deqDerece) ? saatDerece-deqDerece : deqDerece-saatDerece;

        System.out.println(derece);

    }
}
