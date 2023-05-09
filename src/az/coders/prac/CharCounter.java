package az.coders.prac;

public class CharCounter {
    public static void characterCounter() {
        String st = "Salamlar";
        char[]chars=st.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int count=0;
            for (int j = 0; j < chars.length; j++) {
                if (chars[i]==chars[j]){
                    count++;
                }
            }
            System.out.println("count of "+chars[i]+" ="+(count));
        }
    }
}
