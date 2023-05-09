package az.coders.prac;

import java.util.Arrays;

public class TekrarlanmayanArray {
    public static void exFive() {
        int[]arr={1,5,7,10,15};
        int[]newArr=new int[arr.length+1];
        int number=9;

        for (int i = 0,j=0; i < arr.length+1; i++) {
            if (number<arr[j]){
                newArr[i]=9;
                number=arr[arr.length-1];
            }else {
                newArr[i] = arr[j];
                j++;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
