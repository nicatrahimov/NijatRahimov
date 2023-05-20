package az.coders.prac13may;

public class AlgorithmicTask2 {
    public static void main(String[] args) {
        String nicat="Herkese salam 33 yasim var";
        char arr[]=nicat.toCharArray();
        int spaceCount=0;
        String str2;

        for (int spaces :
                arr) {
            if (spaces == ' '){
                spaceCount++;
            }
        }


        for (int i = 0; i < spaceCount; i++) {
            int countOfChar=0;
            for (int j = 0; j < arr.length; i++) {
                if (!(arr[i]==' ')){
                    str2= String.valueOf(arr[i]);
                    countOfChar++;
                }else {
                    
                }
            }
        }


    }
}
