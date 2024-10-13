package org.example;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(removeCharacterV2('a', "appearance"));
    }

    /*
    char String -> String
    removes the given char from the given string
    'p' "program" -> "rogram"
    'a' "appearance" -> "ppernce"
    'h' null -> IllegalArgumentException
    'i' "" ->   IllegalArgumentException
     */

    public static String removeCharacter(char ch, String str) {
        if (str == null  || str.isBlank()) {
            throw new IllegalArgumentException("Invalid string");
        }

        return str.replaceAll(String.valueOf(ch), "");
    }

    public static String removeCharacterV2(char c, String str) {
        if (str == null  || str.isBlank()) {
            throw new IllegalArgumentException("Invalid string");
        }

        StringBuilder builder = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (ch != c) {
                builder.append(ch);
            }
        }
        return  builder.toString();
    }

}