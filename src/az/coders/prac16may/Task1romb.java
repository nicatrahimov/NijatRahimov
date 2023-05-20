package az.coders.prac16may;

public class Task1romb {
    public static void main(String[] args) {
        int count=0;
        for (int i = 0; i < 5 ; i++) {
            for (int k = 4; k>=i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            count++;
            if (count==5){
                for (int j = 0; j < 5; j++) {
                    for (int k = 0; k <= j; k++) {
                        System.out.print(" ");
                    }
                    for (int k = 5; k >j ; k--) {
                        System.out.println("* ");
                    }
                    System.out.println();
                }
                    }
            }
        }

    }
