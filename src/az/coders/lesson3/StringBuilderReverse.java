package az.coders.lesson3;

public class StringBuilderReverse {
    public static void main(String[] args) {
        java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder("Salam");
        for (int i = stringBuilder.length()-1; i>=0; i--) {
//            System.out.println(stringBuilder.charAt(i));
           stringBuilder.append(stringBuilder.charAt(i));
        }
        System.out.println(stringBuilder);
    }
}
