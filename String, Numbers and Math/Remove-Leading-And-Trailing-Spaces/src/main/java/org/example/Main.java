package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println(removeLeadingTrailingSpaces(" test "));
    }

    /*
    String -> String
    removes leading and trailing spaces from the given String
    " test " -> "test"
    null     -> InvalidArgumentException
     */

    public static String removeLeadingTrailingSpaces(String str) {
        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException("Invalid input");
        }

        return str.strip();
    }
}