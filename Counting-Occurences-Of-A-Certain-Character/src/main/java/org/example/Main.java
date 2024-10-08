package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println(countOccurrencesOfACharacterV3('n',"Number"));
    }

    /*
    char String -> int
    counts the occurrences of a given character in a given String (case insensitive)
    'a', "banana" -> 3
    'n', "Number" -> 1
    'b', null -> IllegalArgumentException
    '2' "123456722" -> 3
    'p', "" -> IllegalArgumentException
     */

    public static int countOccurrencesOfACharacter(char ch,
                                                       String string) {
        if (string == null || string.isBlank()) {
            throw new IllegalArgumentException("Invalid string");
        }

        int count = 0;

        for (int i = 0; i < string.length(); i++) {
            if (ch == string.toLowerCase().charAt(i)) {
                count++;
            }
        }
        return count;
    }

    /*
    Another solution:
    ch String -> long
    counts the occurrences of a given character in a given String (case insensitive)
    'a', "banana" -> 3
    'n', "Number" -> 1
    'b', null -> IllegalArgumentException
    '2' "123456722" -> 3
    'p', "" -> IllegalArgumentException
     */

    public static long countOccurrencesOfACharacterV2(char ch, String string) {

        if (string == null || string.isBlank()) {
            throw new IllegalArgumentException("Invalid string");
        }

        return string.toLowerCase()
                .chars()
                .filter(c -> c == ch)
                .count();
    }

    // Another solution from the book:

    public static int countOccurrencesOfACharacterV3(char ch, String str) {
        return str.length() -
                str.toLowerCase()
                .replace(String.valueOf(ch), "")
                .length();
    }
}