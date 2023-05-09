package az.coders.lesson3;

import java.util.Arrays;

public class Arrayss {
    public static void main(String[] args) {
        int arr[] = new int[10];
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }


        int [][]twoDimensional={{1,2,3},{3,4,5}};
        for (int i = 0; i < twoDimensional.length; i++) {
            for (int j = 0; j < twoDimensional[i].length; j++) {
                System.out.println(twoDimensional[i][j]+" ");
            }
        }
        Arrays.toString(twoDimensional);
    }
}
