package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {
        System.out.println(removeDuplicateV3("generate"));
    }

    /*
    String -> String
    removes the duplicate character from the given string
    "program" -> "progam"
    "generate" -> "genrat"
     null -> IllegalArgumentException
     "" ->   IllegalArgumentException
     */

    public static String removeDuplicates(String str) {

        if (str.isBlank() || str == null) {
            throw new IllegalArgumentException("Invalid string");
        }

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (builder.indexOf(String.valueOf(ch)) == -1) {
                builder.append(ch);
            }
        }
        return builder.toString();
    }

    public static String removeDuplicatesV2(String str) {
        Set<Character> characters = new HashSet<>();
        StringBuilder builder = new StringBuilder();

        for (char ch: str.toCharArray()) {
            if (characters.add(ch)) {
                builder.append(ch);
            }
        }
        return builder.toString();
    }

    // Another solution from the book:
    public static String removeDuplicateV3(String string) {
        return Arrays.asList(string.split(""))
                .stream()
                .distinct()
                .collect(Collectors.joining());
    }
}