package az.coders.prac9may;

public class ArrayMaxAndMin {
    public static void main(String[] args) {
        int[]arr={71,29,63,34,12,123,3,12,115,45};
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
