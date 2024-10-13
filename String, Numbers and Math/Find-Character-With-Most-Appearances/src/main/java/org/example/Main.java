package org.example;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Main {

    public static void main(String[] args) {
        System.out.println(findCharacterWithMostAppearancesV2("contains"));
    }
    /*
    String -> char
    finds the character with the most appearances in the given string
    "appearance" -> 'a'
    "contains" -> 'n'
    null -> IllegalArgumentException
    "" ->  IllegalArgumentException
     */

    public static char findCharacterWithMostAppearances(String str) {

        if (str == null  || str.isBlank()) {
            throw new IllegalArgumentException("Invalid string");
        }

        Map<Character, Integer> characters = new HashMap<>();

        for (char ch : str.toCharArray()) {
            characters.compute(ch, (k,v) -> v == null ? 1 : v + 1);
        }

        int maxNumOfAppearances = Collections.max(characters.values());
        char ch = 0;

        for (Character c: characters.keySet()) {
            if (characters.get(c) == maxNumOfAppearances) {
                ch = c;
            }
        }
        return ch;
    }

    // Another solution from the book:
    public static Map<Character, Long> findCharacterWithMostAppearancesV2(String str) {
        return str.chars()
                .filter(c -> Character.isWhitespace(c) == false)
                .mapToObj(c -> (char) c)
                .collect(groupingBy(c -> c, counting()))
                .entrySet()
                .stream()
                .max(comparingByValue())
                .map(p -> Map.of(p.getKey(), p.getValue()))
                .orElse(Map.of(Character.MIN_VALUE, -1L));


    }

}