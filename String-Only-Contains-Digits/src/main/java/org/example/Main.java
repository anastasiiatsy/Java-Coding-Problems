package org.example;


public class Main {

    public static void main(String[] args) {
        System.out.println(containsOnlyDigits("12345678"));
    }

    /*
    String -> Boolean
    produces true if the given string only contains digits
    "Test" -> false
    "123456788" -> true
    "null" -> IllegalArgumentException
    "" ->  IllegalArgumentException
     */

    public static boolean containsOnlyDigits(String str) {
        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException("Invalid string");
        }
       return str.chars()
           .mapToObj(ch -> (char) ch)
           .allMatch(ch -> Character.isDigit(ch));
        /*
        Another solution from the book:
        return !str.chars()
                   .anyMatch(n ->
                   !Character.isDigit(n));
         */
    }

    public static boolean containsOnlyDigitsV2(String str) {
        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException("Invalid string");
        }

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    // Another solution from the book using String.matches:

    public static boolean containsOnlyDigitsV3(String str) {
        return str.matches("[0-9]+");
    }

}