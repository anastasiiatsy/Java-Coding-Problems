package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        System.out.println(areAnagrams("gram", "arm"));
    }

    /*
    String String -> Boolean
    returns true if two strings are anagrams. Meaning have the same
    characters, that can be in a different order.
    "listen" "silent" -> true
    "gram" "arm"      -> false
    null ""           -> IllegalArgumentException
    null null         -> IllegalArgumentException
    "" null           -> IllegalArgumentException
     */

    public static boolean areAnagrams(String first, String second) {

        if (first == null || second == null) {
            throw new IllegalArgumentException("Invalid string");
        }

        if (first.toLowerCase().strip().length()
                != second.toLowerCase().strip().length()) {

            return false;
        }

        char[] characters1 = first.toCharArray();
        char[] characters2 = second.toCharArray();

        Arrays.sort(characters1);
        Arrays.sort(characters2);

        return Arrays.compare(characters1, characters2) == 0;
    }
}