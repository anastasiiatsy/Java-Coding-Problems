package org.example;

import java.util.LinkedHashMap;

public class Main {

    private static final int
    EXTENDED_ASCII_CODES = 256;

    public static void main(String[] args) {

        System.out.println(firstNonRepeatedCharacterV2("Test"));

    }

    /* String -> Character
     returns the first character of the given String, which number of occurrences is 1
     Examples:
     "Test" -> T
     "anna" -> Character.Min_VALUE
     "Respect" -> R
     null -> InvalidArgumentException
     "" -> InvalidArgumentException
     */

    public static char firstNonRepeatedChar(String string) {
        LinkedHashMap<Character, Integer> characters =
                populateMap(string);

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (characters.get(ch) == 1) {
                return ch;
            }
        }
        return Character.MIN_VALUE;
    }

    private static LinkedHashMap<Character, Integer> populateMap(String string) {

        if (string == null || string.isBlank()) {
            throw new IllegalArgumentException("Invalid string");
        }

        LinkedHashMap<Character, Integer> characters =
                new LinkedHashMap<>();

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            characters.compute(ch, (k, v) -> (v == null) ? 1 : v + 1);
        }
        return characters;
    }

    // Another solution (Example from the book):
    public static char firstNonRepeatedCharacterV2(String string) {
        int[] flags = new int[EXTENDED_ASCII_CODES];

        for (int i = 0; i < flags.length; i++) {
            flags[i] = -1;
        }

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (flags[ch] == -1) {
                flags[ch] = i;
            } else {
                flags[ch] = -2;
            }
        }

        int position = Integer.MAX_VALUE;

        for (int i = 0; i < EXTENDED_ASCII_CODES; i++) {
            if (flags[i] >= 0) {
                position = Math.min(position, flags[i]);
            }
        }
        return position == Integer.MAX_VALUE ?
                Character.MIN_VALUE : string.charAt(position);
    }
}