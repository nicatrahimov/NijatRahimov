package az.coders.prac13may;

import java.util.Arrays;

public class AlgorithmicTask1{
    public static void main(String[] args) {
        int[]arr = {1,2,3,3,4,5,6,6,7,8,9};
        int[]arr1={1,3,9,5,7,22,9,92};
        int[]sameNumbers=new int[arr.length];


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j]==arr[i]){

                    break;
                }
            }
        }
        System.out.println(Arrays.toString(sameNumbers));
    }
}
