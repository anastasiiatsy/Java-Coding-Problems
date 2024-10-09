package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    private static final String CONSONANTS =
            "BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz";
    private static final String VOWELS = "AEIOUaeiou";

    public static void main(String[] args) {
        System.out.println(countVowelsAndConsonantsV3(""));
    }

    /*
    String -> Map<String, Integer>
    counts the number of vowels and consonants in the given string.
    The program only works for the English language
    "number" -> {vowels= 2}; {consonants= 4}
    "Counting vowels and consonants" ->
    {vowels= 9}; {consonants= 18}
    null -> IllegalArgumentException
    "" -> IllegalArgumentException
     */

    public static Map<String, Integer> countVowelsAndConsonants(String str) {

        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException("Invalid string");
        }

        Map<String, Integer> result = new HashMap<>();
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            String ch = String.valueOf(str.charAt(i));
            if (VOWELS.contains(ch)) {
                vowels++;
            }
            if(CONSONANTS.contains(ch)) {
                consonants++;
            }
        }

        result.put("vowels", vowels);
        result.put("consonants", consonants);

        return result;
    }

    // Another solution from the book:

    public static Map<String, Integer> countVowelsAndConsonantsV2(String str) {
        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException("Invalid string");
        }

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (VOWELS.contains(String.valueOf(ch))) {
                vowels++;
            } else if (CONSONANTS.contains(String.valueOf(ch))) {
                consonants++;
            }
        }

        Map<String, Integer> results =
                new HashMap<>();

        results.put("vowels", vowels);
        results.put("consonants", consonants);

        return results;
    }

    public static Map<String, Long> countVowelsAndConsonantsV3(String str) {
        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException("Invalid string");
        }

        long vowels = str.chars()
                .filter(c ->
                        VOWELS.contains(String.valueOf((char) c)))
                .count();

        long consonants = str.chars()
                .filter(c ->
                        CONSONANTS.contains(String.valueOf((char) c)))
                .count();

        Map<String,Long> result = new HashMap<>();

        result.put("vowels", vowels);
        result.put("consonants", consonants);

        return result;
    }

}