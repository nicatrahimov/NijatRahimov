package az.coders.prac;

public class Palindrome {
    public static void palindrome() {
        StringBuilder name = new StringBuilder("AsDfGhhGfdSa");
        StringBuilder scName = new StringBuilder();
        char[] chars = name.toString().toLowerCase().toCharArray();

        for (int i = chars.length - 1; i >= 0; i--) {
            scName.append((chars[i]));
        }
        System.out.println(scName);

        System.out.println(name.toString().equalsIgnoreCase(String.valueOf(scName)));
    }
}
