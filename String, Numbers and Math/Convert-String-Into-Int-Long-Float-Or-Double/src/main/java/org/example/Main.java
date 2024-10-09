package org.example;


import java.text.NumberFormat;
import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {
        System.out.println(convertStringIntoInt("922337"));
    }

    /*
    String -> Number
    converts the given String (representing a number) into int, long, float, or double
    2 -> 2
    2.58 -> 2.58
    6.7f -> 6.7
    0L -> 0
    null -> IllegalArgumentException
    "" -> IllegalArgumentException
    "String" -> ParseException
    "{!@#" -> ParseException
     */

    public static Number convertStringIntoNumber(String str) throws ParseException {
        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException("Invalid string.");
        }
        return NumberFormat.getInstance().parse(str);
    }

    /*
    String -> int
    converts the given String (representing a number) into int
    "-2147483648" -> -2147483648
    "2147483647" -> 2147483647
    null -> IllegalArgumentException
    "" -> IllegalArgumentException
    "String" -> NumberFormatException
    "{!@#" -> NumberFormatException
     */

    public static int convertStringIntoInt(String str) {
        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException("Invalid string");
        }
        int result = 0;
        try {
            result = Integer.parseInt(str);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input.");
        }
        return result;
    }

    /*
    String -> long
    converts the given String (representing a number) into long
    "-9223372036854775808" -> -9223372036854775808
    "9223372036854775807" -> 9223372036854775807
    null -> IllegalArgumentException
    "" -> IllegalArgumentException
    "String" -> NumberFormatException
    "{!@#" -> NumberFormatException
     */

    public static long convertStringIntoLong(String str) {
        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException("Invalid string.");
        }
        long result = 0L;

        try {
            result = Long.parseLong(str);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input.");
        }
        return result;
    }

    /*
    String -> float
    converts the given String (representing a number) into float
    "3.402" -> 3.402
    null -> IllegalArgumentException
    "" -> IllegalArgumentException
    "String" -> NumberFormatException
    "{!@#" -> NumberFormatException
     */

    public static float convertStringIntoFloat(String str) {
        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException("Invalid string");
        }

        float result = 0f;

        try {
            result = Float.parseFloat(str);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input.");
        }
      return result;
    }

    /*
    String -> double
    converts the given String (representing a number) into double
    "1.79" -> 1.79
     null -> IllegalArgumentException
    "" -> IllegalArgumentException
    "String" -> NumberFormatException
    "{!@#" -> NumberFormatException
     */



    public static double convertStringIntoDouble(String str) {
        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException("Invalid string.");
        }
        double result = 0;
        try {
            result = Double.parseDouble(str);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input.");
        }
        return result;
    }
}