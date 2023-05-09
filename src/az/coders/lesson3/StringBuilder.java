package az.coders.lesson3;

public class StringBuilder {
  public static void main(String[] args) {

      java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder("first");
        java.lang.StringBuilder stringBuilder2 = new java.lang.StringBuilder("second");

        stringBuilder.append(stringBuilder2);
        stringBuilder.append(2.3);
        System.out.println(stringBuilder);


        java.lang.StringBuilder stringBuilder1 = new java.lang.StringBuilder("Nicat");
        stringBuilder1.insert(3,"+");
        stringBuilder1.delete(0,3);
        System.out.println(stringBuilder1);

        stringBuilder1.replace(0,1,"Nic");
        System.out.println(stringBuilder1);
    }
}