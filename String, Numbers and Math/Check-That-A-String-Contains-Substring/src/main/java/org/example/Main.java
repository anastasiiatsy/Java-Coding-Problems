package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println(containsSubstringV2("", "substring"));
    }
    /*
    String String -> Boolean
    checks if the given string contains the given substring
    "program" "gra"    -> true
    "string" "bra"     -> false
    "" ""              -> true
    "" "substring"     -> false
    "string" ""        -> false
    "string" null      -> IllegalArgumentException
    null "substring"   -> IllegalArgumentException
    null null          -> IllegalArgumentException
    "string" null      -> IllegalArgumentException
     */

    public static boolean containsSubstring(String string, String substr) {
        if (string == null || substr == null) {
            throw new IllegalArgumentException("Invalid input");
        }
        return string.contains(substr);
    }

    public static boolean containsSubstringV2(String string, String substr) {
        if (string == null || substr == null) {
            throw new IllegalArgumentException("Invalid input");
        }
        return string.indexOf(substr) != -1;
    }
}