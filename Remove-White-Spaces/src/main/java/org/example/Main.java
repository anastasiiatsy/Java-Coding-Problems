package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println(removeWhiteSpaces(null));
    }

    /*
    String -> String
    removes all white spaces in a given String
    "Write a program" -> "Writeaprogram"
    "removes all white spaces" -> "removesallwhitespaces"
     null -> IllegalArgumentException
     "" -> IllegalArgumentException
     */

    public static String removeWhiteSpaces(String str) {
        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException("Invalid string");
        }

        return  str.replaceAll("\\s", "");
    }
}