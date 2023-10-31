package UniqueCharacters;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        String strName = "rami♦";
        HashSet<String> str = new HashSet<>();

        for (int i = 0; i < strName.length(); i++) {
            str.add(strName.substring(i, i + 1));
        }
        if (strName.length() == str.size()) {
            System.out.println("Unique");
        } else {
            System.out.println("Unique Değil!");
        }
    }
}
