package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println(concatenateStringV2("text", 3));
    }

    /*
    String int -> String
    concatenates given string given number of times
    "text" 3 -> texttexttexttext
    null     -> IllegalArgumentException
    ""       -> IllegalArgumentException
     */

    public static String concatenateString(String str, int n) {
        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException("Invalid input");
        }
        StringBuilder builder = new StringBuilder(str);

        for (int i = 1; i < n; i++) {
            builder.append(str);
        }

        return builder.toString();
    }

    // Alternative solution:

    public static String concatenateStringV2(String str, int n) {
        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException("Invalid input");
        }

        return str.repeat(n);
    }
}