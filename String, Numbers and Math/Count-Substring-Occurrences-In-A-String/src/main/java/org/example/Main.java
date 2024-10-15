package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        System.out.println(numOfOccurrences("helloslkhellodjladfjhello" ,
                "hello"));
    }
    /*
    String String -> Integer
    counts the occurrences of a given substring in a given string
    "dhimanman" "man"                     -> 2
    "helloslkhellodjladfjhello" "hello"   -> 3
    "" ""                                 -> IllegalArgumentException
    null null                             -> IllegalArgumentException
     */

    public static int numOfOccurrences(String string, String substring) {
        if (string == null || substring == null || string.isBlank() || substring.isBlank()) {
            throw new IllegalArgumentException("Invalid string");
        }

        String newString = string.replace(substring, "");

        int num = (string.length() - newString.length()) / substring.length();

        return num;

    }
}