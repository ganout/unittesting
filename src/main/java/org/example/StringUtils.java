package org.example;

public class StringUtils {
    private static final String ALL_VOWELS = "aeiouyAEIOUY";

    /**
     * Renvoie la chaine formée par les voyelles d'une chaine de caractères
     * @return Chaine avec uniquement des voyelles
     */
    public static String vowels(String candidate) {
        String vowels = "";
        char[] letters = candidate.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (ALL_VOWELS.indexOf(letters[i]) >= 0) {
                if (!vowels.contains(Character.toString(letters[i]).toLowerCase())) {
                    vowels += letters[i];
                }
            }
        }
        return vowels;
    }
}
