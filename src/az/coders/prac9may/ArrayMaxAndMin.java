package az.coders.prac9may;

import java.util.Scanner;

public class ArrayMaxAndMin {
    public static void findMaxAndMinNumber(int length) {
        int[]arr=new int[length];
        for (int i = 0; i < length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Arrayin "+(i+1)+"-ci"+" elementini daxil edin");
            arr[i]=scanner.nextInt();
        }
        int maxNumb=arr[0];
        int minNumb=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxNumb<arr[i]){
                maxNumb=arr[i];
            }if (minNumb>arr[i]){
                minNumb=arr[i];
            }
        }
        System.out.println("Max number is:"+maxNumb);
        System.out.println("Min number is:"+minNumb);
    }
}
