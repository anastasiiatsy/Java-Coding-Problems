package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println(reverseString("Write a program that reverses the letters of each word."));

    }
    /*
    String -> String
    reverses words of a given string
    "word" -> "drow"
    "banana" -> "ananab"
    "Write a program that reverses the letters of each word." ->
    "etirW a margorp taht sesrever eht srettel fo hcae drow."
    null -> IllegalArgumentException
    "" -> IllegalArgumentException
     */

    public static String reverseWords(String string) {

        String[] words = populateArray(string);
        StringBuilder builder = new StringBuilder();

        for (String word : words) {
            if (word.matches("[^a-zA-Z0-9]")) {
                builder.append(word);

            } else {
                StringBuilder reversedWord =
                        new StringBuilder(word.strip()).reverse();
                builder.append(" " + reversedWord);
            }
        }

        return builder.toString();
    }

    /*
    String -> String
    reverses given string
    "Write a program that reverses the letters of each word." ->
    ".drow hcae fo srettel eht sesrever taht margorp a etirW"
    null -> IllegalArgumentException
    "" -> IllegalArgumentException
    */

    public static String reverseString(String string) {
        StringBuilder builder = new StringBuilder(string);
        return builder.reverse().toString();
    }
/*
String -> String[]
splits the string by non-alphanumeric characters
"Write a program that reverses the letters of each word." ->
["Write" "a" "program" "that" "reverses" "the" "letters" "of" "each" "word" "."]
null -> IllegalArgumentException
"" -> IllegalArgumentException
*/
    public static String[] populateArray(String string) {
        if (string == null || string.isBlank()) {
            throw new IllegalArgumentException("Invalid string");
        }
        String[] words = string.split("(?=[^a-zA-Z0-9])");

        return removeWhiteSpace(words);
    }

   /*
   String[] -> String[]
   removes white spaces in each element of the array
   " a" -> "a"
   "word " -> "word"
   null -> IllegalArgumentException
   */
    public static String[] removeWhiteSpace(String[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Invalid string");
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].strip();
        }
        return array;
    }
}