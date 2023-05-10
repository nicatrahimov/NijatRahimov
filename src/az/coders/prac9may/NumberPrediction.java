package az.coders.prac9may;

import java.util.Random;
import java.util.Scanner;

public class NumberPrediction {
    public static void main(String[] args) {
        System.out.println("Insert number from 1-10 interval");
        while (true){
            Scanner sc = new Scanner(System.in);
            Random random = new Random();
            int userNumber = sc.nextInt();
            int projNumber = random.nextInt(10);
            if (userNumber==projNumber){
                System.out.println("Your predict is true");
                break;
            }else{
                System.out.println("Try again");
            }
        }
    }
}
