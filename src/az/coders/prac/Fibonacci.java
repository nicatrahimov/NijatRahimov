package az.coders.prac;

import java.util.Scanner;

public class Fibonacci {
    public static void fibonacciCheck(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Insert number");
           int number = scanner.nextInt();
            arr[i] = number;
        }
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 2) {
                if (arr[i] + arr[i + 1] == arr[i + 2]) {
                    System.out.println(true);
                } else {
                    System.out.println("These are not Fibonacci numbers");
                    break;
                }

            }
        }
    }
}
